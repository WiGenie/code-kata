class Solution {
    fun solution(s: String): IntArray {
        // var answer: IntArray = intArrayOf()
        var answer= mutableListOf<Int>()
        var ss: String = s.reversed()
        
        for(i in 0 until ss.length){
            var jump= 0
            for (j in i+1 until ss.length ){
                if(ss[i] == ss[j]){
                    jump++
                    answer.add(jump)
                    break
                }
                if(ss[i] != ss[j]){
                    jump++
                }
                if (ss[i] != ss[j] && j == ss.length-1){
                    jump= -1
                    answer.add(-1)
                }
            }
        }
        answer.add(-1)
        answer= answer.reversed().toMutableList()
        return answer.toIntArray()
    }
}