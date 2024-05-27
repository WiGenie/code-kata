class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        var cType=clothes.groupBy{ it[1] }
        cType.map{ (it, value) -> answer= answer*(value.size+1) }
        return answer-1
    }
}