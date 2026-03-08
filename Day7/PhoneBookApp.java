import java.util.HashMap;

public class PhoneBookApp {
    public static void main(String[] args) {
        HashMap<String,String> contacts = new HashMap<>();
        contacts.put("Rahul","9876543210");
        contacts.put("Aman","9123456780");
        contacts.put("Kiran","9988776655");
        contacts.put("Priya","9012345678");
        contacts.put("Ravi","9090909090");
        String name = "Rahul";
        if(contacts.containsKey(name)){
            System.out.println("Phone Number: " + contacts.get(name));
        } else {
            System.out.println("Contact not found");
        }
    }
}