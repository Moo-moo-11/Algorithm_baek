class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        val queueList = MutableList(priorities.size){it}
        
        val prioritiesList = priorities.toMutableList()

        var highestPriority = priorities.maxOrNull()

        val answerList = mutableListOf<Int>()

        while(queueList.isEmpty() == false) {
            if (priorities[queueList[0]] == highestPriority) {
                answerList.add(queueList[0])
                prioritiesList.remove(priorities[queueList[0]])
                queueList.removeAt(0)
                highestPriority = prioritiesList.maxOrNull()
            } else {
                queueList.add(queueList[0])
                queueList.removeAt(0)
                highestPriority = prioritiesList.maxOrNull()
            }
        }
        return answerList.indexOf(location) + 1
    }
}