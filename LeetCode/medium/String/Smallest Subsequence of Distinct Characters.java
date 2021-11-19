class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        Stack<Character> stk = new Stack<>();

        int[] freq = new int[26];
        boolean[] exist = new boolean[26];
        Arrays.fill(exist, false);

        for(char ch: s.toCharArray()) freq[ch - 'a']++;
        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);
            freq[ch - 'a']--;
            if (exist[ch - 'a']) continue;

            while (!stk.isEmpty() && stk.peek() > ch && freq[stk.peek() - 'a'] > 0) {
                char rem = stk.pop();
                exist[rem - 'a'] = false;
            }

            stk.push(ch);
            exist[ch - 'a'] = true;
        }

        char[] ans = new char[stk.size()];
        int index = 0;
        while (!stk.isEmpty()) {
            ans[index] = stk.pop();
            index++;
        }
        return new StringBuilder(new String(ans)).reverse().toString();
    }
}
