import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
     //배열을 먼저 자른다 -> 정렬한다 -> k번째 인덱스의 값을 꺼낸다.
    // 2차원 배열 commands는 순서대로 i,j,k를 원소로 가진다.
       int[] answer = new int[commands.length];
        
        for (int c=0; c<commands.length; c++) {
            
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];
            
            int[] temp = new int[j-i +1];
            int idx =0;
            
            for (int q=i-1; q<j; q++) {
                temp[idx++] = array[q];
            }
            
            Arrays.sort(temp);
            answer[c] = temp[k-1];
        }
        return answer;
    }
       
}