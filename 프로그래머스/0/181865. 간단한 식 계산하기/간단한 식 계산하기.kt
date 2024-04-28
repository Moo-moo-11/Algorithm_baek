class Solution {
    fun solution(binomial: String): Int {
        val binomialList = binomial.split(" ")
        val a = binomialList[0].toInt()
        val op = binomialList[1]
        val b = binomialList[2].toInt()
        var answer = 0
        when (op) {
            "+" -> answer = a + b
            "-" -> answer = a - b
            "*" -> answer = a * b
        }
        
        return answer
    }
}