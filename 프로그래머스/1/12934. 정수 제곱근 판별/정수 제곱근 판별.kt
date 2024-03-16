class Solution {
    fun solution(n: Long): Long {
        var answer: Long = -1
        var a: Long = 1
        while (a*a <= n) {
            if (a*a == n) {
                answer = (a+1)*(a+1)
            }
            a++
        }
        return answer
    }
}