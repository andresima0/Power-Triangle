package br.com.local.powertrianglecalculator

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.TextView

class InfoActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info2)

        val textView: TextView = findViewById(R.id.textViewInfo2)

        val htmlText = """
        <h3 style="text-align: center;">O Aplicativo</h3>
        <br>

        <p><strong>Power-Triangle</strong> é um aplicativo Android desenvolvido para calcular as três potências fundamentais em circuitos de corrente alternada (CA): <strong>potência ativa (P)</strong>, <strong>potência reativa (Q)</strong> e <strong>potência aparente (S)</strong>, baseando-se no triângulo das potências elétricas.</p>

        <br>
        <h3 style="text-align: center;">Funcionalidades</h3>
        <br>

        <ul>
            <li><strong>Cálculo da Potência Ativa (P)</strong>: Com base na potência reativa (Q) e na potência aparente (S), o aplicativo calcula a potência ativa, que é a potência útil consumida pelo circuito.</li>
            <li><strong>Cálculo da Potência Reativa (Q)</strong>: Usando a potência ativa (P) e a potência aparente (S), o aplicativo calcula a potência reativa, responsável pela energia armazenada no circuito.</li>
            <li><strong>Cálculo da Potência Aparente (S)</strong>: A partir dos valores de potência ativa (P) e reativa (Q), o aplicativo determina a potência aparente, que representa a potência total fornecida ao circuito.</li>
            <li><strong>Cálculo do Fator de Potência (FP)</strong>: O fator de potência é automaticamente calculado para cada um dos cenários, ajudando a identificar a eficiência do circuito.</li>
        </ul>

        <br>
        <h3 style="text-align: center;">Interface do Usuário</h3>
        <br>

        <ul>
            <li><strong>Spinner para Seleção de Cálculo</strong>: O usuário pode escolher qual tipo de potência deseja calcular (ativa, reativa ou aparente).</li>
            <li><strong>Campos de Entrada Dinâmicos</strong>: Os campos de entrada se adaptam conforme a seleção do cálculo, solicitando os valores necessários para realizar a operação.</li>
            <li><strong>Botões de Ação</strong>: Dois botões, "Calcular" e "Limpar", facilitam a execução dos cálculos e a reinicialização dos campos.</li>
            <li><strong>Gradiente de Cores Personalizado</strong>: A interface apresenta botões e cards estilizados com um gradiente em tons de verde, proporcionando uma experiência visual agradável.</li>
        </ul>

        <br>
        <h3 style="text-align: center;">Como Funciona</h3>
        <br>

        <ol>
            <li>Selecione o tipo de cálculo que deseja realizar (potência ativa, reativa ou aparente).</li>
            <li>Insira os valores solicitados nos campos de entrada.</li>
            <li>Pressione o botão <strong>"Calcular"</strong> para visualizar o resultado e o fator de potência correspondente.</li>
            <li>Para realizar novos cálculos, pressione o botão <strong>"Limpar"</strong> e insira novos valores.</li>
        </ol>
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
                    textView.text = Html.fromHtml(htmlText, LocalImageGetter(this, textView), null)
                }
            }
        }

        // Botão para voltar para InfoActivity
        val buttonBack: Button = findViewById(R.id.button_back2)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}