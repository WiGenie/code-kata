class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        
        
        for (i in 0 .. t.length-p.length){
            var pSet: String= ""
            for (j in 0 until p.length){
                pSet+=t[i+j]
            }
            if (pSet.toLong() <= p.toLong()){
                answer++
            }
        }
        return answer
    }
}