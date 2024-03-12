fun main() {
    val a = readln().toInt()
    val b = readln()
    var c = 0
    for (i in 0..a-1){
        c = c + b[i].digitToInt()
    }
    println(c)
}