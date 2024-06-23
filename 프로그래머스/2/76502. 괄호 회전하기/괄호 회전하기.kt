class Solution {
    fun solution(s: String): Int {
        var answer = 0
        val pairList = listOf('[' to ']','{' to '}','(' to ')')
        for (i in s.indices) {
            val queue = ArrayDeque<Char>()
            
            for (j in s.indices) {
                val char = s[(i+j)%s.length]
                
                if (queue.isEmpty()){
                    queue.add(char)
                } else if (queue.last() to char in pairList) {
                    queue.removeLast()
                } else {
                    queue.add(char)
                }   
            }
            
            if (queue.isEmpty()) answer++
        }
        
        return answer
    }
}