class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        for (i in citations.size downTo 1){
            var pass= citations.filter{ index -> index >= i }.size
            if ( pass >= i )
            return i
        }
        return answer
    }
}