class Solution {
    fun solution(m: Int, n: Int, startX: Int, startY: Int, balls: Array<IntArray>): IntArray {
        val answer = IntArray(balls.size)

        val (currentX, currentY) = startX to startY

        for ((index,ball) in balls.withIndex()) {
            val (x, y) = ball[0] to ball[1]
            
            var xPlus = (currentX - (2*m - x))*(currentX - (2*m - x)) + (currentY - y)*(currentY -y)
            var xMinus = (currentX - (-x))*(currentX - (-x)) + (currentY - y)*(currentY -y)

            var yPlus = (currentX - x)*(currentX - x) + (currentY-(2*n-y))*(currentY-(2*n-y))
            var yMinus = (currentX - x)*(currentX - x) + (currentY-(-y))*(currentY-(-y))
            
            if (currentY == y) {
                when {
                    currentX > x -> xMinus = 3000000
                    else -> xPlus  =3000000
                }
            }
            
            if (currentX == x) {
                when {
                    currentY > y -> yMinus = 3000000
                    else -> yPlus = 3000000
                }
            }
            
            var min = xPlus
            min = min.coerceAtMost(xMinus)
            min = min.coerceAtMost(yPlus)
            min = min.coerceAtMost(yMinus)

            answer[index] = min
        }

        return answer
    }
}