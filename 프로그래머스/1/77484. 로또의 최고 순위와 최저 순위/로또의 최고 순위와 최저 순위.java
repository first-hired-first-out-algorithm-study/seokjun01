import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int maxRank = 1;
        int minRank = 6;
        int count = 0;
        int zeroCount = 0;
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
            } else {
                for (int n : win_nums) {
                    if (lottos[i] == n) {
                        count++;
                    }
                }
            }
        }
        
        
        if (count + zeroCount == 6) {
            maxRank = 1;
            minRank = 1 + zeroCount; 
        } else if (count + zeroCount == 5) {
            maxRank = 2;
            minRank = 2 + zeroCount;
        } else if (count + zeroCount == 4) {
            maxRank = 3;
            minRank = 3 + zeroCount;
        } else if (count + zeroCount == 3) {
            maxRank = 4;
            minRank = 4 + zeroCount;
        } else if (count + zeroCount == 2) {
            maxRank = 5;
            minRank = 5 + zeroCount;
        } else {
            maxRank = 6;
            minRank = 6;
        }
        
        if (minRank > 6) minRank = 6;
        if (maxRank < 1) maxRank = 1;
        
        answer[0] = maxRank;
        answer[1] = minRank;
        
        return answer;
    }
}