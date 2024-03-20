class Solution {
    fun solution(food: IntArray): String {
        var a = ""
        for (i in 1..food.size-1) {
            a += i.toString().repeat(food.map{it/2}[i])
        }
        val answer = a + "0" + a.reversed()
        return answer
    }
}