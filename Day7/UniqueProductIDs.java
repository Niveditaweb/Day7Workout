import java.util.HashSet;

public class UniqueProductIDs {
    public static void main(String[] args) {
        HashSet<Integer> ids = new HashSet<>();
        ids.add(101);
        ids.add(102);
        ids.add(103);
        ids.add(101);
        ids.add(104);
        for(int id : ids){
            System.out.print(id + " ");
        }
    }
}