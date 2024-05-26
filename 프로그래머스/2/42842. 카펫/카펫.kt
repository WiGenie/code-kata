class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf(0, 0)
        var vertical= 0
        var horizon= 0
        // @@ horizon >= vertical
        // horizon*2+vertical*2-4 = brown
        // (horizon-2)*(vertical-2) = yellow
        // -> h*v -2h -2v +4 = yellow
        // -> h*v = yellow+brown
        for( i in 3 .. (yellow+brown)){
            vertical= i
            horizon= (yellow+brown)/i
            if(vertical*horizon == yellow+brown
              && horizon*2 + vertical*2 -4 == brown){
                answer= intArrayOf(horizon, vertical)
                break
            }
            else continue
        }
        return answer
    }
}