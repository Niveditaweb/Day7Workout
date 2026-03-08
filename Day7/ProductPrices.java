import java.util.LinkedHashMap;

public class ProductPrices {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> products = new LinkedHashMap<>();
        products.put("Laptop",50000);
        products.put("Mobile",20000);
        products.put("Tablet",15000);
        products.put("Headphones",3000);
        products.put("Keyboard",1500);
        for(String name : products.keySet()){
            System.out.println(name+" "+products.get(name));
        }
    }
}