import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
    
        int n = friends.length;
        int maxGift = 0;
        // 친구이름을 인덱스화
        Map<String, Integer> friendIndex = new HashMap<>();
        for( int i = 0; i<n; i++) {
            friendIndex.put(friends[i], i);
        }
        
        int[][] record = new int[n][n];//선물 주고받은 횟수 기록용 배열 생성
        int[] giftDegree = new int[n]; // 선물지수 (준-받은)
        for(String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];
            
            int giverIdx = friendIndex.get(giver); 
            int receiverIdx = friendIndex.get(receiver); 
            record[giverIdx][receiverIdx]++; //횟수 갱신
            giftDegree[giverIdx]++;
            giftDegree[receiverIdx]--; // 선물지수 갱신
        }
        int[] nextGifts = new int[n]; //다음달 선물 누가받나
        for ( int i=0; i<n; i++) {
           for (int j = i+1; j<n; j++){
            int iToj = record[i][j];
            int jToi = record[j][i];
            
            if (iToj > jToi) {
                nextGifts[i]++;
            } else if(iToj < jToi) {
                nextGifts[j]++;
            } else { // 주고받은 수가 없거나 같아서 선물지수 비교하는 case
                if(giftDegree[i] > giftDegree[j]) {
                    nextGifts[i]++;
                }else if (giftDegree[i] < giftDegree[j]){
                    nextGifts[j]++;
                }else {}
            }
           }
            for (int count : nextGifts) {
                maxGift = Math.max(maxGift, count) ;
            }
        }
        return maxGift;
    }
}