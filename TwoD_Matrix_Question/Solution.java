package TwoD_Matrix_Question;

public class Solution
{
    public static void main(String[] args) {
        int[][] nums = {{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        int target = 10;
        System.out.println(searchMatrix(nums,target));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int[] m : matrix){
            for(int n : m){
                if(n == target) return true;
            }
        }
        return false;
    }
}
