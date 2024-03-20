class Solution {
    fun solution(numbers: IntArray): IntArray {
        val set1 = mutableSetOf<Int>()
        for (i in 0..numbers.size-1){
            for (x in i+1..numbers.size-1){
                set1.add(numbers[i]+numbers[x])
            }
        }
        return set1.toIntArray().sortedArray()
    }
}