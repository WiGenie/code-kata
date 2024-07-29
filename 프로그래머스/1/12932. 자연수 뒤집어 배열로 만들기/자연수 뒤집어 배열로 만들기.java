class Solution {
    public int[] solution(long n) {
        String s= ""+n;
        int[] answer = new int[s.length()];
        long m=n;
        for (int i=0; i<s.length(); i++){
            answer[i] = (int) (m % 10);
            m = m / 10;
        }
        return answer;
    }
}