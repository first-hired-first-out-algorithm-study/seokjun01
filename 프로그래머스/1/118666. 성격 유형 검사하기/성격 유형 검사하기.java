import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        // 0-6 -> 3점 ( 인덱스 기준)
        // 1-5-> 2점
        // 2-4 -> 1점
        // 3 -> 0점
        // (R, T ), (F , C) ,( M , J) ,( A, N) -> survey 중 하나 각각 카운팅 필요
        //예를 들어 RT라면  R이 012/ T가 456으로 판별
        Map<Integer, Integer> points = new HashMap<>();
        Map<Character, Integer> mbti = new HashMap<>();
        points.put(1,3);
        points.put(2,2);
        points.put(3,1);
        points.put(4,0);
        points.put(5,1);
        points.put(6,2);
        points.put(7,3);
        for (int i =0; i<survey.length; i++) {
            String check = survey[i];
            char c =' ';
            if (choices[i] <4) {
                c = check.charAt(0);
            }else if (choices[i] > 4) {
                c = check.charAt(1);
            }else {
                continue;
            }
            mbti.put(c, mbti.getOrDefault(c, 0) + points.get(choices[i]));
        }
        
        StringBuilder sb = new StringBuilder();
    
        if (mbti.getOrDefault('R', 0) >= mbti.getOrDefault('T', 0)) {
            sb.append("R");
        } else {
            sb.append("T");
        }
        if (mbti.getOrDefault('C', 0) >= mbti.getOrDefault('F', 0)) {
            sb.append("C");
        } else {
            sb.append("F");
        }
        if (mbti.getOrDefault('J', 0) >= mbti.getOrDefault('M', 0)) {
            sb.append("J");
        } else {
            sb.append("M");
        }

        if (mbti.getOrDefault('A', 0) >= mbti.getOrDefault('N', 0)) {
            sb.append("A");
        } else {
            sb.append("N");
        }
        
        String answer = sb.toString();
        return answer;
    }
}