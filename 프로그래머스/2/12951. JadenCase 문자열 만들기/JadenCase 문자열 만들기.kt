class Solution {
    fun solution(s: String) = s.split(" ").joinToString(separator = " ")
    {word -> word.lowercase().replaceFirstChar {it.uppercase()}}
}