class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer = ((1+count)*count/2) * price.toLong() - money
        if (answer < 0) answer = 0
        return answer
    }
}