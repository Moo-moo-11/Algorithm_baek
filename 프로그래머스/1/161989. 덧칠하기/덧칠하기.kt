class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var wall = IntArray(n) {1}
        for (number in section) {
            wall[number-1] = 0
        }
        while(wall.any {it == 0}){
            var paintstart = wall.indexOf(0)
            for (i in paintstart..paintstart+m-1) {
                if(i <= wall.size-1) wall[i] = 1
            }
            answer++
        }
        return answer
    }
}