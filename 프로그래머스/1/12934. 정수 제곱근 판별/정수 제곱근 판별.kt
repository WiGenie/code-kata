import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var m=n.toDouble()
        var x:Double=sqrt(m)
        if(x%1.0 !=0.0){
            x=-1.0
            answer=x.toLong()
        }
        else if(x%1.0 == 0.0){
            x=x+1
            answer=(x*x).toLong()
        }
        return answer
    }
}