class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        answer = (((1 + (n/2)) * (n/2))/2) * 2
        return answer
    }
}