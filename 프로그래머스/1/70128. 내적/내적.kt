class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        for (i in 1 .. a.size){
            answer+=a[i-1]*b[i-1]
        }
        return answer
    }
}