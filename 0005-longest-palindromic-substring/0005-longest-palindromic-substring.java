// class Solution {
//     public String longestPalindrome(String s) {
//         String str1 = "";
//         String str = "";
//         String temp = "";
//         for (int i = 0; i < s.length()-1; i++) {
//             for (int j = s.length(); j > i; j--) {
//                 str1 = s.substring(i, j);
//                 if (checkReverse(str1)) {
//                     if (str1.compareTo(temp) > 0)
//                         temp = str1;
//                 }
//             }
//         }
//         return temp;
//     }

//     boolean checkReverse(String s) {
//         int i = 0;
//         int j = s.length() - 1;
//         while (i < j) {
//             if (s.charAt(i) != s.charAt(j)) {
//                 return false;
//             }

//             i++;
//             j--;
//         }
//         return true;
//     }
// }

class Solution {
    public String longestPalindrome(String s) {

        String temp = "";

        for (int i = 0; i < s.length(); i++) {  // Loop through each character
            for (int j = i + 1; j <= s.length(); j++) {  // Adjusted loop to include full length
                String str1 = s.substring(i, j);
                if (checkReverse(str1) && str1.length() > temp.length()) { // Check palindrome & length
                    temp = str1;
                }
            }
        }
        return temp;
    }

    boolean checkReverse(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
