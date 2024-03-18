class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        answer = s.none {it in 'A'..'Z' || it in 'a'..'z'}
        if (s.length != 4 && s.length != 6) answer = false
        return answer
    }
}