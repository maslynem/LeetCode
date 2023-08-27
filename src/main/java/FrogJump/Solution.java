package FrogJump;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = stones.length;
        for (int i = 0; i < n; i++) {
            map.put(stones[i], i); // Сохраняем в мапу камень и его индекс
        }
        boolean[][] dp = new boolean[n][n];
        for (boolean[] arr : dp) {
            Arrays.fill(arr, false);
        }

        dp[0][0] = true;
        for (int index = 0; index < n; index++) {
            for (int prevJump = 0; prevJump < n; prevJump++) {
                if (dp[index][prevJump]) {
                    if (map.containsKey(stones[index] + prevJump)) { // проверяем существует ли камень, если прыгнем на prevJump
                        dp[map.get(stones[index] + prevJump)][prevJump] = true; //если камень существует, то в dp добавляем этот камень и длину прыжка
                    }
                    if (map.containsKey(stones[index] + prevJump + 1)) {
                        dp[map.get(stones[index] + prevJump + 1)][prevJump + 1] = true;
                    }
                    if (map.containsKey(stones[index] + prevJump - 1)) {
                        dp[map.get(stones[index] + prevJump - 1)][prevJump - 1] = true;
                    }
                }
            }
        }
        for (int index = 0; index < n; index++) { // перебираем все возможные длины прыжка для последнего камня
            if (dp[n - 1][index]) {
                return true;
            }
        }
        return false;
    }


}
