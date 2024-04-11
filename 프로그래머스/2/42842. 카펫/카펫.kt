class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val total = brown + yellow
        val answer = IntArray(2)
        for (i in 3..total) {
            if (total%i==0) {
                val a = total/i
                val b = i
                if ((a-2)*(b-2) == yellow) {
                    answer[0] = a
                    answer[1] = b
                    break
                }
            }
        }
        return answer
    }
}