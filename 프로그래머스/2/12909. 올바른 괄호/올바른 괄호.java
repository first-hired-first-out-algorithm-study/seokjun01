class Solution {
    boolean solution(String s) {
      
        char[] arr = s.toCharArray();
        int count1 = 0; // '(' 개수
        int count2 = 0; // ')' 개수

        
        if (arr.length > 0 && arr[0] == ')') {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                count1++;
            } else {
                count2++;
            }

            
            if (count2 > count1) {
                return false;
            }
        }

       
        if (count1 == count2) {
            return true;
        } else {
            return false;
        }
    }
}