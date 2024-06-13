class Solution {
    fun solution(s: String): String {
    val answer = s.split(" ").joinToString(" ") {
        it.mapIndexed{ index, c -> if (index % 2 == 0 )c.toUpperCase() else c.toLowerCase() }.joinToString("")
    }
    return answer
}
}