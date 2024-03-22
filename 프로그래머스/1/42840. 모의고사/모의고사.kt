class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val size = answers.size
        var score1 = 0
        var score2 = 0
        var score3 = 0
        for (i in 0..size-1){
            if(answers[i] == "12345".repeat(2000).substring(0..size)[i].digitToInt()) score1++
            if(answers[i] == "21232425".repeat(1250).substring(0..size)[i].digitToInt()) score2++
            if(answers[i] == "3311224455".repeat(1000).substring(0..size)[i].digitToInt()) score3++
        }
        if (score1 >= score2) {
            if (score1 >= score3) answer += 1
        }
        if (score2 >= score1) {
            if (score2 >= score3) answer += 2
        }
        if (score3 >= score1) {
            if (score3 >= score2) answer += 3
        }
        return answer
    }
}