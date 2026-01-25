import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        //모든 명함을 수납할 수 있는 가장 작은 지갑 만들기
        //각각 가로 세로 제일 크게 하면 다 수납은 된다 BUT, 가로/세로로 돌려서 넣을 수 있다면
        // 수납하자 
        // 결국 반환해야하는건 지갑의 크기
       
        int maxW = 0;
        int maxH = 0;
        
        // 임의로 명함의 긴쪽을 가로, 짧은 쪽을 세로라고 가정
        for (int[] arr : sizes) {
            int w = Math.max(arr[0], arr[1]);
            int h = Math.min(arr[0], arr[1]);
            
            maxW = Math.max(maxW,w);
            maxH = Math.max(maxH, h);
        }
        
        return maxW * maxH;
        
    }
}