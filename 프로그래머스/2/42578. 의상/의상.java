import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
// [의상의 이름 ,의상의 종류]
// 종류별로 하나 씩만 착용가능     
// 다른 옷의 조합의 수를 return
// 이거랑 hash랑 뭔상관 ?..
// Map 으로 카테고리 넣어서 카테고리별 갯수 * 순열 ?
/* 
Map으로 각 종류별 의상이 몇 개인지만 센다.
각 종류별로 (의상 개수 + 1)을 구해서 모두 곱한다.마지막에 딱 1을 뺀다.
*/
        
//아 어차피 중복된 옷은 없고 옷을 넣는게아니라 옷의 종류를 갯수로 넣는거
        Map<String,Integer> map = new HashMap<>();
        
        for (String[] str : clothes) {
            map.put(str[1], map.getOrDefault(str[1],0) +1);
        }
        
        int count = 1;
       for (int val : map.values()) {
        count *= (val + 1);
            }
        
        
        
        return count -1;
    }
}