fun main() {
    val a = readln().toInt()
    val b = readln()
    val b_0 = b.toInt()
    for (i in 2 downTo 0) {
        println(a*(b[i].toString().toInt()))
    }
    println(a*b_0)
}