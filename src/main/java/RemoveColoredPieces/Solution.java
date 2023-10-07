package RemoveColoredPieces;

/**
 * There are n pieces arranged in a line, and each piece is colored either by 'A' or by 'B'. You are given a string colors of length n where colors[i] is the color of the ith piece.
 * <p>
 * Alice and Bob are playing a game where they take alternating turns removing pieces from the line. In this game, Alice moves first.
 * <p>
 * Alice is only allowed to remove a piece colored 'A' if both its neighbors are also colored 'A'. She is not allowed to remove pieces that are colored 'B'.
 * Bob is only allowed to remove a piece colored 'B' if both its neighbors are also colored 'B'. He is not allowed to remove pieces that are colored 'A'.
 * Alice and Bob cannot remove pieces from the edge of the line.
 * If a player cannot make a move on their turn, that player loses and the other player wins.
 * Assuming Alice and Bob play optimally, return true if Alice wins, or return false if Bob wins.
 */

class Solution {
    public boolean winnerOfGame(String colors) {
        int alice = 0;
        int bob = 0;
        char[] charArray = colors.toCharArray();
        for (int i = 1; i < charArray.length - 1; i++) {
            if (charArray[i - 1] == charArray[i] && charArray[i] == charArray[i + 1]) {
                if (charArray[i] == 'A') {
                    alice++;
                } else {
                    bob++;
                }
            }
        }
        return alice >= bob;
    }
}