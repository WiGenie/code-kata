class Solution {
    public long solution(long n) {
        long answer = -1;
        long varNum= (long) Math.sqrt(n);
        if (Math.sqrt(n)%1 == 0){
            varNum=varNum+1;
            answer=varNum*varNum;
        }
        return answer;
    }
}