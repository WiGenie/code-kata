class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf(0, 0, 0)
        var person1= intArrayOf(1, 2, 3, 4, 5)
        var person2= intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var person3= intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        for (i in 0 until answers.size){
            if (answers[i] == person1[i%5]){
                answer[0]=answer[0] +1
            }
            if (answers[i] == person2[i%8]){
                answer[1]=answer[1] +1
            }
            if (answers[i] == person3[i%10]){
                answer[2]=answer[2] +1
            }
        }
        var rank= mutableListOf<Int>()
        for(j in 0 until answer.size){
            if (answer[j]== answer.maxOrNull()){
                rank.add(j+1)
            }
        }
        
        return rank.toIntArray()
    }
}