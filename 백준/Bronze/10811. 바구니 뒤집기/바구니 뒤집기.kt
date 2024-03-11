fun main() {
    val array1 = readln().split(" ")
    val a = array1[0].toInt()
    val b = array1[1].toInt()

    val list1 = MutableList(a,{i -> i+1})

    repeat(b) {
        val array2 = readln().split(" ")
        val x = array2[0].toInt() - 1
        val y = array2[1].toInt() - 1

        val list2 = list1.subList(x,y+1).reversed()

        for (i in 0..list2.size-1) {
            list1[x+i] = list2[i]
        }
    }

    println(list1.joinToString(" "))
}