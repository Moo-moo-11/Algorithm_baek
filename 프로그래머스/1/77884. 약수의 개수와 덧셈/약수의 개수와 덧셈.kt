class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer = 0
        for (i in left..right) {
            var b = 0
            for (x in 1..i) {
                if (i%x == 0) b++
            }
            if (b%2 == 0) answer += i
            else answer -= i
        }
        return answer
    }
}