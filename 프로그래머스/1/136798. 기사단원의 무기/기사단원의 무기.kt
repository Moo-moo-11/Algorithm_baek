import kotlin.math.*

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for (i in 1..number) {
            var divisor_numb = 0
            for (x in 1..round(sqrt(i.toDouble())).toInt()) {
                if(i%x == 0) {
                    if(i/x == x) divisor_numb++
                    else divisor_numb += 2
                }
            }
            if(divisor_numb > limit) answer += power
            else answer += divisor_numb
        }
        return answer
        }
}