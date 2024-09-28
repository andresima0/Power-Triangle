package br.com.local.powertrianglecalculator

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val textView: TextView = findViewById(R.id.textViewInfo)

        val htmlText = """
            <h3 style="text-align: center;">Visão Geral</h3>
            <br>
            <p style="text-align: justify;">O <strong>Triângulo das Potências</strong> é uma ferramenta que ilustra a relação entre três tipos de potências em sistemas de corrente alternada (CA): <strong>potência ativa (P)</strong>, <strong>potência reativa (Q)</strong> e <strong>potência aparente (S)</strong>. Essas potências se relacionam vetorialmente e ajudam a entender como elas interagem no sistema elétrico.</p>
            <br>
            <h3 style="text-align: center;">Tipos de Potências</h3>
            <br>
            <ol style="text-align: justify;">
                <li><strong>Potência Ativa (P):</strong> Medida em watts (W), é a potência que realiza trabalho útil, como movimentar motores ou gerar calor.</li>
                <li><strong>Potência Reativa (Q):</strong> Medida em volt-ampères reativos (VAR), está associada à energia armazenada em elementos como indutores e capacitores.</li>
                <li><strong>Potência Aparente (S):</strong> Medida em volt-ampères (VA), é a combinação de P e Q, representando a potência total fornecida ao sistema.</li>
            </ol>
            <br>
            <h3 style="text-align: center;">Relação Matemática</h3>
            <br>
            <p style="text-align: justify;">As potências se relacionam pela fórmula:</p>
            <br>
            <p style="text-align: center;"><strong>S² = P² + Q²</strong></p>
            <br>
            <h3 style="text-align: center;">Fator de Potência (FP)</h3>
            <br>
            <p style="text-align: justify;">O <strong>Fator de Potência (FP)</strong> é a eficiência do sistema e é calculado por:</p>
            <br>
            <p style="text-align: center;"><strong>FP = P / S</strong></p>
            <br>
            <p style="text-align: justify;">Um valor de FP igual a 1 indica eficiência máxima, enquanto valores menores indicam perdas devido à potência reativa.</p>
            <br>
            <h3 style="text-align: center;">Representação Gráfica</h3>
            <br>
            <p style="text-align: justify;">Graficamente, o triângulo das potências pode ser representado da seguinte forma:</p>
            <p align="center"><img src='@drawable/powertriangle.png' alt='powertriangle' width="300"/></p>
            <br>
            <ul style="text-align: justify;">
                <li>O cateto horizontal representa a <strong>potência ativa (P)</strong>.</li>
                <li>O cateto vertical representa a <strong>potência reativa (Q)</strong>.</li>
                <li>A hipotenusa representa a <strong>potência aparente (S)</strong>.</li>
            </ul>
            <br>
            <p style="text-align: justify;">A tangente do ângulo &theta;, entre a potência ativa e a aparente, indica a razão entre a potência reativa e a ativa:</p>
            <br>
            <p style="text-align: center;"><strong>tan(&theta;) = Q / P</strong></p>
            <br>
            <p style="text-align: justify;">E o cosseno de &theta; corresponde ao fator de potência:</p>
            <br>
            <p style="text-align: center;"><strong>cos(&theta;) = FP</strong></p>
            <br>
            <h3 style="text-align: center;">Exemplo de Aplicação</h3>
            <br>
            <p style="text-align: justify;">Se um sistema possui 300 W de potência ativa e 400 VAR de potência reativa, a potência aparente será:</p>
            <br>
            <p style="text-align: center;"><strong>S = √(300² + 400²) = 500 VA</strong></p>
            <br>
            <p style="text-align: justify;">E o fator de potência será:</p>
            <br>
            <p style="text-align: center;"><strong>FP = 300 / 500 = 0,6</strong></p>
        """.trimIndent()

        // Garantir que o TextView tenha a largura definida antes de ajustar a imagem
        textView.viewTreeObserver.addOnGlobalLayoutListener {
            if (textView.width > 0) {
                // Usar Html.fromHtml com o ImageGetter que ajusta a largura da imagem
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    textView.text = Html.fromHtml(
                        htmlText,
                        Html.FROM_HTML_MODE_COMPACT,
                        LocalImageGetter(this, textView),
                        null
                    )
                } else {
                    @Suppress("DEPRECATION")
                    textView.text = Html.fromHtml(
                        htmlText,
                        LocalImageGetter(this, textView),
                        null
                    )
                }
            }
        }

        // Botão "Voltar" para MainActivity
        val buttonBack: Button = findViewById(R.id.button_back1)
        buttonBack.setOnClickListener {
            finish() // Fecha a InfoActivity e retorna para a MainActivity
        }

        // Botão "Próximo" para InfoActivity2
        val buttonNext: Button = findViewById(R.id.button_next)
        buttonNext.setOnClickListener {
            // Navegar para InfoActivity2
            val intent = Intent(this, InfoActivity2::class.java)
            startActivity(intent)
        }
    }
}