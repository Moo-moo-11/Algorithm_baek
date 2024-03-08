fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    var total = 0
    for (i in 1..b) {
        val ary = readln().split(" ")
        val c = ary[0].toInt()
        val d = ary[1].toInt()
        total = total + (c * d)
    }
    if (a == total) {
        println("Yes")
    } else {
        println("No")
    }
}