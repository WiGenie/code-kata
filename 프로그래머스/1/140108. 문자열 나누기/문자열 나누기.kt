class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var xcount= 0
        var othercount= 0
        var switch=1
        var x : String = s[0].toString()
        for (i in 0 until s.length){
            if(switch== 0){
                switch=1
                x=s[i].toString()
            }
            if(s[i].toString() == x){
                xcount++
            }
            else{
                othercount++
            }
            if(xcount == othercount){
                answer++
                xcount=0
                othercount=0
                switch=0
            }
            if(xcount>othercount && i==s.length-1){
                answer++
                break
            }
        }
        
        return answer
    }
}