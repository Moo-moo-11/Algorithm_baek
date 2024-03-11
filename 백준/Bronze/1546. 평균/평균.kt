fun main() {
    val n = readln().toInt()

    val array1 = readln().split(" ")
    val array2 = DoubleArray(n)

    for (i in 0..n-1) {
        val a = array1[i].toDouble()
        array2[i] = a
    }

    val max = array2.max()

    for (i in 0..n-1) {
        val b = array2[i]
        array2[i] = b/max * 100
    }

    println(array2.average())
}