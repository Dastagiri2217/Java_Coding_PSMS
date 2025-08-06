import java.util.HashSet;

public class HashSetDuplicateCheker implements DuplicateCheck{

    @Override
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.add(arr[i])){
                return true;
            }
        }
        return false;
    }
    
}
