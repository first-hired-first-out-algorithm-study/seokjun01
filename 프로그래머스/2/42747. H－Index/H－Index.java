import java.util.*;

class Solution {
    public int solution(int[] citations) {
      Arrays.sort(citations); // 오름차순 정렬

        int n = citations.length;

        for (int i = 0; i < n; i++) {
            // 뒤에 남은 논문 수 = n - i
            if (citations[i] >= n - i) {
                return n - i;
            }
        }

        return 0;
    }
}