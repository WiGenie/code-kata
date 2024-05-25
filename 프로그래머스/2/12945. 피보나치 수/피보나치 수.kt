class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var a= 0
        var b= 1
        var fn=0
        for (i in 2 .. n){
            fn= (a+b)%1234567
            a=b
            b=fn
        }
        answer= fn
        return answer
    }
}