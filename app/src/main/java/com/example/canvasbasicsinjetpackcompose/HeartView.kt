package com.example.canvasbasicsinjetpackcompose
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class HeartView(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {

    private val paint = Paint().apply {
        color = Color.YELLOW // Couleur du cœur
        style = Paint.Style.FILL // Style de remplissage
        isAntiAlias = true // Lissage des bords
    }

    private val path = Path()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Dimensions du cœur
        val centerX = width / 2f
        val centerY = height / 2f
        val heartWidth = 300f
        val heartHeight = 400f

        // Début du chemin
        path.reset()
        path.moveTo(centerX, centerY + heartHeight / 4)

        // Partie gauche du cœur
        path.cubicTo(
            centerX - heartWidth, centerY - heartHeight / 2, // Point de contrôle 1
            centerX - heartWidth, centerY + heartHeight / 2, // Point de contrôle 2
            centerX, centerY + heartHeight // Point de fin
        )

        // Partie droite du cœur
        path.cubicTo(
            centerX + heartWidth, centerY + heartHeight / 2, // Point de contrôle 1
            centerX + heartWidth, centerY - heartHeight / 2, // Point de contrôle 2
            centerX, centerY + heartHeight / 4 // Retour au point de départ
        )

        // Dessiner le chemin
        canvas.drawPath(path, paint)
    }

}
class CircleView(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {

    private val paint = Paint().apply {
        color = Color.BLUE // Couleur du cercle
        style = Paint.Style.
        FILL // Style de remplissage
        isAntiAlias = true // Lissage des bords pour un cercle plus net
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Centre du cercle
        val centerX = width / 2f
        val centerY = height / 2f

        // Rayon du cercle
        val radius = Math.min(width, height) / 4f

        // Dessiner le cercle
        canvas.drawCircle(centerX, centerY, radius, paint)
    }
}
