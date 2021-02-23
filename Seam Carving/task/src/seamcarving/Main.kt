package seamcarving

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO


fun drawXImage(width: Int, height: Int): BufferedImage {
    val image = BufferedImage(width,height,BufferedImage.TYPE_INT_RGB)
    val g = image.createGraphics()
    g.background = Color.BLACK
    g.paint = Color.RED
    g.drawLine(0,0,width - 1,height - 1)
    g.drawLine(0,height - 1,width - 1,0)
    return image
}


fun main() {
    println("Enter rectangle width:")
    val width = readLine()!!.toInt()
    println("Enter rectangle height:")
    val height = readLine()!!.toInt()
    println("Enter output image name:")
    val filename = readLine()!!
    val image = drawXImage(width,height)
    ImageIO.write(image,"PNG", File(filename))
}
