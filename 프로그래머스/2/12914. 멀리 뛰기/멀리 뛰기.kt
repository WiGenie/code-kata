class Solution {
    fun solution(n: Int): Long {
        var answer: Long = 0
        var a= 2
        var b= 1
        var f= 0
        if (n== 1) return 1L
        if (n== 2) return 2L
        for  ( i in 3 .. n){
            f = (a + b)%1234567
            b= a
            a= f
            
        }
        answer= f.toLong()
        return answer
    }
}