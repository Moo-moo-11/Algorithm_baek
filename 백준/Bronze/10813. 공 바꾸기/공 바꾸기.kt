fun main() {
    val array0 = readln().split(" ")

    val a = array0[0].toInt()
    val b = array0[1].toInt()
    val array1 = Array(a, {i -> i + 1})

    for (i in 1..b) {
        val ary_a = readln().split(" ")
        val x = ary_a[0].toInt() - 1
        val y = ary_a[1].toInt() - 1

        val d = array1[x]
        val e = array1[y]

        array1[x] = e
        array1[y] = d
    }

    println(array1.joinToString(" "))
}