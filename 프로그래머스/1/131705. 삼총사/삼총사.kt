class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        var nsize=number.size
        for (i in 0 until nsize-2){
            for (j in i+1 until nsize-1){
                for(k in j+1 until nsize){
                    if (number[i]+number[j]+number[k] == 0){
                        answer++
                    }
                }
            }
        }
        return answer
    }
}