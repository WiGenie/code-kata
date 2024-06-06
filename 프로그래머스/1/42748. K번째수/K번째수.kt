class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer= mutableListOf<Int>()
        for (i in 0 until commands.size){
                  var new = mutableListOf<Int>()
        for (j in commands[i][0]-1 until commands[i][1]){
            new.add(array[j])
        }
        new.sort()
        answer.add(new[commands[i][2]-1])
        
        }

        
        return answer.toIntArray()
    }
}