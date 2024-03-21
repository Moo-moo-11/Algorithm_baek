class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        val box = score.size/m
        val scorearray = score.sortedDescending().joinToString("")
        for (i in 1..box) {
            answer += scorearray[i*m-1].digitToInt() * m
        }
        return answer
    }
}