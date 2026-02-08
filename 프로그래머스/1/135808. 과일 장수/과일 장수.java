import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
      // 과일 장수가 최대 이익을 return
        // m개 담을 수 있고, k점이 최상 , 1점이 최하
        // 사과 가격은 최저 사과 점수 X  한 상자에 담긴 사과 개수 X사과 상자
        // 사과 상자에 다 못담으면 버림
        // 사과 상자 몇개 나오는지 계산 -> 어떻게 최대로 담을지  그 후 곱해서 return
        
        int answer = 0;
        int count = score.length/m;
        int[][] maxArray = new int[count][m];
        int n = score.length-1;
        Arrays.sort(score);
        
       for (int i=0; i<count; i++) {
           for (int j=0; j<m; j++) {
               maxArray[i][j] = score[n--];
           }
       }
        
        for (int[] cal : maxArray) {
            Arrays.sort(cal);
            answer += cal[0] * m ;
        }
        
        return answer;
    }
}