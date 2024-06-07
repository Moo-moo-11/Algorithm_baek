class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer = my_string
        for (query in queries) {
            val sb = StringBuilder()
            for (i in 0..query[0]-1) {
                sb.append(answer[i])
            }
            for (j in (query[0]..query[1]).reversed()) {
                sb.append(answer[j])
            }
            for (k in (query[1]+1)..answer.length-1) {
                sb.append(answer[k])
            }
            answer = String(sb)
        }
        return answer
    }
}