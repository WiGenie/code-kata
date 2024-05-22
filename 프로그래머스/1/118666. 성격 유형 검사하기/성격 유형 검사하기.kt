class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
var personality= arrayOf('R', 'T', 'C', 'F', 'J', 'M', 'A', 'N')
    var score=IntArray(8){0}

    for (i in 0 until survey.size){
        score[personality.indexOf(survey[i][1])] +=choices[i]-4
    }
    for (j in 0 until 8 step 2){
        if(score[j]>=score[j+1]){
            answer+= personality[j]
        }
        else{
            answer+= personality[j+1]
        }
    }
        return answer
    }
}