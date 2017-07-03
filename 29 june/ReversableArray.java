public class ReversableArray
{
public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Array before reverse:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        System.out.println("\nArray after reverse:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}