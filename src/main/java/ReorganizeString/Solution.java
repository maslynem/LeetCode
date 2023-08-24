package ReorganizeString;

/**
 * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
 * Return any possible rearrangement of s or return "" if not possible.
 * Constraints:
 * 1 <= s.length <= 500
 * s consists of lowercase English letters.
 */
public class Solution {
    // First Solution
    public String reorganizeString(String s) {
        int[] charCounts = new int[26];
        int maxCount = 0;
        int letterIndex = 0;
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
            if (charCounts[c - 'a'] > maxCount) {
                maxCount = charCounts[c - 'a'];
                letterIndex = c - 'a';
            }
        }

        if (maxCount > (s.length() + 1) / 2) {
            return "";
        }
        char[] ans = new char[s.length()];
        int index = 0;

        while (charCounts[letterIndex] != 0) {
            ans[index] = (char) (letterIndex + 'a');
            index += 2;
            charCounts[letterIndex]--;
        }

        for (int i = 0; i < charCounts.length; i++) {
            while (charCounts[i] > 0) {
                if (index >= s.length()) {
                    index = 1;
                }
                ans[index] = (char) (i + 'a');
                index += 2;
                charCounts[i]--;
            }
        }
        return String.valueOf(ans);
    }

//     Second Solution

//        public String reorganizeString(String s) {
//        if (s.isEmpty()) return s;
//        int[] charCount = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            charCount[ch - 'a']++;
//        }
//        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[1], a[1]));
//        for (int i = 0; i < 26; i++) {
//            if (charCount[i] > 0) {
//                pq.offer(new int[]{i + 'a', charCount[i]});
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        while (!pq.isEmpty()) {
//            int[] first = pq.poll();
//            if (sb.length() == 0 || sb.charAt(sb.length()-1) != first[0]) {
//                sb.append((char)first[0]);
//                if(--first[1] > 0) {
//                    pq.offer(first);
//                }
//            } else {
//                if (pq.isEmpty()) return "";
//                int[] second = pq.poll();
//                sb.append((char) second[0]);
//                if (--second[1] > 0) {
//                    pq.offer(second);
//                }
//                pq.offer(first);
//            }
//        }
//        return sb.toString();
//    }
}
