class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var status: Int = 1
        for (i in left .. right){
            for (j in 1 .. i+1/2){
                if(i%j == 0){
                    status+= 1
                }
            }
            if(status%2 == 0){
                answer-=i
            }
            else{
                answer+=i
            }
            status=1
        }
        return answer
    }
}