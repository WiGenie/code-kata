class Solution {
    fun solution(s: String): Boolean {
        if (s.length== 4 || s.length== 6){
             try{
                 s.toInt()
                 return true
             } catch(e: Exception){
                 return false
             }
        }
        else {
            return false
        }
    }
}