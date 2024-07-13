class Solution {
    fun solution(num: Int): Int {
        var num2=num.toLong()
        var chance = 0
        while(num2 != 1L){
            if (chance>500){
            chance=-1
                break
        }
            if (num2 % 2 == 0L){
                num2=num2/2L
                chance++
            }
            else if (num2 % 2L == 1L){
                num2=num2*3L + 1L
                chance++
            }
        }
        if (num == 1){
            chance=0
        }
        
        return chance
    }
}