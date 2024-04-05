class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer = IntArray(2)
        var obstacles = mutableListOf<Any>()
        for (i in park.indices) {
            if(park[i].contains('S')) {
                answer[0] = i
                answer[1] = park[i].indexOf('S')
            }
            if(park[i].contains('X')) {
                for (j in park[i].indices) {
                    if (park[i][j] == 'X') {
                        obstacles.add(i to j)
                    }
                }
            }
        }
        for (items in routes) {
            when (items[0]) {
                'E' -> for (i in 1..items[2].digitToInt()) {
                    if (answer[1]+items[2].digitToInt() > park[0].length-1) break
                    if ((answer[0] to answer[1]+i) in obstacles) break
                    if (i == items[2].digitToInt()) answer[1] = answer[1]+items[2].digitToInt()
                }
                'W' -> for (i in 1..items[2].digitToInt()) {
                    if (answer[1]-items[2].digitToInt() < 0) break
                    if ((answer[0] to answer[1]-i) in obstacles) break
                    if (i == items[2].digitToInt()) answer[1] = answer[1]-items[2].digitToInt()
                }
                'S' -> for (i in 1..items[2].digitToInt()) {
                    if (answer[0]+items[2].digitToInt() > park.size-1) break
                    if ((answer[0]+i to answer[1]) in obstacles) break
                    if (i == items[2].digitToInt()) answer[0] = answer[0]+items[2].digitToInt()
                }
                'N' -> for (i in 1..items[2].digitToInt()) {
                    if (answer[0]-items[2].digitToInt() < 0) break
                    if ((answer[0]-i to answer[1]) in obstacles) break
                    if (i == items[2].digitToInt()) answer[0] = answer[0]-items[2].digitToInt()
                }
            }
        }
        return answer
    }
}