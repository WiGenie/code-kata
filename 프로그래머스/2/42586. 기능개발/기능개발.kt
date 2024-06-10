class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var dayOver= progresses
        var complete= 0
        while(complete < progresses.size){
            var number=0
            for (i in 0 until dayOver.size){
               dayOver[i]+=speeds[i] 
            }
            if(dayOver[complete] >= 100){
                for(i in complete until progresses.size){
                    if(dayOver[i] >= 100){
                        number++
                        complete++
                    } else if (dayOver[i] < 100) break
                }
                answer.add(number)
            }
        }
        return answer.toIntArray()
    }
}