public class BruteForceSol {
    public  int [] productExceptSelfBrute(int arr[],int n){
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            int product = 1;
            for(int j=0;j<n;j++){
                if(j!=i){
                    product *= arr[j];
                }
            }
            result[i] = product;
        }
        return result;
    }
}
