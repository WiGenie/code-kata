class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i=0; i<n; i++){
            long point= (long) x*((long) i+1);
            answer[i]= point;
        }
        return answer;
    }
}