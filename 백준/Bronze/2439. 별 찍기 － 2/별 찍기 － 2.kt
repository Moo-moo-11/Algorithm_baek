fun main() {
    val numb = readln().toInt()
    for (i in 1..numb) {
        println(" ".repeat(numb-i) + "*".repeat(i))
    }
}