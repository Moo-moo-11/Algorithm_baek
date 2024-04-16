class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val hashMap = HashMap<Int,Int>()
        tangerine.forEach{
            if (hashMap.contains(it)) hashMap[it] = hashMap[it]!!.plus(1)
            else hashMap[it] = 1
        }
        val diff_numb = hashMap.map {it.value}.sortedDescending()
        var tange_numb = 0
        var answer = 0
        for (numb in diff_numb) {
            tange_numb += numb
            answer += 1
            if (tange_numb >= k) break
        }
        return answer
    }
}