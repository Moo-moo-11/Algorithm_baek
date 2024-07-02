class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer = 0
        
        for (numb in array) {
            if (numb == n) answer++
        }

        return answer
    }
}