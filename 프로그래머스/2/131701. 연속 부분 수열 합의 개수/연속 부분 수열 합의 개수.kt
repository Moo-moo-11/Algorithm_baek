class Solution {
    fun solution(elements: IntArray): Int {
        val set = mutableSetOf<Int>()
        for (i in 1..elements.size-1) {
            for (index in 0..elements.size-1) {
                var sum = 0
                for (j in 0..i-1) {
                    sum += elements[(index+j)%(elements.size)]
                }
                set.add(sum)
            }
        }
        set.add(elements.sum())
        return set.count()
    }
}