import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        String strNum= ""+n;
        String[] arr= strNum.split("");
        Arrays.sort(arr);
        for(int i=strNum.length()-1; i>=0; i--){
            answer= answer+ arr[i];
        }
        return Long.parseLong(answer);
    }
}