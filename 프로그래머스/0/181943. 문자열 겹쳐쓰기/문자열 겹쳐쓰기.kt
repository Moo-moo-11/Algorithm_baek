class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = my_string.replaceRange(s..overwrite_string.length+s-1,overwrite_string)
        return answer
    }
}