fun main(){

    val a = readln().uppercase()

    val map = a.groupBy { it }.mapValues { it.value.size }

    val largestNumb = map.values.maxOrNull()!!

    var count = 0
    var charcter = 'A'

    map.forEach{ if(it.value == largestNumb) {count++; charcter = it.key} }

    if (count >= 2) println("?") else println(charcter)

}