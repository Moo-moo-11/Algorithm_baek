class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        for (item in babbling) {
            var str = item
            if ("ayaaya" in str) continue
            if ("yeye" in str) continue
            if ("woowoo" in str) continue
            if ("mama" in str) continue
            if ("aya" in str) str = str.replace("aya", " ")
            if ("ye" in str) str = str.replace("ye", " ")
            if ("woo" in str) str = str.replace("woo", " ")
            if ("ma" in str) str = str.replace("ma", " ")
            if (" " in str) str = str.replace(" ", "")
            if (str == "") answer++
        }
        return answer
    }
}