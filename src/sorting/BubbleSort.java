package sorting;


/**
 * 
 * @author Acer
 *
 */

public class BubbleSort {
	
	static int[] arr = {1, 2, 5, 54, 67, 99, 32};
	
public static void main(String[] args) {
		
		
		for(int i =0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		/**bubbleSort(arr);*/
		bubbleSort1(arr);
		for(int i =0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		
		binarySearchForValue(2);
		
	}

	/**This function always runs O(n^2) time even if the array is sorted. 
	 * It can be optimized by stopping the algorithm if inner loop didn’t cause any swap for sorted element.
	 * @param arr
	 */
	public static void bubbleSort(int arr[]){
		int n= arr.length;
		for(int i = 0; i<n-1; i++){
			//n-i-1 means it wont be compare with sorted elements
			for(int j = 0; j<n-i-1; j++){
				if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
			}
		}
	}
	
	// O(n)
	public static void bubbleSort1(int arr[]){
		int n= arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) 
        {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // IF no two elements were swapped by inner loop, then break. It means its already sorted!
            if (swapped == false)
                break;
        }
	}
	
	public static void binarySearchForValue(int value){
		
		int lowIndex = 0;
		int highIndex = arr.length-1;
		
		while(lowIndex < highIndex){
			
			int middleIndex = (highIndex - lowIndex) / 2;
			
			if(arr[middleIndex] < value) 
				lowIndex = middleIndex + 1;
			else if(arr[middleIndex] > value)
				highIndex = middleIndex - 1;
			else{
				System.out.println("\nFound a Match for "+ value +" at Index "+ middleIndex );
				lowIndex = highIndex + 1;
			}
		}
		
	}
}
