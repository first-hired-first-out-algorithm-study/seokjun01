import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
     // 해시로 어떻게 해결할 수 있을까
        // 항상 0번 인덱스 기준으로 접두어 확인하는건 옳지 않음
    /*    boolean answer = true;
        String cr = phone_book[0];
        for (int i=1; i<phone_book.length; i++) {
            if (phone_book[i].contains(cr)) {
                return false;
                }
            } */
        
        
        boolean answer =true;
        Set<String> set = new HashSet<>();
        
        for (String num : phone_book) {
            set.add(num);   // 순서 보장 X , 중복 제거 
        }
        
        for (String num : phone_book) {
            
            for (int i=1; i<num.length(); i++ ) {
                String pre = num.substring(0,i); 
                if ( set.contains(pre)) {
                    return false;
                }
            }
        }
    
        return answer; 
        }
    }
