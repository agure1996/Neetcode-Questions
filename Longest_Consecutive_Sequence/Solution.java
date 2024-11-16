package Longest_Consecutive_Sequence;

import java.util.*;

public class Solution {


//    public static void main(String[] args) {
//
//        int[] nums = {0,3,2,5,4,6,1,1};
//
//        System.out.println("/** Sorted Nums Array **/");
//        System.out.println(Arrays.toString(Arrays.stream(nums).toArray()));
//        System.out.println(" ");
//        System.out.println("/** Brute Method **/");
//        System.out.println(longestConsecutiveBrute(nums));
//        System.out.println(" ");
//        System.out.println("/** Efficient Method **/");
//        System.out.println(longestConsecutiveEfficient(nums));
//    }
    public static int longestConsecutiveBrute(int[] nums) {
        Arrays.sort(nums);
        if(nums.length ==0) return 0;

        // Initialize variables to track the longest sequence
        int maxLength = 1;      // Stores the longest sequence length
        int currentLength = 1;  // Length of the current consecutive sequence

        // Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Check if current number is exactly 1 more than the previous number
            if (nums[i] == nums[i - 1] + 1) {
                currentLength++;  // Increase current sequence length
            }
            // If it's the same as the previous, skip to avoid resetting the count
            else if (nums[i] != nums[i - 1]) {
                // Update maxLength if the current sequence is the longest so far
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;  // Reset current sequence length
            }
        }

        // Final check in case the longest sequence is at the end of the array
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;

    }

    public static int longestConsecutiveEfficient(int[] nums){
        // Edge case: if nums is empty, return 0
        if (nums.length == 0) return 0;

        // Use a set to store all unique numbers
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;

        // Iterate over each number in the set
        for (int num : numSet) {
            // Check if it is the start of a sequence (making sure theres not a number lower than it by 1 that could start the sequence)
            if (!numSet.contains(num - 1)) { // Only start counting if `num` is the beginning
                int currentNum = num;
                int currentLength = 1;

                // Count consecutive sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update max length if current sequence is longer
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}

