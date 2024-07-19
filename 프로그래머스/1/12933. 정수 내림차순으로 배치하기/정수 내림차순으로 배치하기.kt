class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var number=n.toString()
        var change=number.toCharArray().sortedArrayDescending()
        answer=String(change).toLong()
        return answer
    }
}