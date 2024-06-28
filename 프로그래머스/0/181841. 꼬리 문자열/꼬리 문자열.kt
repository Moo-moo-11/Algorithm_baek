class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        val sb = StringBuilder()
        
        for (str in str_list) {
            if (str.contains(ex)) continue
            
            for (char in str) {
                sb.append(char)
            }
            
        }
        
        return String(sb)
    }
}