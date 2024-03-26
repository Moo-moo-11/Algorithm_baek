import kotlin.math.min

class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""
        for (i in '9' downTo '0') {
            answer += i.toString().repeat(min(X.count { it == i }, Y.count { it == i }))
        }
        if (answer == "") answer = "-1"
        if (answer.all{it == '0'}) answer = "0"
        return answer
    }
}