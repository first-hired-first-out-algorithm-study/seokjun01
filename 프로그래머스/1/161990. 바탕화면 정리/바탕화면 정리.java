import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    rows.add(i); // 행 번호 수집
                    cols.add(j); // 열 번호 수집
                }
            }
        }

        
        Collections.sort(rows);
        Collections.sort(cols);

        int minX = rows.get(0);
        int minY = cols.get(0);
        int maxX = rows.get(rows.size() - 1) + 1;
        int maxY = cols.get(cols.size() - 1) + 1;

        return new int[]{minX, minY, maxX, maxY};
    }
}