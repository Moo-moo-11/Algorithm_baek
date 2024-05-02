fun main() {
    val input = readln()
    
    val a = if (input.length == 1) 0 else input[0].digitToInt()
    val b = if (input.length == 1) input[0].digitToInt() else input[1].digitToInt()
    
    var count = 0
    
    var x = a
    var y = b
    
    while(true) {
        val z = y
        y = (x + y) % 10
        x = z
        count++
        
        if (x == a && y == b) break
    }
    
    println(count)
}