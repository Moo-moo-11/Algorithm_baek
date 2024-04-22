class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer :Int = 0

        val wantMap :HashMap<String,Int> = hashMapOf()
        for (i in want.indices) {
            wantMap[want[i]] = number[i]
        }

        val maxDate = discount.size-9
        for (x in 0..maxDate-1) {
            val discountMap :HashMap<String,Int> = hashMapOf()
            discount.slice(x..x+9).groupBy { it }.forEach { discountMap[it.key] = it.value.size }
            if (wantMap == discountMap) {
                answer += 1
            }
        }
        return answer
    }
}