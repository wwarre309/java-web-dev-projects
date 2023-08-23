import java.util.ArrayList;

public class ArrayListSumOfEven {
    public static void main(String[] args) {
        // Create a list of integers
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(10);
        integerList.add(22);
        integerList.add(12);
        integerList.add(3);
        integerList.add(13);
        integerList.add(6);
        integerList.add(9);
        integerList.add(4);

        // Call the method to find the sum of even numbers
        int evenSum = sumOfEvenNumbers(integerList);
        System.out.println("Sum of even numbers: " + evenSum);
    }

    public static int sumOfEvenNumbers(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}