class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        var big= arr.maxOrNull() ?: return 0
        var pass= 0
        var bigplus= big
        while (answer == 0){
            for(i in arr){
                if(big%i != 0){
                    pass= 0
                    break
                }
                pass++
            }
            if (pass == arr.size){
                answer= big
                break
            }
            big= big + bigplus
        }
        return answer
    }
}