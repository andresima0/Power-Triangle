package br.com.local.powertrianglecalculator

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow
import kotlin.math.sqrt
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerCalculation: Spinner
    private lateinit var editTextValue1: EditText
    private lateinit var editTextValue2: EditText
    private lateinit var buttonCalculate: Button
    private lateinit var buttonClear: Button
    private lateinit var buttonInfo: Button // Adicionando o botão de informação
    private lateinit var textViewResult: TextView
    private lateinit var labelValue1: TextView
    private lateinit var labelValue2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar os componentes da interface
        spinnerCalculation = findViewById(R.id.spinnerCalculation)
        editTextValue1 = findViewById(R.id.editTextValue1)
        editTextValue2 = findViewById(R.id.editTextValue2)
        buttonCalculate = findViewById(R.id.buttonCalculate)
        buttonClear = findViewById(R.id.buttonClear)
        buttonInfo = findViewById(R.id.button_info) // Inicializando o botão de informação
        textViewResult = findViewById(R.id.textViewResult)
        labelValue1 = findViewById(R.id.labelValue1)
        labelValue2 = findViewById(R.id.labelValue2)

        // Definir as opções do Spinner programaticamente
        val options = arrayOf(
            "Calcular Potência Ativa (P)",
            "Calcular Potência Reativa (Q)",
            "Calcular Potência Aparente (S)"
        )

        // Criar um ArrayAdapter para o Spinner
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            options
        )

        // Definir o layout para a lista de opções do Spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Associar o adaptador ao Spinner
        spinnerCalculation.adapter = adapter

        // Listener para o Spinner
        spinnerCalculation.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                updateInputHints(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        // Listener para o botão de calcular
        buttonCalculate.setOnClickListener {
            calculate()
        }

        // Listener para o botão de limpar
        buttonClear.setOnClickListener {
            clearFields()
        }

        // Listener para o botão de informação
        buttonInfo.setOnClickListener {
            // Abrir a InfoActivity
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }
    }

    // Atualiza os rótulos e dicas dos campos de entrada com base no cálculo selecionado
    private fun updateInputHints(position: Int) {
        when (position) {
            0 -> { // Calcular Potência Ativa (P)
                labelValue1.text = "Potência Reativa (Q) em VAR"
                labelValue2.text = "Potência Aparente (S) em VA"
            }

            1 -> { // Calcular Potência Reativa (Q)
                labelValue1.text = "Potência Ativa (P) em W"
                labelValue2.text = "Potência Aparente (S) em VA"
            }

            2 -> { // Calcular Potência Aparente (S)
                labelValue1.text = "Potência Ativa (P) em W"
                labelValue2.text = "Potência Reativa (Q) em VAR"
            }
        }
        clearFields() // Limpar os campos ao mudar a opção de cálculo
    }

    // Realiza o cálculo de acordo com a seleção
    private fun calculate() {
        val position = spinnerCalculation.selectedItemPosition

        // Obter os valores inseridos
        val value1Text = editTextValue1.text.toString()
        val value2Text = editTextValue2.text.toString()

        if (value1Text.isEmpty() || value2Text.isEmpty()) {
            Toast.makeText(this, "Por favor, insira ambos os valores.", Toast.LENGTH_SHORT).show()
            return
        }

        val value1 = value1Text.toDoubleOrNull()
        val value2 = value2Text.toDoubleOrNull()

        if (value1 == null || value2 == null) {
            Toast.makeText(this, "Entrada inválida. Insira valores numéricos.", Toast.LENGTH_SHORT)
                .show()
            return
        }

        when (position) {
            0 -> { // Calcular Potência Ativa (P)
                val q = value1
                val s = value2
                val sSquared = s.pow(2)
                val qSquared = q.pow(2)
                if (sSquared < qSquared) {
                    textViewResult.text = "Valores inválidos. S deve ser maior que Q."
                    return
                }
                val p = sqrt(sSquared - qSquared)
                val fp = p / s // Calcular o Fator de Potência
                textViewResult.text =
                    "Potência Ativa (P): %.2f W\nFator de Potência (FP): %.2f".format(p, fp)
            }

            1 -> { // Calcular Potência Reativa (Q)
                val p = value1
                val s = value2
                val sSquared = s.pow(2)
                val pSquared = p.pow(2)
                if (sSquared < pSquared) {
                    textViewResult.text = "Valores inválidos. S deve ser maior que P."
                    return
                }
                val q = sqrt(sSquared - pSquared)
                val fp = p / s // Calcular o Fator de Potência
                textViewResult.text =
                    "Potência Reativa (Q): %.2f VAR\nFator de Potência (FP): %.2f".format(q, fp)
            }

            2 -> { // Calcular Potência Aparente (S)
                val p = value1
                val q = value2
                val s = sqrt(p.pow(2) + q.pow(2))
                val fp = p / s // Calcular o Fator de Potência
                textViewResult.text =
                    "Potência Aparente (S): %.2f VA\nFator de Potência (FP): %.2f".format(s, fp)
            }
        }
    }

    // Função para limpar os campos de entrada e o resultado
    private fun clearFields() {
        editTextValue1.text.clear()
        editTextValue2.text.clear()
        textViewResult.text = "Resultado:"
    }
}
