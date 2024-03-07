fun main() {
    val ary = readln().split(" ")
    val h = ary[0].toInt()
    val m = ary[1].toInt()

    if (m - 45 >= 0){
        println("$h ${m-45}")
    } else {
        if (h - 1 >= 0){
            println("${h-1} ${m+15}")
        } else {
            println("23 ${m+15}")
        }
    }
}