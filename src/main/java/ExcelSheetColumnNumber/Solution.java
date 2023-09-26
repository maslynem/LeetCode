package ExcelSheetColumnNumber;

/**
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
 */
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = columnTitle.length() - 1, j = 0; i >= 0; i--, j++) {
            int ch = columnTitle.charAt(i) - 'A' + 1;
            result += ch * (int)Math.pow(26, j);
        }
        return result;
    }
}