class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var a = 1
        var b = 1
        for (i in 1..n){
            if (n%i == 0 && m%i == 0)
            a = i
        }
        while (n*b%m != 0) {
            b++
        }
        val answer = intArrayOf(a,b*n)
        return answer
    }
}