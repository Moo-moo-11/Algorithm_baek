class Solution {
    fun solution(s: String): Int {
        var answer = ""
        var eng = ""
        for(i in s){
            if(i !in ('0'..'9')){
                eng+=i
                when(eng){
                    "one" -> {
                        answer += "1"
                        eng = ""
                    }
                    "two" ->{
                        answer += "2"
                        eng = ""
                    }
                    "three" ->{
                        answer += "3"
                        eng = ""
                    }
                    "four" ->{
                        answer += "4"
                        eng = ""
                    }
                    "five" ->{
                        answer += "5"
                        eng = ""
                    }
                    "six" ->{
                        answer += "6"
                        eng = ""
                    }
                    "seven" ->{
                        answer += "7"
                        eng = ""
                    }
                    "eight" ->{
                        answer += "8"
                        eng = ""
                    }
                    "nine" ->{
                        answer += "9"
                        eng = ""
                    }
                    "zero" ->{
                        answer += "0"
                        eng = ""
                    }
                }
            }else{
                answer+=i
            }
        }
        return answer.toInt()
    }
}