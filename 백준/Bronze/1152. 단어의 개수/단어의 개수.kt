fun main() {

    val a = readln().trim()

    if (a == "") {
        println(0)
    } else {
        val b = a.split(" ")
        println(b.size)
    }
}