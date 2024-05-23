class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        if (!want.all {it in discount}) return 0
        var result= 0
        for (i in 0 .. discount.size-10){
            var enough= IntArray(want.size)
            var dcDay= discount.slice(i until i+10)
            dcDay.forEach{ j ->
                val sameThing = want.indexOf(j)
                if (sameThing != -1){
                    enough[sameThing]++
                }
            }
            var passTime= 0
            for ( k in 0 until want.size){
                if (number[k] <= enough[k]){
                    passTime++
                }
            }
            if (passTime == want.size){
                // println(i)
                result++
            }
        }
        return result
    }
}