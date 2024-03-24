import kotlin.math.*

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for (i in 1..number) {
            var divisor = 0
            for (x in 1..floor(sqrt(i.toDouble())).toInt()) {
                if(i%x == 0) {
                    if(i/x == x) divisor++
                    else divisor += 2
                }
            }
            if(divisor > limit) answer += power
            else answer += divisor
        }
        return answer
        }
}