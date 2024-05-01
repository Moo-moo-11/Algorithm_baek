class Solution {
    fun solution(a: Int, b: Int): Int {
        val x = (a.toString() + b.toString()).toInt()
        val y = (b.toString() + a.toString()).toInt()
        
        if (x >= y) {
            return x
        } else {
            return y
        }
    }
}