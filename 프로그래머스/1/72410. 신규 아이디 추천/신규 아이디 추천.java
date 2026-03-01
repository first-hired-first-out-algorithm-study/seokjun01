class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder(new_id);

        // 소문자로 치환
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
        }

        // 허용되지 않는 문자 제거
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (!(Character.isLowerCase(c) || Character.isDigit(c) || 
                  c == '-' || c == '_' || c == '.')) {
                sb.deleteCharAt(i);
                i--; // 삭제했으니 인덱스를 하나 뒤로 당겨야 함
            }
        }

        //  . 2번 이상을 하나로
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == '.' && sb.charAt(i - 1) == '.') {
                sb.deleteCharAt(i);
                i--;
            }
        }

        // 처음이나 끝의 마침표 제거
        if (sb.length() > 0 && sb.charAt(0) == '.'){
            sb.deleteCharAt(0);
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }
        // 빈 문자열이면 "a" 추가
        if (sb.length() == 0) {
            sb.append("a");
        }
        // 16자 이상이면 자르기 + 끝 마침표 제거
        if (sb.length() >= 16) {
            sb.delete(15, sb.length());
            if (sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        //  2자 이하라면 마지막 문자 반복
        while (sb.length() < 3) {
            sb.append(sb.charAt(sb.length() - 1));
        }

        return sb.toString();
    }
}