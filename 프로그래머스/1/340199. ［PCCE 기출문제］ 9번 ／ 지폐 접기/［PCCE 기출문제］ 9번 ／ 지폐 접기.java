class Solution {
    public int solution(int[] wallet, int[] bill) {

        int walletLong = Math.max(wallet[0], wallet[1]);
        int walletShort = Math.min(wallet[0], wallet[1]);
        int billLong = Math.max(bill[0], bill[1]);
        int billShort = Math.min(bill[0], bill[1]);
        int answer = 0;

        // 지폐가 지갑에 안 들어가는 동안
        while (billLong > walletLong || billShort > walletShort) {
            billLong /= 2;
            // 다시 정렬
            int temp = Math.max(billLong, billShort);
            billShort = Math.min(billLong, billShort);
            billLong = temp;

            answer++;
        }

        return answer;
    }
}