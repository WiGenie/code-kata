class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        var num= 0

        for(i in 0 until nums.size-2){
            for(j in 1+i until nums.size-1){
                for(k in 1+j until nums.size){
                    num= nums[i]+ nums[j]+ nums[k]
                    var check= 0
                    for(l in 2 until num){
                        if(num%l == 0){
                            check++
                        }
                    }
                    if (check == 0){
                        answer++
                    }
                }
            }
        }

        return answer
    }
}