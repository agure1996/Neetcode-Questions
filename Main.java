import java.util.Arrays;

import static Longest_Consecutive_Sequence.Solution.*;

public class Main {

    public static void main(String[] args) {

    int[] nums = {0,3,2,5,4,6,1,1};

        System.out.println("/** Sorted Nums Array **/");
        System.out.println(Arrays.toString(Arrays.stream(nums).toArray()));
        System.out.println(" ");
        System.out.println("/** Brute Method **/");
        System.out.println(longestConsecutiveBrute(nums));
        System.out.println(" ");
        System.out.println("/** Efficient Method **/");
        System.out.println(longestConsecutiveEfficient(nums));
    }
}
