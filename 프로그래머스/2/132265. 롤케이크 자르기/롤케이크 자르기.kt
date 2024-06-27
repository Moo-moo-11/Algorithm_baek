class Solution {
    fun solution(topping: IntArray): Int {
        var answer = 0
        
        val maps = mutableMapOf<Int, Int>()
        
        for (top in topping) {
            maps[top] = maps.getOrDefault(top, 0) + 1
        }
        
        val left = mutableSetOf<Int>()
        
        var rightNumb = maps.size
        
        for (i in topping) {
            left.add(i)
            
            maps[i] = maps.getOrDefault(i, 0) - 1
            
            if (maps[i] == 0) rightNumb--
            
            val leftNumb = left.size
            
            if (leftNumb == rightNumb) answer++
        }
        
        return answer
    }
}