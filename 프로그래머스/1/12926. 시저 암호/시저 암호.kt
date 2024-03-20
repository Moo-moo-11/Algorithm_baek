class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        for (i in s){
        var a = 32
        when {
            i.code == 32 -> a = i.code
            i.code in 65..90 -> if (i.code + n > 90) a = i.code + n - 26 else a = i.code + n
            i.code in 97..122 -> if (i.code + n > 122) a = i.code + n - 26 else a = i.code + n
        }
        answer += a.toChar()
    }
        return answer
    }
}