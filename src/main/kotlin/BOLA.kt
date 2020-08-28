package BOLA
import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    var jari: Float
    var volumepi: Float
    print("Input Jari jari : ")
    jari = reader.nextFloat()
    volumepi = ((jari * jari * jari * 22 * 4 / 7) / 3)
    val s = String.format("%.2f", volumepi)
    println("----------------------")
    print("Result Volume Bola = $s")
}