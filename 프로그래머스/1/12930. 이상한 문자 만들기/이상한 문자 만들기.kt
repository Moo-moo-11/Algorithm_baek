class Solution {
    fun solution(s: String): String {
        val a = s.split(" ")
        var array1 = arrayOf<String>()
        for (item in a) {
            var b = ""
            for (i in 0..item.length-1) {
                if (i%2 == 0) b = b.plus(item[i].uppercase())  
                else b = b.plus(item[i].lowercase())
            }
            array1 += b
        }
        val answer = array1.joinToString(" ")
        return answer
    }
}