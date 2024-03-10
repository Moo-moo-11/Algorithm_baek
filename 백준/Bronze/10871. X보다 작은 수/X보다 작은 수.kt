fun main() {
    val ary = readln().split(" ")

    val a = ary[0].toInt()
    val b = ary[1].toInt()

    val arry = IntArray(a)
    val arry_2 = readln().split(" ")
    for (i in 0..arry_2.size-1) {
        val x = arry_2[i].toString().toInt()
        arry[i] = x
    }

    val list1 = mutableListOf<Int>()

    for (i in arry) {
        if (i < b){
            list1.add((i))
        }
    }

    var str:String = list1[0].toString()
    for (i in 1..list1.size-1) {
        str = str + " ${list1[i]}"
    }
    println(str)
}