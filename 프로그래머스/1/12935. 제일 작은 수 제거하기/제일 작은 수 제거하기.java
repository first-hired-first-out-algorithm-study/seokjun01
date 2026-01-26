import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        
        int mini = arr[0];
        for (int i : arr) {
            mini = Math.min(i, mini);
        }

        int[] answer = new int[arr.length - 1];
        int count = 0;

       
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == mini) {
                continue; 
            }
            answer[count++] = arr[j];
        }

        return answer;
    }
}