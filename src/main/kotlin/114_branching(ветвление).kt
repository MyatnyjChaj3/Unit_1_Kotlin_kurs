import kotlin.math.max

// условное выражение if
fun main() {
    BlockIfElse()
}

fun BlockIfElse(){
    println("a = ")
    val a = readln().toInt()
    println("b = ")
    val b = readln().toInt()

    var max1: Int          //выражения в max1 и max2 идентичны
    if (a<b) {
        max1 = a
        println(max1)
    }
    else
        max1 = b

    val max2 = if (a < b) a else b
}

// Условное выражение when

fun BlockWhen(){

    println("x = ")
    val x = readln().toInt()

    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        3, 4 -> print("x == 3 or x == 4")

        in 1..10 -> print("x is in the range") //in 1..10
        !in 10..20 -> print("x is outside the range")

        else -> { // обратите внимание на блок
            print("x is neither 1 nor 2")
        }
    }

    println("время дня в часах: ")
    val hourOfDay = readln().toInt()
    val timeOfDay: String
    timeOfDay = when (hourOfDay) {
        0, 1, 2, 3, 4, 5 -> "Early morning"
        6, 7, 8, 9, 10, 11 -> "Morning"
        12, 13, 14, 15, 16 -> "Afternoon"
        17, 18, 19 -> "Evening"
        20, 21, 22, 23 -> "Late evening"
        else -> "Invalid"
    }
    println(timeOfDay)
}