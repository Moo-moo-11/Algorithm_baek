class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var rowlist = mutableListOf<Int>()
        var columnset = mutableSetOf<Int>()
        for (i in wallpaper.indices) {
            columnset.add(wallpaper[i].indexOfFirst{it=='#'})
            columnset.add(wallpaper[i].indexOfLast{it=='#'})
            if(wallpaper[i].contains('#')) rowlist.add(i)
        }
        columnset.remove(-1)
        answer += rowlist.minOrNull()!!
        answer += columnset.minOrNull()!!
        answer += rowlist.maxOrNull()!! + 1
        answer += columnset.maxOrNull()!! + 1
        return answer
    }
}