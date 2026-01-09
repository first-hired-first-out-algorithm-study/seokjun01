import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        // 최댓값과 최솟값을 함께 관리하는 경우 TreeMap 사용이 용이
        // 중복 값 들어올 수 있으므로 set아닌 Map
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (String op : operations) {
            String[] split = op.split(" ");
            String command = split[0];
            int value = Integer.parseInt(split[1]);

        
            if (command.equals("I")) {
                
                map.put(value, map.getOrDefault(value, 0) + 1);
            }else if (!map.isEmpty()) {
                // value가 1이면 최댓값(lastKey), -1이면 최솟값(firstKey)
                int targetKey = (value == 1) ? map.lastKey() : map.firstKey();
                int count = map.get(targetKey);
                if (count == 1) {
                    // 개수가 하나뿐이면 트리에서 완전히 제거.
                    map.remove(targetKey);
                } else {
                    // 개수가 여러 개라면 빈도수만 1 줄여줌.
                    map.put(targetKey, count - 1);
                }
            }
        }

        
        // 트리가 비어있으면 [0, 0], 비어있지 않으면 [최댓값, 최솟값]
        if (map.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{map.lastKey(), map.firstKey()};
        }
    }
}