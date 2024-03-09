fun main() {
    while(true) {
        val ary = readln().split(" ")
        val a = ary[0].toInt()
        val b = ary[1].toInt()

        if (a == 0 && b == 0){
            break
        }

        println(a + b)
    }
}