fun main() {

    val array1 = readln().split(" ")
    val a = array1[0].reversed().toInt()
    val b = array1[1].reversed().toInt()

    if (a >= b){
        println(a)
    } else {
        println(b)
    }
}