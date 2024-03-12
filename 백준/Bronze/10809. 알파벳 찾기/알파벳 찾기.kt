fun main() {
    val a = readln()

    val array1 = IntArray(26)
    var b = 0
    for (i in 'a'..'z') {
        array1[b] = a.indexOf(i)
        b += 1
    }

    println(array1.joinToString(" "))
}