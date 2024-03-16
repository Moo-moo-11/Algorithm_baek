class Solution {
    fun solution(n: Long)= n.toString().toList().sortedDescending().joinToString(separator = "").toLong()
}