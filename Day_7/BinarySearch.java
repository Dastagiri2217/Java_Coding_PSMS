package Day_7;

public class BinarySearch implements IFindMin{

    @Override
    public int findRotatedMin(int[] arr, int n) {
        int low = 0,high = n-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(arr[mid]>arr[high]){
                low = mid + 1;

            }
            else{
                high = mid;
            }
        }
        return arr[low];
    }
    
}
