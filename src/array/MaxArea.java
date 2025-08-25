package array;

public class MaxArea {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;


        int currentMax = 0;
        while(left < right){
            int currentMaxWidth = right-left;
            int currentMaxHeight = Math.min(height[left],height[right]);
            currentMax = currentMaxWidth*currentMaxHeight;
            if(currentMax>max){
                max = currentMax;
            }
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }
        return max;
    }
}
