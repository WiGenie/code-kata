class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var half: String=""
        for(i in 1 until food.size){
            if(food[i] <= 1){
                continue
            }
                for(j in 1 .. food[i]/2){
                    half+=i
                }
        }
        answer="${half}0${half.reversed()}"
        return answer
    }
}