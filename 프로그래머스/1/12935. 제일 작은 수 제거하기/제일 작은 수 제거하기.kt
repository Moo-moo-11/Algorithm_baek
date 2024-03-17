class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        val list1 = arr.toMutableList()
        list1.remove(arr.minOrNull())
        for (i in list1) answer += i
        if (answer.size == 0) answer += -1
        return answer
    }
}