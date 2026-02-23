import java.util.Arrays;

public class MoveZeroes {

    public static int[] moveZeroes(int nums[]){
        int pos = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[pos] = nums[i];
                pos++;
            }
        }
        while(pos < nums.length){
            nums[pos] = 0;
            pos++;
        }
        return nums;
    }
    public static void main(String args[]){
        int nums[] = {0,1,0,3,12,2};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
