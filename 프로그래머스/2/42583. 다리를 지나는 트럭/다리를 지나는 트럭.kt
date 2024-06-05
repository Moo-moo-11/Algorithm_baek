class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        val bridge = ArrayDeque<Int>()
        
        for (truck in truck_weights) {
            while (true) {
                if (bridge.isEmpty()) {
                    bridge.add(truck)
                    answer += 1
                    break
                } else if (bridge.size == bridge_length) {
                    bridge.removeFirst()
                } else {
                    if (bridge.sum() + truck > weight) {
                        bridge.add(0)
                        answer += 1
                    } else {
                        bridge.add(truck)
                        answer += 1
                        break
                    }
                }
            }
        }
        
        answer += bridge_length
        
        return answer
    }
}