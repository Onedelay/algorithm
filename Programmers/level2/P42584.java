package programmers.level2;

// 레벨 2 : 주식가격
public class P42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j]) count++;
                else {
                    count++;
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}