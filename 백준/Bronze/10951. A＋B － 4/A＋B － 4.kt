fun main() {
    while (true)
        try {
            val ary = readln().split(" ")
            val a = ary[0].toInt()
            val b = ary[1].toInt()

            println(a + b)
        } catch (e:Exception) {
            break
        }
}