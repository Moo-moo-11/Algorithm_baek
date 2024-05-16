class Solution {
    fun solution(new_id: String): String {
        var answer: String
        answer = new_id.lowercase()
        answer = """[^\w\d\-\_\.]""".toRegex().replace(answer,"")
        answer = """\.\.+""".toRegex().replace(answer, ".")
        answer = """^\.""".toRegex().replace(answer, "")
        if (answer == "") answer = "a"
        if (answer.length >= 16) answer = answer.substring(0..14)
        answer = """\.$""".toRegex().replace(answer, "")
        if (answer.length <= 2) {
            while (true) {
                answer += answer.last()
                if(answer.length == 3) break
            }
        }
        return answer
    }
}