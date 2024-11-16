package Valid_Palindrome_Question;

public class Solution {
    ///
    /// Use in psvm
    /// String s = "Was it a car or a cat I saw?";
    ///   public static void main(String[] args) {
    ///
    ///         System.out.println("/** String **/");
    ///         System.out.println("s");
    ///         System.out.println(" ");
    ///         System.out.println("/** Efficient Method **/");
    ///         System.out.println(isPalindrome(s));
    ///     }
    ///



    public static boolean isPalindrome(String s) {
        char[] sc = s.toCharArray();
        int left = 0, right = sc.length - 1;

        while (left < right) {
            // Skip non-alphanumeric characters (if needed, depending on the input)
            if (!Character.isLetterOrDigit(sc[left])) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(sc[right])) {
                right--;
                continue;
            }

            // Compare characters
            if (Character.toLowerCase(sc[left]) != Character.toLowerCase(sc[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
