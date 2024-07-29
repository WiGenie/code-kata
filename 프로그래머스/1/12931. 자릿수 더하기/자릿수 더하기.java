import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int m=n;
        while (m>0) {
            answer+= m%10;
            m=m/10;
        }

        return answer;
    }
}