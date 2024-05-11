class Solution {
    fun solution(num_list: IntArray) = if (num_list.reduce {acc, a -> acc*a} <= num_list.sum()*num_list.sum()) 1 else 0
}