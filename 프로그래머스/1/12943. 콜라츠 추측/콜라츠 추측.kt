class Solution {
    fun solution(num: Int): Int {
        var n = 0
        var a:Long = num.toLong()
        while (a != 1L && n <= 500){
            if (a%2 == 0L) {
                a /= 2
                println(a)
            } else {
                a = a*3 + 1
                println(a)
            }
            n++
        }
        if (n == 501) {n = -1}
        return n
    }
}