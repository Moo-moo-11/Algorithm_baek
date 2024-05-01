class Solution {
    fun solution(a: Int, b: Int): Int {
        val x = (a.toString() + b.toString()).toInt()
        val y = 2*a*b
        if (x>=y) return x else return y
    }
}