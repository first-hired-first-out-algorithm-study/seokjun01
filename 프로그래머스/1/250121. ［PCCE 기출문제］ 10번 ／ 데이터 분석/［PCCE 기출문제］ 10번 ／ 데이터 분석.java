import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
    
        String[] colNames = {"code", "date", "maximum", "remain"};
        int extIdx = 0, sortIdx = 0;
        
        for(int i=0; i<4; i++){
            if(colNames[i].equals(ext)) extIdx = i;
            if(colNames[i].equals(sort_by)) sortIdx = i;
        }
        
        List<int[]> list = new ArrayList<>();
        for (int[] row : data) {
            if (row[extIdx] < val_ext) {
                list.add(row);
            }
        }
        int sIdx = sortIdx; 
        list.sort((a, b) -> a[sIdx] - b[sIdx]);

        return list.toArray(new int[0][]);
    }
}