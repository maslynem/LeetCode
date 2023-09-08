package MaximumIceCreamBars;

import java.util.Arrays;

/**
 * It is a sweltering summer day, and a boy wants to buy some ice cream bars.
 * <p>
 * At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible.
 * <p>
 * Note: The boy can buy the ice cream bars in any order.
 * <p>
 * Return the maximum number of ice cream bars the boy can buy with coins coins.
 */
class Solution {
        public int maxIceCream(int[] costs, int coins) {
            if (costs.length == 0) return 0;
            int max = Arrays.stream(costs).max().getAsInt();
            int[] table = new int[max+1];
            for (int i : costs) {
                table[i]++;
            }
            int result = 0;
            for (int i = 0; i < table.length; i++) {
                if (i > coins) {
                    break;
                }
                if (table[i] != 0) {
                    if (table[i] * i < coins) {
                        result += table[i];
                        coins -= table[i] * i;
                    } else {
                        while (coins >= i && table[i] != 0) {
                            coins -= i;
                            result++;
                            table[i]--;
                        }
                    }
                }
            }
            return result;
        }

//    public int maxIceCream(int[] costs, int coins) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(costs.length);
//        for (int i : costs) {
//            if (i <= coins) {
//                priorityQueue.add(i);
//            }
//        }
//        int result = 0;
//        while (coins > 0 && !priorityQueue.isEmpty()) {
//            coins -= priorityQueue.poll();
//            if (coins >= 0) {
//                result++;
//            }
//        }
//        return result;
//    }
}