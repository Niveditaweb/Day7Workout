import java.util.HashMap;
public class StudentMarks {
public static void main(String[] args) {
HashMap<String,Integer> marks=new HashMap<>();
marks.put("Asha",85);
marks.put("Rahul",90);
marks.put("Priya",78);
marks.put("Kiran",88);
marks.put("Ravi",92);
for(String name:marks.keySet()){
System.out.println(name+" "+marks.get(name));
}
}
}