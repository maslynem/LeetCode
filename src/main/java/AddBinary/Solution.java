package AddBinary;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 */
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int add = 0;
        while (i >= 0 || j >= 0) {
            int sum = add;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            add = sum / 2;
        }
        if (add == 1) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}