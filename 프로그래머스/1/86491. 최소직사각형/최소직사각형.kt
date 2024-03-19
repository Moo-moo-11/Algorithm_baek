class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        sizes.map { it.sortDescending() }
        return sizes.maxOf { it.first() } * sizes.maxOf { it.last() }
    }
}