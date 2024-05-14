class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var i: Int= 0
        var j: Int= 0
        for (k in section){
            if(k > j){
                j= k+m-1
                answer++
            }
        }
        return answer
    }
}