class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val maps:MutableMap<String,Int> = mutableMapOf()        
        for (i in name.indices) {
            maps[name[i]] = yearning[i]
        }
        
        val answer = IntArray(photo.size)
        for (index in photo.indices) {
            var score = 0
            for (name in photo[index]) {
                score += maps.getOrDefault(name, 0)
            }
            answer[index] = score
        }
        return answer
    }
}