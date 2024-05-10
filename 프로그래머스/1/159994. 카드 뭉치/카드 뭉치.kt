class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"
        var num1= 0
        var num2= 0
        
        goal.forEach{
            when(it){
                cards1.getOrNull(num1) -> num1++
                cards2.getOrNull(num2) -> num2++
            else -> {
                answer="No"
                return answer
            }
            }
        }
        
        return answer
    }
}