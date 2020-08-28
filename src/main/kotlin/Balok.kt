package Balok

import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    val panjang:Double
    val lebar:Double
    val tinggi:Double
    val volume : Double

    print("Input Panjang : ")
    panjang = reader.nextDouble()

    print("Input Lebar : ")
    lebar = reader.nextDouble()

    print("Input Tinggi : ")
    tinggi = reader.nextDouble()

    volume = hitungVolume(panjang,lebar, tinggi)
    val s = String.format("%.2f", volume)
    println("----------------------")
    print("Result Volume Balok = $s")

}
fun hitungVolume(p: Double, l:Double, t:Double): Double {
    return p * l * t
}