class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray=intArrayOf(0,0)
        var highrank: Int= 7
        var lowrank: Int= 7
        lottos.forEach{i ->
            
        when(i){
                in win_nums -> {
                    highrank--
                    lowrank--
                }
                0 -> {
                    highrank--
            }
        }
            }
        if(highrank== 7){highrank=6}
        if(lowrank== 7){lowrank=6}
        answer=intArrayOf(highrank,lowrank)
            

        
        return answer
    }
}