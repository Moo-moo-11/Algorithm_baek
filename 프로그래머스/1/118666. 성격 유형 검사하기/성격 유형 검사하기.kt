class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var indicator1 = 0
        var indicator2 = 0
        var indicator3 = 0
        var indicator4 = 0
        for (i in survey.indices) {
            when (survey[i]) {
            "RT" -> indicator1 += 4-choices[i]
            "TR" -> indicator1 -= 4-choices[i]
            "CF" -> indicator2 += 4-choices[i]
            "FC" -> indicator2 -= 4-choices[i]
            "JM" -> indicator3 += 4-choices[i]
            "MJ" -> indicator3 -= 4-choices[i]
            "AN" -> indicator4 += 4-choices[i]
            "NA" -> indicator4 -= 4-choices[i]
            }
        }
        val answer = String(charArrayOf((if(indicator1>=0) 'R' else 'T'), (if(indicator2>=0) 'C' else 'F'), (if(indicator3>=0) 'J' else 'M'), (if(indicator4>=0) 'A' else 'N')))    
        return answer
    }
}