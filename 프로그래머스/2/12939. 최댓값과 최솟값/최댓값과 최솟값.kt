class Solution {
    fun solution(s: String): String {
        val intList = s.split(" ").map { it.toInt() }
        val answer = intList.minOrNull()!!.toString() + " " + intList.maxOrNull()!!.toString()
        return answer
    }
}