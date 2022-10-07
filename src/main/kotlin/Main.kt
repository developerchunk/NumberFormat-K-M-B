import java.text.DecimalFormat
import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    val amount: Int = reader.nextInt()
    var am: Float
    val df = DecimalFormat("##.##")

    var simplify = ""

    fun simplifyAmount(amount: Int): String {
        if (abs(amount/1000000000) >= 1) {
            am = amount.toFloat() / 1000000000
            simplify = df.format(am) + "B"
        } else if (abs(amount/1000000) >= 1) {
            am = amount.toFloat() / 1000000
            simplify = df.format(am) + "M"
        } else if (abs(amount/1000) >= 1) {
            am = amount.toFloat() / 1000
            simplify = df.format(am) + "K"
        } else {
            simplify = amount.toString()
        }

        return simplify
    }

    println(simplifyAmount(amount))
}