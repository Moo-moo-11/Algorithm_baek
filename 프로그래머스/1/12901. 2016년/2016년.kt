import java.time.LocalDate

class Solution {
    fun solution(a: Int, b: Int): String {
        val date = LocalDate.of(2016,a,b)
        return date.dayOfWeek.toString().substring(0..2)
    }
}