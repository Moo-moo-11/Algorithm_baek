class Solution {
    fun solution(chicken: Int): Int {
        var answer: Int = chicken/10
        var coupons = chicken%10
        var service = chicken/10
        while(true) {
            coupons += service%10
            service = service/10
            
            if (coupons >= 10) {
                service += 1
                coupons -= 10
            }
            
            answer += service
            if (service == 0) break
        }
        return answer
    }
}