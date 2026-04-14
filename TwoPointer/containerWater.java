package TwoPointer;
public class containerWater {

    public static int ContainerWater(int height[]){
        int l = 0, r = height.length-1;
        int maxArea = 0;
        while(l < r){
            int h = Math.min(height[l], height[r]);
            int w = r - l;
            int area = h * w;
            maxArea = Math.max(maxArea, area);
            if(height[l] <= height[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
    public static void main(String args[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(ContainerWater(height));
    }
}
