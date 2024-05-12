class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        val answerArray = board
        var list:MutableList<Pair<Int,Int>> = mutableListOf()
        for (i in board.indices) {
            for (j in board.indices) {
                if (board[i][j] == 1) list.add(i to j)
            }
        }
        for (bomb in list) {
            val (x,y) = bomb
            val a = if (x-1 < 0) x else x-1
            val b = if (x+1 > board.size-1) x else x+1
            val c = if (y-1 < 0) y else y-1
            val d = if (y+1 > board.size-1) y else y+1
            answerArray[a][c] = 1
            answerArray[x][c] = 1
            answerArray[b][c] = 1
            answerArray[a][y] = 1
            answerArray[b][y] = 1
            answerArray[a][d] = 1
            answerArray[x][d] = 1
            answerArray[b][d] = 1
        }
        
         for (i in answerArray.indices) {
            for (j in answerArray.indices) {
                if (answerArray[i][j] == 0) answer++
            }
        }
        return answer
    }
}