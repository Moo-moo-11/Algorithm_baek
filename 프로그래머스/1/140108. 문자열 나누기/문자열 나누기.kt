class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var temp = '1'
        var count_temp = 0
        var count_temp_not = 0
        for (i in s) {
            if(count_temp == 0 && count_temp_not == 0) temp = i
            
            if(temp == i) count_temp++
            if(temp != i) count_temp_not++
            
            if(count_temp == count_temp_not) {
                answer++
                count_temp = 0
                count_temp_not = 0
            }
        }
        if (count_temp != 0 || count_temp_not != 0) answer++
        return answer
    }
}