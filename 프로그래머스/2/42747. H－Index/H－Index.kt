class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        for (i in citations.size downTo 0) {
            if (citations.filter {it >= i}.size >= i) {
                answer = i
                break
            }
        }
        return answer
    }
}