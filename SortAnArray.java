// 912. Sort An Array

import java.util.Arrays;
public class SortAnArray {

    public static int[] sortArray(int nums[]){
        for(int i=1; i<nums.length; i++){
            if(nums[i] >= nums[i-1]) continue;
            int curr = nums[i];
            int prev = i-1;
            while(prev >=0 && nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
        return nums;
    }
    public static void main(String args[]){
        int nums[] = {5,2,3,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
