package s02.arrays;

public class Arrays_MinimumSwaps2 {

	public static void main(String[] args) {
		int[] arr = {4, 3, 1, 2};
		System.out.println(minimumSwaps(arr));
		
		int[] arr1 = {2, 3, 4, 1, 5};
		System.out.println(minimumSwaps(arr1));
		
		int[] arr2 = {1, 3, 5, 2, 4, 6, 7};
		System.out.println(minimumSwaps(arr2));
		
		int[] arr3 = {3, 7, 6, 9, 1, 8, 10, 4, 2, 5};
		System.out.println(minimumSwaps(arr3));
	}
	
	// Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	int swaps = 0;
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = i+1; j < arr.length - 1 ; j++) {
    			if(arr[i] > arr[j]) {
    				int temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    				swaps++;
    			}
			}
		}
    	return swaps;
    }

}
