class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        val a = x.toString().map { it.digitToInt() }.sum()
        if (x%a == 0) {
            answer = true
        } else {
            answer = false
        }
        return answer
    }
}