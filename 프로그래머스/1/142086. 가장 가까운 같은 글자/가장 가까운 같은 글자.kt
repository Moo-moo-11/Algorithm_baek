class Solution {
    fun solution(s: String): IntArray {
        var answer = intArrayOf()
        for (i in 0..s.length-1) {
            if (s.substring(0..i).count{ it == s[i] } == 1) answer += -1
            if (s.substring(0..i).count{ it == s[i] } >= 2) {
            answer += i - s.substring(0..i-1).lastIndexOf(s[i])
            }
        }
        return answer
    }
}