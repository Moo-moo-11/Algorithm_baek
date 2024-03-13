fun main() {

    val a = readln().toInt()

    repeat(a) {
        val array1 = readln().split(" ")
        val b = array1[0].toInt()
        val c = array1[1]
        val d = c.length

        var answer = array1[1][0].toString().repeat(b)

        for (i in 1..d-1) {
            answer = answer + array1[1][i].toString().repeat(b)
        }

        println(answer)
    }
}