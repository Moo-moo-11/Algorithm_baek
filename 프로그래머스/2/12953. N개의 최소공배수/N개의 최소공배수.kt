import kotlin.math.*

class Solution {
    fun solution(arr: IntArray): Int {
        var commonMultiple = arr[0]
        for (i in 1..arr.size-1) {
            var minDivisor = 1
            
            var a = max(arr[i], commonMultiple)
            var b = min(arr[i], commonMultiple)
            
            while (b != 0) {
                val r = a%b
                a = b
                b = r
            }
            minDivisor = a
            commonMultiple = arr[i] * commonMultiple / minDivisor
        }
        return commonMultiple
    }
}