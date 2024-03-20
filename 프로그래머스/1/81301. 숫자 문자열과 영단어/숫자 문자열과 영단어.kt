class Solution {
    fun solution(s: String): Int {
        var str = s
        val pairlist = listOf(Pair("one", "1"), Pair("two","2"), Pair("three","3"), Pair("four","4"), Pair("five","5"), Pair("six","6"), Pair("seven","7"), Pair("eight","8"), Pair("nine","9"), Pair("zero","0"))
        for (i in pairlist) if (i.first in str) str = str.replace(i.first,i.second)
        val answer = str.toInt()
        return answer
    }
}