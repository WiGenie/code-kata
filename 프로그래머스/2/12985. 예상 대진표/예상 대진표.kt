class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
        var alpha= a
        var beta= b
        var challenger= n
        
        while ( challenger > 1){
            if((alpha-beta == 1 || alpha-beta == -1) && (minOf(alpha, beta))%2 == 1) break
            challenger= challenger/2
            answer++
            alpha= alpha/2 + alpha%2
            beta= beta/2 + beta%2
        }

        return answer
    }
}