public class DuplicateCheckerFactory {
    public static DuplicateCheck getTypeOFDuplicateChecker(String type){
        if(type.equalsIgnoreCase("brute")){
            return new BruteForceDuplicateChecker();
        }
        else if(type.equalsIgnoreCase("hashset")){
            return new HashSetDuplicateCheker();
        }
        else{
             System.out.println("Enter the Valid type : ");
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
