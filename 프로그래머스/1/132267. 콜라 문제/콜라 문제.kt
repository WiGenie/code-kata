class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = n
        var total: Int= 0
        while (answer >= a){
            total+=(answer/a)*b
            answer=(answer/a)*b+answer%a
        }
        return total
    }
}