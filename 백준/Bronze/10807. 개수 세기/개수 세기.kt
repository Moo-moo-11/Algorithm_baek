fun main() {
    val arr = Array(readln().toInt(), { item -> "" } )

    val arr2 = readln().split(" ")

    for (i in 0..arr2.size - 1){
        arr[i] = arr2[i]
    }

    val x = readln()

    val a = arr.count({it.equals(x)})

    println(a)
}