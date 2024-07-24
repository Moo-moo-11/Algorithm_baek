fun main() {

    val (n,m) = readln().split(" ").map { it.toInt() }

    val list = readln().split(" ").map { it.toInt() }

    var count = 0

    val deque = ArrayDeque(List<Int>(n) { it + 1 })

    for (num in list) {

        val left = deque.indexOf(num)

        val right = deque.size - left

        if (left < right) repeat(left) { deque.addLast(deque.removeFirst()); count += 1 }
        else repeat(right) { deque.addFirst(deque.removeLast()); count += 1 }

        deque.removeFirst()
    }

    println(count)

}