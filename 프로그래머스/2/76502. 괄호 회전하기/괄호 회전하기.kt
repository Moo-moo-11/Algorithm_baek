class Solution {
    fun solution(s: String): Int {
        var answer = 0
        val pairList = listOf('[' to ']','{' to '}','(' to ')')
        
        for (i in s.indices) {
            val stack = ArrayDeque<Char>()

            for (j in s.indices) {
                val char = s[(i+j)%s.length]
                
                if (stack.lastOrNull() to char in pairList) {
                    stack.removeLast()
                } else {
                    stack.add(char)
                }
            }
            if (stack.isEmpty()) answer++
        }

        return answer
    }
}