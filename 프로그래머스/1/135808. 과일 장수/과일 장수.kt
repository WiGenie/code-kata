class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var lineup=score.sortedDescending()
        if (m > score.size){
            return 0
        }
        else {

            lineup.chunked(m).forEach{

if (it.size == m){

answer+=(it.minOrNull()!! * m)

}
}
        }
return answer
    }
}