fun main() {
    val ary = IntArray(9)
    for (i in 1..9) {
        val a = readln().toInt()
        ary[i-1] = a
    }

    println(ary.max())
    println(ary.indexOf(ary.max()) + 1)
}