fun main() {
    val ary = readln().split(" ")
    val a = ary[0].toInt()
    val b = ary[1].toInt()

    if (a>b) {
        println(">")
    } else if (a<b){
        println("<")
    } else {
        println("==")
    }
}