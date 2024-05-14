class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var answer: Int = 1
        var count = 1
        while (count != k) {
            count++
            answer = if ((answer + 2) % numbers.size == 0) answer + 2 else (answer + 2) % numbers.size    
        }
        return answer
    }
}