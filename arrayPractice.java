public class arrayPractice {

    // Short function for print
    public static void print(String name) {
        System.out.println(name);
    }

    // largest in array
    public static int largestNum(int arr[]) {
        
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        print("Hello");
    }
}