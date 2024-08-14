class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        
        if ( n in 1 .. 3000)
          for (i in 1 .. n){
            if (n%i == 0){
                answer = answer + i
            }
            else {
                continue
            }
        }
          else if (n == 0){
              println("0은 약수가 존재하지 않아요")
          }
          else {
              println("0 이상 3000 이하의 수만 가능해요")
          }
          
        
        return answer
    }
    }