class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int max = 1;
        int c = 0;
        HashSet<Integer> h1 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            h1.add(nums[i]);
        }
        for (int no : h1) {
            if (!h1.contains(no - 1)) {
                c++;
                int x = no;
                while (h1.contains(x+1)) {
                    x += 1;
                    c++;
                }
                max = Math.max(max, c);
                c=0;
            }
        }

        return max;
    }
}