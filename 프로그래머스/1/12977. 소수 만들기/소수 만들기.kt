class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        for (x in 0..nums.size-1) {
            for (y in x+1..nums.size-1) {
                for (z in  y+1..nums.size-1) {
                    val decimal = nums[x] + nums[y] + nums[z]
                    var isdecimal = true
                    for (i in 2..decimal-1) {
                        if (decimal%i == 0) {
                            isdecimal = false 
                            break
                        }
                    }
                    if (isdecimal) answer++
                }
            }       
        }
        return answer
    }
}