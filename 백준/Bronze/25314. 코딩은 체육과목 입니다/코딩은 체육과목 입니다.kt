fun main() {
    val a = readln().toInt()
    val b = a / 4
    var c = "int"
    for (i in 1..b) {
        c = "long " + c
    }
    println(c)
}