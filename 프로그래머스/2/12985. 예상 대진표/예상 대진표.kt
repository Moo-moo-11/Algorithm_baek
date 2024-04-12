class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var num_a = a
        var num_b = b
        var answer = 1
        while((num_a+1 != num_b || num_b%2 != 0)&&(num_b+1 != num_a || num_a%2 != 0)) {
            num_a = (num_a+1)/2
            num_b = (num_b+1)/2
            answer += 1
        }
        return answer
    }
}

