class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val list = mutableListOf<Pair<Int,Double>>()
        for (i in 1..N) {
            var total = 0
            var pass = 0
            for (number in stages) {
                if (number > i) {total += 1; pass += 1}
                if (number == i) total += 1
            }
            list.add(i to pass/(total.toDouble()))
        }
        list.sortWith (compareBy ({it.second}, {it.first}))
        return list.map { it.first }.toIntArray()
    }
}