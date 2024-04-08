class Solution {
    fun solution(s: String) = s.split(" ").joinToString(separator = " ")
    {it.lowercase().replaceFirstChar {it.uppercase()}}
}