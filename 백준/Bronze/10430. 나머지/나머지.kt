fun main() {
    val ary = readln().split(" ")
    val a = ary[0].toInt()
    val b = ary[1].toInt()
    val c = ary[2].toInt()
    println((a+b)%c)
    println(((a%c)+(b%c))%c)
    println((a*b)%c)
    println(((a%c)*(b%c))%c)
}