import java.util.*;

public class learningArray {

    public static int getLargest(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < (arr.length); i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void reverseArray(int arr[]) {
        int temp;
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

    }

    // if it gets the target then returns the position otherwise -1
    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void makePair(int arr[]) {
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(" (" + arr[i] + " " + arr[j] + ") ");
            }
        }
    }

    public static void printSubarray(int arr[]) {
        int totalSubarray = 0;
        int lenght = arr.length;
        for (int start = 0; start < lenght; start++) {
            for (int end = start; end < lenght; end++) {
                for (int current = start; current <= end; current++) {
                    System.out.print(arr[current] + " ");
                }
                System.out.println();
                totalSubarray++;
            }
        }
        System.out.println("Total number of Subarray is: " + totalSubarray);
    }

    // We can check whether an array is sorted or not
    public static boolean isSorted(int arr[]) {
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < (arr.length - 1); i++) {
            if (arr[i] > arr[i + 1])
                isAscending = false;
            if (arr[i] < arr[i + 1])
                isDescending = false;

        }
        return isAscending || isDescending;
    }

    // This function takes an array and prints the maximum sum of the sub array
    public static void printSubarraySumMax(int arr[]) {
        int length = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < length; start++) {
            for (int end = start; end < length; end++) {
                int currentSum = 0;
                for (int current = start; current <= end; current++) {
                    // System.out.print(arr[current]);
                    currentSum += arr[current];
                }
                // System.out.println();
                if (currentSum > maxSum)
                    maxSum = currentSum;
            }
        }
        System.out.println("The maximum sum of subarray is " + maxSum);
    }

    // This function takes an array and prints the maximum sum of the sub array
    // using prefix array
    public static int printSubarraySumMaxUsingPrefix(int arr[]) {
        int length = arr.length;

        int prefix[] = new int[length];

        prefix[0] = arr[0];
        for (int i = 1; i < length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < length; start++) {
            for (int end = start; end < length; end++) {

                int currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("The max sum is " + maxSum);
        return maxSum;

    }

    public static int kanane(int arr[]) {

        int length = arr.length;
        int mSum = Integer.MIN_VALUE;
        int cSum = 0;

        for (int i = 0; i < length; i++) {
            cSum = cSum + arr[i];
            mSum = Math.max(cSum, mSum);

            if (cSum < 0) {
                cSum = 0;
            }
        }
        return mSum;
    }

    public static boolean hasUniqueElements(int arr[]) {

        Set<Integer> numbers = new HashSet<>();
        for (int elm : arr) {

            if (!numbers.add(elm)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { -9, -8, -7, -6, -5, -4, -4 };
        // System.out.println(getLargest(arr));
        // System.out.println(binarySearch(arr, 100));
        // reverseArray(arr);
        // for(int num : arr){
        // System.out.println((num));
        // }
        // makePair(arr);
        // printSubarray(arr);
        // System.out.println(isSorted(arr));
        // printSubarraySumMax(arr);
        // printSubarraySumMaxUsingPrefix(arr);
        // System.out.println(kanane(arr));
        // System.out.print(hasUniqueElements(arr));

    }
}