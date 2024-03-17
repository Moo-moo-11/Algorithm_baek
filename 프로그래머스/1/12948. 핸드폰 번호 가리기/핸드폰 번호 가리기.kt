class Solution {
    fun solution(phone_number: String) = "*".repeat(phone_number.length-4) + phone_number.substring(phone_number.length-4,phone_number.length)
}