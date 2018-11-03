package sorting;

/** worst < best
 * selection sort <= bubble sort < insertion sort <   merge sort < quick sort
 * O(n2)  avg          o(n2) or O(n)     O(n) or O(n2)   O(nlogn) worst case
 * avg O(n2) s,b,i,   worst case -> merge m = O(nlogn) BUT IT WILL TAKE O(n) extra space(not in-place)  
 * --> quick sort avg case O(nlogn) - in-place algo
 */

/**
Selection Sort

The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. 
*/

/**arr[] = 64 25 12 22 11

//Find the minimum element in arr[0...4]
//and place it at beginning
11 25 12 22 64

//Find the minimum element in arr[1...4]
//and place it at beginning of arr[1...4]
11 12 25 22 64

//Find the minimum element in arr[2...4]
//and place it at beginning of arr[2...4]
11 12 22 25 64

//Find the minimum element in arr[3...4]
//and place it at beginning of arr[3...4]
11 12 22 25 64 

Time Complexity: O(n2) as there are two nested loops.

Auxiliary Space: O(1)
The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation. 
*/
public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 5, 54, 67, 99, 32};
		for(int i =0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		selectionSort(arr);
		for(int i =0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	static void selectionSort(int[] arr){
		int n= arr.length;
		for(int i=0; i<n-1; i++){
			int iMin = i;
			for(int j= i+1; j<n; j++){
				if(arr[j] < arr[iMin])
					iMin=j;
			}
			//swap not required if i = iMin 
			if(i!=iMin){
				int temp = arr[i];
				arr[i] = arr[iMin];
				arr[iMin] = temp;
			}
		}
	}
}
