import java.util.*;

class Solution {
    public String solution(int[] numbers) {
     // 배열안의 값을 다붙여서 제일 큰 값으로 반환해라 
    // 붙이려면 일단 문자열 배열로 변환 
        
        String[] arr = new String[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort( arr , (a,b) -> (b+a).compareTo(a+b));
        if(arr[0].equals("0")) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}