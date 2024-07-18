class Solution {
    fun solution(x: Int): Boolean {
var sum=0
var a=0
        var m=x
        while(m !=0){
            sum= m % 10
        a=sum + a
            m= m/10
        }
        if (x % a == 0){
            return true
        }
        else {
            return false
        }
    }
}