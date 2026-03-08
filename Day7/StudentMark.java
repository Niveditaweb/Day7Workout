import java.util.TreeMap;

public class StudentMark {
    public static void main(String[] args) {
        TreeMap<String,Integer> marks = new TreeMap<>();
        marks.put("Rahul",78);
        marks.put("Aman",85);
        marks.put("Kiran",90);
        for(String name : marks.keySet()){
            System.out.println(name+" "+marks.get(name));
        }
    }
}