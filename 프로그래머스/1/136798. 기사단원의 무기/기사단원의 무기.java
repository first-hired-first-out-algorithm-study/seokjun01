
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] state = new int[number];
        int idx = 0;
        int weight =0;
        
        
        for (int i=1; i<=number; i++) {
            int count =0;
            for (int j = 1; j * j <= i; j++) {
            if (j * j == i) {
                 count++; 
            }else if (i % j == 0) {
                count += 2; 
            }
        }
            state[idx++] = count;
  }
        // 무기 제작에 필요한 철의 무게 구하기
        for (int k : state) {
            if ( k<=limit) {
                weight += k;
            }else {
                weight += power;
            }
        }
        return weight;
    }
}