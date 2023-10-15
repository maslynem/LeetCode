package GuessNumberHigherOrLower;

/**
 * Forward declaration of guess API.
 * param  n   your guess
 * return 	     -1 if num is higher than the picked number
 * 1 if num is lower than the picked number
 * otherwise return 0
 * int guess(int num);
 * <p>
 * We are playing the Guess Game. The game is as follows:
 * <p>
 * I pick a number from 1 to n. You have to guess which number I picked.
 * <p>
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * <p>
 * You call a pre-defined API int guess(int num), which returns three possible results:
 * <p>
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mod = left + (right - left) / 2;
            int guessResult = guess(mod);
            if ( guessResult == 0) {
                return mod;
            } else if (guessResult == 1) {
                left = mod + 1;
            } else {
                right = mod - 1;
            }
        }
        return left;
    }
}