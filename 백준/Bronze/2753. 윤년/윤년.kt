fun main() {
    val numb = readln().toInt()

    if (((numb % 4 == 0) && (numb % 100 != 0)) || (numb % 400 == 0)) {
        println(1)
    } else {
        println(0)
    }
}