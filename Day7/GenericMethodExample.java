public class GenericMethodExample {
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40};
        String[] words = {"Java", "Python", "C++", "Go"};
        printArray(numbers);
        printArray(words);
    }
}