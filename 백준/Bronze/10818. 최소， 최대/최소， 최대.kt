fun main() {
    val a = readln().toInt()
    val ary = readln().split(" ")
    val b = IntArray(a)

    for (i in 0..ary.size-1) {
        b[i] = ary[i].toString().toInt()
    }

    println("${b.min()} ${b.max()}")
}