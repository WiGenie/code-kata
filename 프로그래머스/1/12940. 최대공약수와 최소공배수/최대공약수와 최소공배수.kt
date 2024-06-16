class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()
        answer=intArrayOf(gcd(n,m), (n*m)/gcd(n,m))
        return answer
    }
}
fun gcd( a: Int, b: Int):Int{
    val big= a
        val small= b
    return if (small==0){
        big
    }else {
        gcd(small, big%small)
    }
}