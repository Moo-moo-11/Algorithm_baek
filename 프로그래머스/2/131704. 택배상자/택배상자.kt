class Solution {
    fun solution(order: IntArray): Int {
        var answer: Int = 0
        val main = ArrayDeque<Int>()
        val sub = ArrayDeque<Int>()
        var current = 0
        
        for (i in order.size downTo 1) {
            main.add(i)
        }
        
        while(true) {
            if (current == order.size) break
            if (main.lastOrNull() == order[current]) {
                main.removeLast()
                current += 1
                answer += 1
            } else if (sub.lastOrNull() == order[current]) {
                sub.removeLast()
                current += 1
                answer += 1
            } else {
                if (main.isEmpty()) break
                sub.add(main.removeLast())
            }
        }
        
        return answer
    }
}