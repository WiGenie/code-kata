class Solution {
    fun solution(numbers: IntArray): IntArray {
        // var answer: IntArray = intArrayOf()
        var answer=mutableListOf<Int>()
var nsize=numbers.size
        for (i in 0 until nsize-1){
            for (j in i+1 until nsize){
                if(numbers[i]+numbers[j] !in answer){
                answer.add(numbers[i]+numbers[j])
                }
                else{
                    continue
                }
                    }
                }
        answer.sort()
        return answer.toIntArray()
    }
}