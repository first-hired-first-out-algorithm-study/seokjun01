class Solution {
    public String solution(int[] food) {
        //문제가 난해하다 다시 읽어보자 
        // 음식을 대칭으로 만들어야하는 듯 가운데에 물 "0"을 둬야함
        // 낮은숫자부터 1->2->3->0->3->2->1 이순
        // 대칭으로 음식을 배치해야하므로 짝수개씩 써야함
        //food[0] 은 물을 의미하며 food[i]는 i번 음식의 수를 의미함
        // 일단 대칭부터 맞추자 (홀->짝으로 변환)
         StringBuilder sb = new StringBuilder();
         String answer = "";
        
         for (int i=1; i<food.length; i++) {
            if(food[i] %2 != 0) {
                food[i] = food[i] -1;
            }

             for (int j=1; j<=food[i]/2; j++) {
                sb.append(i);
            }
             
        }
        String front = sb.toString();
        String rev = sb.reverse().toString();
        
        
        answer =front + "0" + rev;
        return answer;
    }
}