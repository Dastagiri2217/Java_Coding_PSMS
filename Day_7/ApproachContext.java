package Day_7;

public class ApproachContext {
    private IFindMin strategy;
    public void setStrategy(IFindMin strategy){
        this.strategy = strategy;
    }
    public int implementApproach(int arr[],int n){
        return strategy.findRotatedMin(arr, n);
    }

}
