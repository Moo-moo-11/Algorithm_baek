class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = IntArray(score.size)
        for (i in 0..score.size-1) {
            if (k < i+1) answer[i] = score.sliceArray(0..i).sortedArrayDescending()[k-1]
            else answer[i] = score.sliceArray(0..i).minOrNull()!!
        }
        return answer
    }
}