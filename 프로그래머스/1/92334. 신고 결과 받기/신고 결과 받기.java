import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Map<String, List<String>> reporting = new HashMap<>(); 
        Map<String, Integer> count = new HashMap<>(); 
        int[] answer = new int[id_list.length];
        
        for (String str : report) {
            String[] temp = str.split(" ");
            if (!reporting.containsKey(temp[0])) {
                reporting.put(temp[0], new ArrayList<>());   
            }
            
            if (reporting.get(temp[0]).contains(temp[1])) {
                continue;
            }
            
            reporting.get(temp[0]).add(temp[1]);  
            count.put(temp[1], count.getOrDefault(temp[1],0) +1);
        }
        
        for (int i=0; i<id_list.length; i++) {
            String name = id_list[i];
            List<String> list = reporting.get(name);
            
            if(list != null) {
                for (int j=0; j<list.size(); j++) {
                    if (count.getOrDefault(list.get(j),0) >=k) {
                        answer[i]++;
                    }
                }
            }
        }
      
        return answer;
      
    }
}