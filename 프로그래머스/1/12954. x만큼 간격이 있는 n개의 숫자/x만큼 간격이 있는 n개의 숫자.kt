class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        var list= ArrayList<Long>()
        if( x in -10000000 .. 10000000 && n in 1 .. 1000){
            for (i in 1 .. n){
                list.add(i.toLong()*x)
            }
        }
        answer=list.toLongArray()
        return answer
    }
}