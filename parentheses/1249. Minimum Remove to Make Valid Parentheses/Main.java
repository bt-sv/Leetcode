// iterate 2 times.
// 1st time to confirm the max number of parentheses pairs.
// 2nd time to get the result.
class Solution {
    public String minRemoveToMakeValid(String s) {
        int left = 0, right = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++;
            } else if (c == ')') {
                right++;
                if (right > left) {
                    right--;
                }
            }
        }
        // max is right;
        int max = right;
        left = 0;
        right = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (left < max) {
                    sb.append('(');
                    left++;
                }
            } else if (c == ')') {
                if (right < left) {
                    sb.append(')');
                    right++;
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
