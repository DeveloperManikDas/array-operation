public class learningArray {

    public static int getLargest(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < (arr.length - 1); i++) {
            if (arr[i + 1] > largest) {
                largest = arr[i + 1];
            }
        }
        return largest;
    }
    

    // if it gets the target then returns the position otherwise -1
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == target){
                return mid; 
            }else if(target < arr[mid]){
                end = mid - 1;
    
            }else{
                start = mid + 1; 
            }

        }
        return -1; 
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        // System.out.println(getLargest(arr));
        System.out.println(binarySearch(arr, 100));
        
    }
}