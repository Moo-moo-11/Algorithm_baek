class Solution {
    fun solution(n: Int): IntArray {
        val totalNumb = (n+1) * n / 2
        
        val answerArray = Array(n) { IntArray(n) }
        var x = 0
        var y = 0
        var direction = 'x'
        var numb = 1
        while (numb <= totalNumb) {
            when (direction) {
                'x' -> {
                    answerArray[x][y] = numb
                    
                    if(x + 1 >= n || answerArray[x+1][y] != 0) {
                        direction = 'y'
                        y++
                        numb++
                    } else {
                        x++
                        numb++
                    }
                }
                'y' -> {
                    answerArray[x][y] = numb
                    
                    if(y + 1 >= n || answerArray[x][y+1] != 0) {
                        direction = 'd'
                        x--
                        y--
                        numb++
                    } else {
                        y++
                        numb++
                    }
                }
                else -> {
                    answerArray[x][y] = numb
                    
                    if(answerArray[x-1][y-1] != 0) {
                        direction = 'x'
                        x++
                        numb++
                    } else {
                        x--
                        y--
                        numb++
                    }
                }
            }
        }
        
        val answer = IntArray(totalNumb)
        var index = 0
        
        for (intArray in answerArray) {
            
            for (int in intArray) {
                if(int != 0) answer[index++] = int
            }

        }
        
        return answer
    }
}