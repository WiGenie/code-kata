class Solution {
    fun solution(n: Int): String {
        var answer = ""
            for (i in 1 .. n/2){
             answer="${answer}수박"
            }
if (n%2 != 0){
    answer="${answer}수"
}
        
        return answer
    }
}