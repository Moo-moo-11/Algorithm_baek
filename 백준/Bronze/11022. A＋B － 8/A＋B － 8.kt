fun main() {
    val numb = readln().toInt()
    for (i in 1..numb) {
        val ary = readln().split(" ")
        val a = ary[0].toInt()
        val b = ary[1].toInt()
        println("Case #$i: $a + $b = ${a+b}")
    }
}