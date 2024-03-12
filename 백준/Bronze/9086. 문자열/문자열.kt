fun main() {
    val a = readln().toInt()

    repeat(a) {
        val b = readln()
        println("${b.first()}${b.last()}")
    }
}