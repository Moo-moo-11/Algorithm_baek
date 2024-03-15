class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        val str = n.toString()
        for (i in 0..str.length-1){
            answer += str[i].digitToInt()
        }
        return answer
    }
}