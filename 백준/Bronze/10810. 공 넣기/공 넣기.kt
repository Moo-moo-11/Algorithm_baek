fun main() {
    val ary_0 = readln().split(" ")

    val a = ary_0[0].toInt()
    val b = ary_0[1].toInt()
    val ary = Array(a, {0})

    for (i in 1..b) {
        val ary_a = readln().split(" ")
        val x = ary_a[0].toInt()
        val y = ary_a[1].toInt()
        val z = ary_a[2].toInt()

        for (item in x-1..y-1){
            ary[item] = z
        }
    }

    println(ary.joinToString(" "))
}