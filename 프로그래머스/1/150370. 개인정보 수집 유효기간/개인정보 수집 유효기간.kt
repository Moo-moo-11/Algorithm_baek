class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val today_list = today.split(".").map {it.toInt()}
        val terms_list = terms.map {it.split(" ")}
        val privacies_list = privacies.map {it.split(" ")}
        for (i in privacies_list.indices) {
            val privacies_datelist = privacies_list[i][0].split(".").map{it.toInt()}.toMutableList()
            val months = terms_list.filter { it[0] == privacies_list[i][1] }[0][1].toInt()
            privacies_datelist[0] = privacies_datelist[0] + (privacies_datelist[1]+months-1)/12
            privacies_datelist[1] = (privacies_datelist[1]+months-1)%12 + 1 - (29-privacies_datelist[2])/28
            privacies_datelist[2] = (privacies_datelist[2]+26)%28 + 1
            if (today_list[0] > privacies_datelist[0]) answer += i+1
            if (today_list[0] == privacies_datelist[0]) {
                if(today_list[1] > privacies_datelist[1]) answer += i+1
                else if(today_list[1] == privacies_datelist[1]) {
                    if (today_list[2] > privacies_datelist[2]) answer+= i+1
                }
            }
        }
    
        return answer
    }
}