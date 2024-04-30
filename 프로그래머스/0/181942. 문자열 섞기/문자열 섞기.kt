class Solution {
    fun solution(str1: String, str2: String): String {
        val answer = StringBuilder()
        for (i in 0..str1.length-1) {
            answer.append(str1[i])
            answer.append(str2[i])
        }
        return String(answer)
    }
}