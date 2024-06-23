class Solution {
    fun solution(s: String): String {
        var answer = ""
        answer=String(s.toCharArray().sortedArrayDescending())
        return answer
    }
}