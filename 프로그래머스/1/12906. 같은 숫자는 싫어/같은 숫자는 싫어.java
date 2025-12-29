import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        int count = 0;
        int pre = -1;

        for (int i : arr) {
            if (pre != i) {
                count++;
                pre = i;
            }
        }
        
        int[] answer = new int[count];

        int idx = 0;
        pre = -1;

        for (int k : arr) {
            if (k != pre) {
                answer[idx++] = k;
                pre = k;
            }
        }

        return answer;
    }
}
