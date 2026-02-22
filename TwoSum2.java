// 167. Two Sum || - Input Array Is Sorted

import java.util.*;
public class TwoSum2{
    public static int[] twoSum(int numbers[], int target){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int numbers[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}