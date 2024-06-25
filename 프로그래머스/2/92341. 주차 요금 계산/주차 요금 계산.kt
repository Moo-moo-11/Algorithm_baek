import kotlin.math.*
import java.util.PriorityQueue

class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val maps = mutableMapOf<Int, Int>()        
        
        val time = 23*60 + 59
        
        for (rec in records) {
            val minutes = rec.substring(0..1).toInt()*60 + rec.substring(3..4).toInt()
            val carNumb = rec.substring(6..9).toInt()
            
            if(rec[11] == 'I') {
                maps[carNumb] = maps.getOrDefault(carNumb, 0) - minutes
            } else {
                maps[carNumb] = maps.getOrDefault(carNumb, 0) + minutes
            }
        }
        
        val priorityQueue = PriorityQueue<Pair<Int,Int>> { a, b -> a.first - b.first }
        
        for ((k,v) in maps) {
            val totalminutes = if (v > 0) v else (23*60 + 59 + v)
            
            val fee = when {
                totalminutes <= fees[0] -> fees[1]
                else -> fees[1] + (ceil((totalminutes - fees[0])/fees[2].toDouble())).toInt() * fees[3]
            }
            
            priorityQueue.add(k to fee)
        }
        
        val answer = IntArray(maps.size)
        
        for (i in priorityQueue.indices) {
            answer[i] = priorityQueue.poll().second
        }
        
        return answer
    }
}