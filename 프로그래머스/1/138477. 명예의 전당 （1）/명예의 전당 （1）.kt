
class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        // var answer: IntArray = intArrayOf()
        var answer= mutableListOf<Int>()
        var list= mutableListOf<Int>()
        for (i in 1 .. score.size){
            list.clear()
            if (i <= k){
                for(j in 0 until i){
                list.add(score[j])
                }
                if (list.size > 0){
            list.sort()  
            answer.add(list[0])
            }
            }
            if (i > k){
                for(j in 0 until i){
                list.add(score[j])
                }
                if (list.size > 0){
            list.sortDescending()
            answer.add(list[k-1])
            }
            }
            
        }
        
        return answer.toIntArray()
    }
}