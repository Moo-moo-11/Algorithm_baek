fun main() {
    val set1 = mutableSetOf<Int>()

    repeat(10) {
        val a = readln().toInt()
        val b = a % 42
        set1.add(b)
    }

    println(set1.size)
}