import java.util.ArrayList;

public class StudentNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Rahul");
        names.add("Kiran");
        names.add("Priya");
        names.add("Ravi");
        for(String name : names){
            System.out.println(name);
        }
    }
}