class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var business=sizes.map{listOf(maxOf(it[0], it[1]), minOf(it[0], it[1]))}
        var busi1=business.map{it[0]}
        var busi2=business.map{it[1]}
        return busi1.maxOrNull()!! * busi2.maxOrNull()!!
        // return answer
    }
}