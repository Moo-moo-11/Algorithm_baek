class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var answer = players
        val hashMap = HashMap<String, Int>()
        for (item in players) {
            hashMap[item] = players.indexOf(item)
        }
        for (names in callings) {
            val callrank = hashMap[names]
            val beforeplayer = answer[callrank?.minus(1)!!]

            answer[callrank] = beforeplayer
            answer[callrank - 1] = names

            hashMap[names] = callrank - 1
            hashMap[beforeplayer] = callrank
        }
        return answer
    }
}