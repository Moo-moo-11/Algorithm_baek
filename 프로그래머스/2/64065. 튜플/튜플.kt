class Solution {
    fun solution(s: String): IntArray {
        val list = s.split(",")
        val maps: HashMap<Int,Int> = hashMapOf()
        for (word in list) {
            val number = word.replace("{","").replace("}","").toInt()
            maps[number] = maps.getOrDefault(number, 0) + 1
        }
        val answer = IntArray(maps.size)
        maps.forEach { answer[maps.size - it.value] = it.key }
        return answer
    }
}