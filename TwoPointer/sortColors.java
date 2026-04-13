package TwoPointer;
public class sortColors {

    public static void SortColors(int nums[]){
        int n = nums.length;
        int low=0, mid=0, high=n-1;
        while(mid <= high){
            if(nums[mid] == 0){
                nums[mid] = nums[low];
                nums[low] = 0;
                mid++;
                low++;
            } else if(nums[mid] == 1){
                mid++;
            } else {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {2,0,2,1,1,0};
        SortColors(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
