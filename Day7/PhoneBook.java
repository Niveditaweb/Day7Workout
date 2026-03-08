import java.util.HashMap;
public class PhoneBook {
public static void main(String[] args) {
    HashMap<String,String> phoneBook=new HashMap<>();
    phoneBook.put("Rahul","9876543210");
    phoneBook.put("Asha","9123456780");
    phoneBook.put("Kiran","9988776655");
    phoneBook.put("Priya","9012345678");
    phoneBook.put("Ravi","9090909090");
    String name="Rahul";
    if(phoneBook.containsKey(name)){
        System.out.println(name+" "+phoneBook.get(name));
    }else{
    System.out.println("Contact not found");
}
}
}