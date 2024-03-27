class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var taken = mutableListOf<Int>()
        val filteredlost = lost.filterNot{it in reserve}
        val filteredreserve = reserve.filterNot{it in lost}
        var answer = n - filteredlost.size
        for (item in filteredlost.sorted()){
            if(item-1 in filteredreserve) {
                if(item-1 !in taken) {
                    answer++
                    continue
                }
            }
            if (item+1 in filteredreserve) {
                if(item+1 !in taken) {
                    answer++
                    taken.add(item+1)
                }
            }
        }
        return answer
    }
}