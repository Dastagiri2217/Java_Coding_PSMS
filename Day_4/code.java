import java.util.*;
class MaxWaterStorage {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0, right = heights.length - 1;

        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            maxWater = Math.max(maxWater, height * width);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int maxWater = maxArea(heights);
    System.out.println("Max Water it Contains is :"+maxWater);
  }
}
