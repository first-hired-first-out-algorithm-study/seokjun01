import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        // 상수가 포장하는 햄버거의 갯수 반환
        // 1은 빵 2는 야채 3은 고기 
        // 빵 야채 고기 빵 -> 이게 1개  즉 1이 2개 , 2가 1개 3이 1개 있어야 1개의 햄버거
        // 갯수 말고 순서가 동일해야 함 
        // 1-2-3-1 구조가 유지되어야하고 일치하면 배열에서 뺸다 그리고 다시 루프돌려서 1-2-3-1구 조를 유지하는지 확인한다
        int answer = 0;
        List<Integer> burger = new ArrayList<>();
        
        for ( int i : ingredient) {
            burger.add(i);
            
            if (burger.size() >=4) {
                if (burger.get(burger.size()-4) == 1&& 
                    burger.get(burger.size()-3) == 2 &&
                    burger.get(burger.size()-2) == 3 &&
                    burger.get(burger.size()-1) == 1) {
                    answer ++;
                
                for (int j=0; j<4; j++) {
                    burger.remove(burger.size()-1);
                }
            }
        }
    }
        
        return answer;
    }
}