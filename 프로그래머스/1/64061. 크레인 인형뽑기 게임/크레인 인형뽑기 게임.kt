class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val array = board
        var list = mutableListOf<Int>()

        for (number in moves) {

            var i = 0

            while(true) {
                if(array[i][number-1] != 0 || i == board.size-1) break
                i++
            }

            if(array[i][number-1] != 0) {
            
                if(list.isEmpty()) {
                    list.add(array[i][number-1])
                    array[i][number-1] = 0
                } else if (list.last() == array[i][number-1]) {
                    list.removeLast()
                    array[i][number-1] = 0
                    answer += 2
                } else {
                    list.add(array[i][number-1])
                    array[i][number-1] = 0
                }
            }

        }

        return answer
    }
}