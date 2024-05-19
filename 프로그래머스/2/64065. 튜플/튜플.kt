class Solution {
    fun solution(s: String): IntArray {
        val list = s.split(",").map {it.replace("{","").replace("}","").toInt()}
        val maps: HashMap<Int,Int> = hashMapOf()
        for (number in list) {
            maps[number] = maps.getOrDefault(number, 0) + 1
        }
        val answer = IntArray(maps.size)
        maps.forEach { answer[maps.size - it.value] = it.key }
        return answer
    }
}