fun main() {
    val ary = readln().split(" ")
    val a = ary[0].toInt()
    val b = ary[1].toInt()
    val c = ary[2].toInt()

    if ((a==b) && (b==c)) {
        println(10000+(a*1000))
    } else if ((a==b) && (b!=c)) {
        println(1000+(a*100))
    } else if ((a==c) && (c!=b)) {
        println(1000 + (a * 100))
    } else if ((b==c) && (b!=a)) {
        println(1000 + (b * 100))
    } else {
        val max_numb = ary.max().toInt()
        println(max_numb*100)
    }

}