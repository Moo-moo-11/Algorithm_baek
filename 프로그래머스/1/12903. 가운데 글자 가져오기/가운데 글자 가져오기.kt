class Solution {
    fun solution(s: String): String {
        var answer = ""
        if (s.length%2 == 1) answer = s[s.length/2].toString()
        else answer = s.substring(s.length/2-1,s.length/2+1)
        return answer
    }
}