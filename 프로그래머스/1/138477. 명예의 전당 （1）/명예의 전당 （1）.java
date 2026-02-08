import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
    // 상위 k번째의 점수까지만 명예의 전당에 오를 수 있다.
    // 매일매일 k번째까지의 점수중 최하위의 점수만 담아서 반환하라
        // list로 하는게 나으려나 ?
        // k개의 원소만 유지하자
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];
        
        for (int i=0; i<score.length; i++) {
            list.add(score[i]);
            Collections.sort(list);
            
            if (list.size() > k) {
                list.remove(0);
            }
            answer[i] = list.get(0);
        }
        
     
        return answer;
    }
}