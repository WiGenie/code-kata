class Solution {
    fun solution(s: String): Int {
        val changer= arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
var answer= s
    for ( i in 0 until changer.size){
        answer= answer.replace(changer[i], i.toString()) 
    }
        return answer.toInt()
    }
}