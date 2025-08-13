package Day_7;

public class BruteForce implements IFindMin{
    @Override
    public int findRotatedMin(int arr[],int n) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,arr[i]);
        }
        return min;
    }
}
