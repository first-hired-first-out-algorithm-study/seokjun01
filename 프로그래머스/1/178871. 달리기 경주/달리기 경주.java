import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 현재 순위를 기록하고 calling으로 +- 해주고 그 순서대로 꺼내서 다시 담으면 될듯?
        // MAP으로 현재 순위 기록 -> +1 -1하자
        // 앞에 사람 순위를 내려야하는거 ..?
       
        Map<String, Integer> rank = new HashMap<>();
        int idx =0;
     
        for (int i=0; i<players.length; i++) {
            rank.put(players[i],i);
        }
        
        for ( String name : callings) {
            
            int currentRank = rank.get(name);
            String frontPlayer = players[currentRank-1];
            
            players[currentRank-1] = name;
            players[currentRank] = frontPlayer;
            
            rank.put(name ,currentRank-1);
            rank.put(frontPlayer ,currentRank);
        }
        
        
        return players;
    }
}