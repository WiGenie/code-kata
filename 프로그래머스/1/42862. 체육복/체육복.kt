class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        var losts=lost.sorted().toMutableList()
        var reserves=reserve.sorted().toMutableList()
        
        for (i in losts.toList()){
            if( i in reserves){
                reserves.remove(i)
                losts.remove(i)
            }
        }
        for (j in losts.toList()){
            if(j-1 in reserves){
                losts.remove(j)
                reserves.remove(j-1)
            }
            else if(j+1 in reserves){
                losts.remove(j)
                reserves.remove(j+1)
            }
        }
        answer= n - losts.size
        return answer
    }
}