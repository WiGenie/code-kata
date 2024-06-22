class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var total: Long= 0
        var answer: Long = -1
        for (i in 1 .. count){
            total+=i*price
        }
        if (money>= total){
            return 0
        }
        else{
            return total-money
        }
    }
}