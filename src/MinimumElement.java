import java.util.Scanner;

class MinimumElement {

    public static void main(String[] args) {

        int numbers = readInteger();

        int[] elements = readElements(numbers);

        System.out.println("This is the Min value from Array you entered from Keyboard "+ findMin(elements));

    }

    private static int readInteger() {

        System.out.println("Please Enter How Many Elements is needed");

        Scanner scanner = new Scanner(System.in);

        String sNum = scanner.nextLine();

        return Integer.parseInt(sNum);
    }


    private static int[] readElements(int numberSize) {

        System.out.println("Please enter only " + numberSize + " numbers");

        int[] intArray = new int[numberSize];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        return intArray;

    }

    public static int findMin(int[] numberArray) {

        int min = Integer.MAX_VALUE;

        for (int el : numberArray) {
            if (el < min) {
                min = el;
            }

        }
        return min;
    }

}
