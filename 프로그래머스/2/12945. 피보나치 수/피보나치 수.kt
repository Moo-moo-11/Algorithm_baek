class Solution {
    fun solution(n: Int): Int {
        var hashMap = HashMap <Int,Int>()
        
        for (i in 0..n) {
            if(i == 0) hashMap[i] = 0
            else if (i == 1) hashMap[i] = 1
            else hashMap[i] = hashMap[i-2]!!.plus(hashMap[i-1]!!).rem(1234567)
        }
        val answer = hashMap[n]!!
        return answer
    }
}