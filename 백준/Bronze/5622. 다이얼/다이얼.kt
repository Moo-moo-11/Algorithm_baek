fun main() {

    val a = readln()
    var c = 0

    for (i in 0..a.length-1){

        val b = a[i]

        when (b){
            'A','B','C' -> c += 3
            'D','E','F' -> c += 4
            'G','H','I' -> c += 5
            'J','K','L' -> c += 6
            'M','N','O' -> c += 7
            'P','Q','R','S' -> c += 8
            'T','U','V' -> c += 9
            'W','X','Y','Z' -> c += 10
        }
    }
    println(c)
}