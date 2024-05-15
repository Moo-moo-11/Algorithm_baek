class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var answer: Int = 2
        for (word in dic) {
            if(word.length != spell.size) continue
            var temp = word
            for(char in spell) {
                temp = temp.replaceFirst(char, "")
            }
            if (temp == "") {
                answer = 1
                break
            }
        }
        return answer
    }
}