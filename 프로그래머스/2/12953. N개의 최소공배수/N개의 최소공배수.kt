import kotlin.math.*

class Solution {
    fun solution(arr: IntArray): Int {
        var commonMultiple = arr[0]
        for (i in 1..arr.size-1) {
            var minDivisor = 1
            
            var a = if(arr[i] > commonMultiple) arr[i] else commonMultiple
            var b = if(arr[i] > commonMultiple) commonMultiple else arr[i]
            
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