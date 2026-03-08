import java.util.ArrayList;
public class MaximumNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(40);
        numbers.add(15);
        int max = numbers.get(0);
        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Maximum Number: " + max);
    }
}