class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        var num:Int=0
        for (i in seoul){
            if(i == "Kim"){
                answer="김서방은 ${num}에 있다"
            }
            num++
        }
        return answer
    }
}