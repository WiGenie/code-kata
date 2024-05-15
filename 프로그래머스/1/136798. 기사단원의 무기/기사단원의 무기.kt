class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for (i in 1 .. number){
            var force: Int= 0 
            for (j in 1 .. i/2){
                if(i%j==0){
                    force++
                }
            }
            force++
            if(force>limit){
                force=power
            }
            answer+=force
        }
        return answer
    }
}