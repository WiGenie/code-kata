class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        val weekday= listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
        val month =listOf(31, 29, 31, 30 ,31, 30 ,31 ,31, 30, 31, 30, 31)
        var day= 0
        for (i in 0 until a-1){
            day+=month[i]
            
        }
        answer=weekday[(day+b)%7]
        return answer
    }
}