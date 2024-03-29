class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val answer = IntArray(targets.size)
        for (i in targets.indices) {
            var sum = 0
            for (char in targets[i]) {
                val list = keymap.map {it.indexOf(char) + 1}
                if (list.all {it==0}) {
                    sum = -1
                    break
                }
                sum += list.filter{it != 0}.minOrNull()!!
            }
            answer[i] = sum
        }
        return answer
    }
}