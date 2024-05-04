class Solution {
    fun solution(n: Int): Int {
        if (n % 2 == 0) {
            var answer = 0
            for (i in 2..n) {
                if (i % 2 == 0) answer += i*i
            }
            return answer
        } else {
            var answer = 0
            for (i in 1..n) {
                if (i % 2 == 1) answer += i
            }
            return answer
        }
    }
}