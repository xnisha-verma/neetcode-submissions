class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
    // correct but not much good

    // int left = 0, right = s.length() - 1;
    //         while (left <= right) {
    //             char l = s.charAt(left);
    //             char r = s.charAt(right);
    //             if (!Character.isLetterOrDigit(l) || !Character.isLetterOrDigit(r)) {
    //                 if (!Character.isLetterOrDigit(l)) {
    //                     left++;
    //                 }
    //                 if (!Character.isLetterOrDigit(r)) {
    //                     right--;
    //                 }
    //             } else {
    //                 if (Character.isDigit(l) != Character.isDigit(r)) {
    //                     return false;
    //                 } else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
    //                     return false;
    //                 }
    //                 left++;
    //                 right--;
    //             }
    //         }
    //         return true;