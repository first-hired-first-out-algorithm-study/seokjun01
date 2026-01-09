import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 고를 수 있는 제약사항 (2/N)
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i,map.getOrDefault(i,0) +1);
        }
        
      
        if (map.size()> (nums.length)/2) {
            answer = (nums.length)/2;
        }else {
             answer = map.size();
        }
        
        return answer;
    }
}