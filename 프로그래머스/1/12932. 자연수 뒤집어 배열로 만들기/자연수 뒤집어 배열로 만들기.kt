class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        var list=ArrayList<Long>()
        var m:Long=n
        while(m != 0L){
            list.add(m % 10L)
            m=m/10L
        }
        answer = list.map { it.toInt() }.toIntArray()
        return answer
    }
}