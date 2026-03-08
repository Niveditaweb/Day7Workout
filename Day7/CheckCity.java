import java.util.HashSet;
public class CheckCity {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        if(cities.contains("Delhi")){
            System.out.println("Delhi exists in the set");
        } else {
            System.out.println("Delhi not found");
        }
    }
}