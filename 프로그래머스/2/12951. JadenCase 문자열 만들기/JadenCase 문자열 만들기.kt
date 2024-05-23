class Solution {
    fun solution(s: String): String {
var answer = s.split(" ").joinToString(" ") { it.lowercase().replaceFirstChar { it.titlecase() } }

        return answer
    }
}