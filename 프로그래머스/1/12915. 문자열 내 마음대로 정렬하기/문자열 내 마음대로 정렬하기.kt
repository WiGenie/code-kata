class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
       // var answer = arrayOf<String>()
            strings.sort()
            var answer=strings
            answer.sortBy{it[n]}
        
        return answer
    }
}