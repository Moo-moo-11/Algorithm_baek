class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
        for (i in 0..arr1.size-1) {
            val x = arr1[i]
            val y = arr2[i]
            answer += x.zip(y){x,y -> x+y}.toIntArray()
        }
        return answer
    }
}