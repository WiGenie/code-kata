class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = mutableListOf<Int>()
        for (i in arr){
            if(i % divisor == 0){
                answer.add(i)
            }
        }
        if (answer.size == 0){
            answer.add(-1)
        }
        answer.sort()
        return answer.toIntArray()
    }
}