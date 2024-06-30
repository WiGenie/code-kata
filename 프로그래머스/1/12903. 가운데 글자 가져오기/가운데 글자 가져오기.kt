class Solution {
    fun solution(s: String): String {
        var answer=""
        val size = s.length
        val c = s.map { it }

        if (size % 2 == 0) {
           answer= "${c[size / 2 - 1]}${c[size / 2]}"
        } else {
           answer= "${c[size / 2]}"
        }
        return answer
    }
}