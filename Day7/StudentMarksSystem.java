import java.util.HashMap;

public class StudentMarksSystem {
    public static void main(String[] args) {
        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("Aman",85);
        marks.put("Rahul",78);
        marks.put("Kiran",90);
        marks.put("Priya",88);
        marks.put("Ravi",80);
        for(String name : marks.keySet()){
            System.out.println(name+" "+marks.get(name));
        }
    }
}