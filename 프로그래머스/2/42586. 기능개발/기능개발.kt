class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = intArrayOf()
        val queueList = mutableListOf<Int>()
        for (i in progresses.indices) {
            if((100-progresses[i])%speeds[i] == 0){
                queueList.add((100-progresses[i])/speeds[i])
            } else {
                queueList.add((100-progresses[i])/speeds[i] + 1)
            }
        }
        var tempDate = 0
        var count = 0
        val answerList = mutableListOf<Int>()
        while(queueList.isEmpty() == false) {
            if(queueList[0] > tempDate) {
                tempDate = queueList[0]
                if (count != 0) answerList.add(count)
                count = 1
            } else {
                count += 1
            }
            
            queueList.removeAt(0)
        }
        answerList.add(count)
        return answerList.toIntArray()
    }
}