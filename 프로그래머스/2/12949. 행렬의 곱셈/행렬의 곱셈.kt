class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val arr1row = arr1.size
        val arr1col = arr1[0].size
        val arr2row = arr2.size
        val arr2col = arr2[0].size
        var answer = Array(arr1.size,{IntArray(arr2[0].size,{0})})    
        for (r in 0..arr1row-1) {
            for (c in 0..arr2col-1) {
                var multiple = 0
                for (num in 0..arr2row-1) {
                    multiple += arr1[r][num]*arr2[num][c]
                }
                answer[r][c] = multiple
            }                     
        }
        return answer
    }
}