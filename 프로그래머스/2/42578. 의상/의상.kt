class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 0
        val clothesNum = clothes.groupBy { it[1] }.map { it.value.size }
        if (clothesNum.size == 1) {
            answer = clothesNum[0]
        } else {
            var sum = clothesNum[0] + clothesNum[1] + clothesNum[0]*clothesNum[1]
            for (i in 2..clothesNum.size-1) {
                sum = sum + clothesNum[i] + sum*clothesNum[i]
            }
            answer = sum
        }
        return answer
    }
}