import java.util.Arrays;

public class FirstLastPostition {

    public static int[] searchRange(int nums[], int target){
        int left = 0, right = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                int i = mid-1;
                int j = mid+1;
                while (i>=0 && nums[i] == target) {
                    i--;
                }
                while (j<nums.length && nums[j] == target) {
                    j++;
                }
                return new int[]{i+1, j-1};
            } else if(nums[mid] > target){
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String args[]){
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
