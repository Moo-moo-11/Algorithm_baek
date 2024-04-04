class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        for (item in babbling) {
            var str = item
            if ("ayaaya" in str) continue
            if ("yeye" in str) continue
            if ("woowoo" in str) continue
            if ("mama" in str) continue
            str = str.replace("aya", " ")
            str = str.replace("ye", " ")
            str = str.replace("woo", " ")
            str = str.replace("ma", " ")
            str = str.replace(" ", "")
            if (str == "") answer++
        }
        return answer
    }
}