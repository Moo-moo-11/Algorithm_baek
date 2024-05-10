import kotlin.math.*

class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        val maps = mapOf(1 to (1 to 4), 2 to (2 to 4), 3 to (3 to 4), 4 to (1 to 3),
                         5 to (2 to 3), 6 to (3 to 3), 7 to (1 to 2), 8 to (2 to 2),
                         9 to (3 to 2), 0 to (2 to 1))
        var string = StringBuilder()
        var left = 1 to 1
        var right = 3 to 1
        for (number in numbers) {
            if (number in intArrayOf(1,4,7)) {
                string.append('L')
                left = maps[number]!!
            }
            if (number in intArrayOf(3,6,9)) {
                string.append('R')
                right = maps[number]!!
            }
            
            if (number in intArrayOf(2,5,8,0)) {
                val location = maps[number]!!
                val leftlength = (left.first - location.first).absoluteValue +
                (left.second - location.second).absoluteValue
                val rightlength = (right.first - location.first).absoluteValue +
                (right.second - location.second).absoluteValue
                
                if (leftlength > rightlength) {
                    string.append('R')
                    right = location
                } else if (rightlength > leftlength) {
                    string.append('L')
                    left = location
                } else {
                    if (hand == "right") {
                        string.append('R')
                        right = location
                    } else {
                        string.append('L')
                        left = location
                    }
                }
            }
        }
        return String(string)
    }
}