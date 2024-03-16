class Solution {
    fun solution(n: Long): IntArray {
        val a = n.toString()
        var answer = IntArray(a.length)
        for (i in 0..a.length-1){
            answer[i] = a[a.length - 1 - i].digitToInt()
        }
        return answer
    }
}