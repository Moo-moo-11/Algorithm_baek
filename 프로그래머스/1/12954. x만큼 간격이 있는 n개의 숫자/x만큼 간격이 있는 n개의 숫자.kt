class Solution {
    fun solution(x: Int, n: Int): DoubleArray {
        var answer = DoubleArray(n)
        for (i in 1..n){
            answer[i-1] = x.toDouble() * i.toDouble()
        }
        return answer
    }
}