fun main(args: Array<String>) {
    val s1 = readLine()!!
    var str = StringBuilder()
    
    for (i in s1) {
        if (i in 'a'..'z') {
            str.append(i.uppercase())
        } else {
            str.append(i.lowercase())
        }
    }
    
    println(String(str))
}