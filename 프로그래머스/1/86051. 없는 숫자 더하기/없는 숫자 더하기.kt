class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        answer= (0 .. 9).filter{!numbers.contains(it)}.sum()
        return answer
    }
}