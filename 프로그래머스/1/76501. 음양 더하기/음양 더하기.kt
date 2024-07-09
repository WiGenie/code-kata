class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 123456789
        var sum:Int=0
        for (i in 0 .. absolutes.size-1){
            if(signs[i]==true){
                sum+=absolutes[i]
            }
            else if(signs[i]==false){
                sum+= -absolutes[i]
            }
        }
        answer=sum
        return answer
    }
}