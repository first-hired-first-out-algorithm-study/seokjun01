import java.util.*;
class Solution {
    public int solution(int n) {
        int x = n-1;
        int y = 0;
        int answer = 0;
        while(true) {
            y++;
            if(n % x ==1 && n % y ==1) {
             x= Math.min(x,y);           
            answer =x;
            break;
            }
            
        }
        return answer;
    }
}