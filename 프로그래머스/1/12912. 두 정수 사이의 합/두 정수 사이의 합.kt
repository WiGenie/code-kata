class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        var sum:Long=0
        if (a<=b){
          for (i in a.toLong() .. b.toLong()){
            sum+= i
        }  
        }
        else {
            for (i in b.toLong() .. a.toLong()){
            sum+= i
        }  
        }
        answer=sum
        return answer
    }
}