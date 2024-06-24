import kotlin.math.*

class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer = 0
        val list = n.toString(k).split("0").filterNot { it == "" }.map { it.toLong() }
        
        for (numb in list) {
            if (numb == 1L) continue

            for (i in 2..sqrt(numb.toDouble()).roundToLong()) {
                if (numb%i == 0L) {answer--; break}
            }

            answer++
        }
        
        return answer
    }
}