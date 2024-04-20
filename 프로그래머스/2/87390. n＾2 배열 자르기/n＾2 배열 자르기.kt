class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val answer = IntArray((right-left+1).toInt())

        val i1 = (left/n + 1).toInt()
        val j1 = (left%n + 1).toInt()
        val i2 = (right/n + 1).toInt()
        val j2 = (right%n + 1).toInt()

        if (i1 == i2) {
            for (x in j1..j2) {
                answer[x-j1] = if(i1>=x) i1 else x
            }
            answer[0] = if(i1>=j1) i1 else j1
        } else {
            for (x in j1..n) {
                answer[x-j1] = if(i1>=x) i1 else x
            }

            for (a in i1+1..i2-1) {
                    for (b in 1..n) {
                        answer[(a-i1)*n+b-j1] = if(a>=b) a else b
                    }
            }

            for (y in 1..j2) {
                    answer[(i2-i1)*n+y-j1] = if(i2>=y) i2 else y
            }
        }

        return answer
    }
}