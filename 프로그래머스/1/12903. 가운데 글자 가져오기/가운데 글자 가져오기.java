class Solution {
    public String solution(String s) {
        int v = s.length();
        int mid = v / 2; 

        if (v % 2 == 0) {
            return s.substring(mid - 1, mid + 1);
        } else {
            return String.valueOf(s.charAt(mid));
        }
    }
}