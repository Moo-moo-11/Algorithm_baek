class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array<IntArray>(arr1.size) { a -> intArrayOf()}
        for (i in 0..arr1.size-1) {
            val x = arr1[i]
            val y = arr2[i]
            answer[i] = x.zip(y){x,y -> x+y}.toIntArray()
        }
        return answer
    }
}