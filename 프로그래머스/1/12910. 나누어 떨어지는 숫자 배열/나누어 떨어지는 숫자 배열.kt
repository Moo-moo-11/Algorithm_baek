class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        for (i in arr) {
            if(i%divisor == 0) answer += i
        }
        if (answer.size == 0) answer += -1
        answer = answer.sortedArray()
        return answer
    }
}