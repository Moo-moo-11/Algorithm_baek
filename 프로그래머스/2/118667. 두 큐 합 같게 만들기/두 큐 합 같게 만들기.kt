class Solution {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        val que1 = ArrayDeque(queue1.toList())
        val que2 = ArrayDeque(queue2.toList())
        val max = (que1.size + que2.size) * 2
        
        var sum1 = que1.sumOf { it.toLong() }
        var sum2 = que2.sumOf { it.toLong() }

        var answer = 0
        while (true) {
            if (max < answer) { answer = -1; break }
            
            if (sum1 > sum2) {
                val int = que1.removeFirst()
                que2.add(int)
                sum1 -= int
                sum2 += int
            } else if (sum1 < sum2) {
                val int = que2.removeFirst()
                que1.add(int)
                sum1 += int
                sum2 -= int
            } else {
                break
            }
            answer++
        }
        return answer
    }
}