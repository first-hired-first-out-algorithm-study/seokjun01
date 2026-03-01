class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
       //true면 +, false면 -
        int answer = 0;
        int idx =0;
        
        for(boolean flag : signs) {
          if (flag == true) {
              answer += absolutes[idx++];
          }else {
              answer -= absolutes[idx++];
          }
            
           
        }
        return answer;
    }
}