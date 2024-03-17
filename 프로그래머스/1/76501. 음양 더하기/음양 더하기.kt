class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        val list1 = signs.map{if (it == true) 1 else -1}
        for (i in 0..list1.size-1)
            answer += list1[i] * absolutes[i]
        return answer
    }
}