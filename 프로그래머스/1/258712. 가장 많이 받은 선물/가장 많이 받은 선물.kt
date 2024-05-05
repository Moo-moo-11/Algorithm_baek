class Solution {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        val giftGives:MutableMap<String,Int> = mutableMapOf()
        val giftTakes:MutableMap<String,Int> = mutableMapOf()
        
        friends.forEach {
            giftGives[it] = 0
            giftTakes[it] = 0
        }
        
        gifts.forEach {
            val gift = it.split(" ")
            
            giftGives[gift[0]] = giftGives[gift[0]]!!.plus(1)
            giftTakes[gift[1]] = giftTakes[gift[1]]!!.plus(1)
        }
        
        val giftIndex:MutableMap<String,Int> = mutableMapOf()
        
        for (friend in giftGives) {
            giftIndex[friend.key] = friend.value - giftTakes[friend.key]!!
        }
        
        val giftGivenNextMonth:MutableMap<String,Int> = mutableMapOf()
        
        for (i in 0..friends.size-2) {
            for (j in i+1..friends.size-1) {
                val a = gifts.count { it == "${friends[i]} ${friends[j]}" }
                val b = gifts.count { it == "${friends[j]} ${friends[i]}" }
                
                if (a > b) {
                    giftGivenNextMonth[friends[i]] =
                    giftGivenNextMonth.getOrDefault(friends[i],0) + 1
                } else if (b > a) {
                    giftGivenNextMonth[friends[j]] =
                    giftGivenNextMonth.getOrDefault(friends[j],0) + 1
                } else {
                    if (giftIndex[friends[i]]!! > giftIndex[friends[j]]!!) {
                        giftGivenNextMonth[friends[i]] =
                        giftGivenNextMonth.getOrDefault(friends[i],0) + 1
                    } else if (giftIndex[friends[j]]!! > giftIndex[friends[i]]!!) {
                        giftGivenNextMonth[friends[j]] =
                        giftGivenNextMonth.getOrDefault(friends[j],0) + 1
                    }
                }
            }
        }
        if (giftGivenNextMonth.isEmpty()) return 0
        else return giftGivenNextMonth.maxOf { it.value }
    }
}