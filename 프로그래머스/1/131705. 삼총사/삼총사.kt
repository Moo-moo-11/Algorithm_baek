class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        for (i in 0..number.size-1) {
            for (x in i+1..number.size-1) {
                for (y in x+1..number.size-1) {
                    if (number[i] + number[x] + number[y] == 0) answer += 1
                }
            }
        }
        return answer
    }
}