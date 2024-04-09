class Solution {
    fun solution(s: String): IntArray {
        var modifieds = s
        var count = 0
        var delzeros = 0
        while (modifieds != "1") {
            val zeros = modifieds.replace("0","").length.toInt()
            delzeros += modifieds.length-zeros
            modifieds = zeros.toString(2)
            count++
        }
        val answer = intArrayOf(count,delzeros)
        return answer
    }
}