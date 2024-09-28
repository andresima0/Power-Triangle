package br.com.local.powertrianglecalculator

import android.content.Context
import android.graphics.drawable.Drawable
import android.text.Html
import android.widget.TextView
import androidx.core.content.ContextCompat

class LocalImageGetter(val context: Context, val textView: TextView) : Html.ImageGetter {
    override fun getDrawable(source: String?): Drawable? {
        // A função getDrawable é chamada sempre que uma tag <img> for encontrada no HTML
        val resourceId = context.resources.getIdentifier(
            source?.replace(".png", ""),
            "drawable",
            context.packageName
        )
        val drawable = ContextCompat.getDrawable(context, resourceId)

        drawable?.let {
            // Definir a largura máxima da imagem de acordo com o TextView
            val textViewWidth = textView.width

            // Ajustar a largura da imagem para o tamanho do TextView
            val imageRatio = drawable.intrinsicHeight.toFloat() / drawable.intrinsicWidth.toFloat()

            // Ajustar a largura da imagem para o tamanho do TextView e a altura proporcionalmente
            val adjustedWidth = textViewWidth * 0.9 // Usa 90% da largura do TextView
            val adjustedHeight = adjustedWidth * imageRatio

            drawable.setBounds(0, 0, adjustedWidth.toInt(), adjustedHeight.toInt())
        }

        return drawable
    }
}
