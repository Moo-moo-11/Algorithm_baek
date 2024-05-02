fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    
    val multiple = (a*b*c).toString()
    
    for (char in '0'..'9') {
        var count = 0
        for (num in multiple) {
            if(num == char) count++
        }
        println(count)
    }
}