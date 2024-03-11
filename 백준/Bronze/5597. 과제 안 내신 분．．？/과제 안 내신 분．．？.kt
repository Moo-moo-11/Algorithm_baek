fun main() {
    val list1 = MutableList(30,{i -> i + 1})
    
    repeat(28) {
        val a = readln().toInt()
        list1.remove(a)
    }

    println(list1.min())
    println(list1.max())
}