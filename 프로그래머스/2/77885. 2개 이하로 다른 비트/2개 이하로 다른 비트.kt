import kotlin.math.*

class Solution {
    fun solution(numbers: LongArray): LongArray {
        val answer = LongArray(numbers.size)
        
        for ((index,numb) in numbers.withIndex()) {
            
            numb.toString(2).split("0")
            
            if (numb % 2 == 0L) {
                answer[index] = numb + 1
            } else {
                val bitNumb = numb.toString(2)
                
                val ones = bitNumb.split("0").last().length
                
                answer[index] = numb + (2.toDouble().pow(ones - 1)).toLong()
            }         
            
        }
        
        return answer
    }
}