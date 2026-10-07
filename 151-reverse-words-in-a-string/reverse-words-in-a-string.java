class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String ans = "";

        int i = words.length - 1;

        while (i >= 0) {

            if (ans.isEmpty()) {
                ans = words[i];
            } else {
                ans = ans + " " + words[i];
            }

            i--;
        }

        return ans;
    }
}