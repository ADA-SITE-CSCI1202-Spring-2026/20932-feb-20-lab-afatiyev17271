import java.util.Scanner;

public class task2 {

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] result = {min, max};
        return result;
    }

    public static void main(String[] args) {

        int[] cmdArray = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            cmdArray[i] = Integer.parseInt(args[i]);
        }

        if (cmdArray.length > 0) {
            System.out.println("From command line:");
            System.out.println("Minimum: " + findMin(cmdArray));
            System.out.println("Maximum: " + findMax(cmdArray));

            int[] both = findMinMax(cmdArray);
            System.out.println("Both together -> Min: " + both[0] + " Max: " + both[1]);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("From scanner:");
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Maximum: " + findMax(arr));

        int[] both2 = findMinMax(arr);
        System.out.println("Both together -> Min: " + both2[0] + " Max: " + both2[1]);
    }
}