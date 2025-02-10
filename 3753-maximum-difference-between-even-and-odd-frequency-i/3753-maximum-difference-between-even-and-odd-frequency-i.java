class Solution {
    public int maxDifference(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int even = Integer.MAX_VALUE;
        int odd = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 == 0 && freq[i] > 0) {
                even = Math.min(even, freq[i]);
            } else if (freq[i] % 2 != 0) {
                odd = Math.max(odd, freq[i]);
            }
        }
        return odd - even;
    }
}