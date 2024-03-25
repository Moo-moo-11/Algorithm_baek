class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val zeros = lottos.filter{it==0}.size
        var wins = 0
        lottos.forEach {if(it in win_nums) wins++}
        if (7-(wins+zeros) == 7) answer += 6 else answer += 7-(wins+zeros)
        if (7-wins == 7) answer += 6 else answer += 7-wins
        return answer
    }
}