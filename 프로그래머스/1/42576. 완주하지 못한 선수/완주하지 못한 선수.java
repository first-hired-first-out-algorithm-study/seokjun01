import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
      // 해시는 데이터를 빠르게 찾기위해 값을 변환하는 알고리즘이지, 중복을 제거하는 건아님 
    // Hash 로 풀어야 목적에 맞을듯 
    // 참가자 맵을 만들고 , completion 루프를 돌려서 제거하고 남은애 반환
        //동명이인 생각하자
        String answer = "";

        HashMap<String, Integer> participate = new HashMap<>();
        
        for (String pt : participant) {
            participate.put(pt,participate.getOrDefault(pt,0)+ 1);
        }
        
        //완주자에 있으면 값을 -1
        for (String cp : completion) {
            participate.put(cp,participate.get(cp)-1);
        }
        
        // 맵을 순회하는 방법에 대한 고찰
        for ( String key : participate.keySet()) {
                if(participate.get(key) !=0 ){
                    answer = key;
                }
        }
        
        
        return answer;
    }
}