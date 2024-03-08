fun main() {
    val a = readln().toInt()
    for (i in 1..a) {
        val ary = readln().split(" ")
        val x = ary[0].toInt()
        val y = ary[1].toInt()
        println(x+y)
    }
}