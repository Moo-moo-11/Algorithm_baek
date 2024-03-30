class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        val s_list = s.toCharArray().map { it.code }
        val skip_list = skip.toCharArray().map { it.code }
        for (i in s_list) {
            var count = 0
            var i_step = i
            while (count != index) {
                i_step++
                if (i_step > 122) i_step = 97
                if (i_step in skip_list) continue
                count++
            }
            answer += i_step.toChar()
        }
        return answer
    }
}