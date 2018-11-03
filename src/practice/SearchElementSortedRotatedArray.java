package practice;

//Search an element in a sorted and rotated array
/**
 * An element in a sorted array can be found in O(log n) time via binary search. 
But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand. 
So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.
*/
//here assume that all elements in array are distinct.


/*1) Find middle point mid = (l + h)/2
2) If key is present at middle point, return mid.
3) Else If arr[l..mid] is sorted
    a) If key to be searched lies in range from arr[l]
       to arr[mid], recur for arr[l..mid].
    b) Else recur for arr[mid+1..r]
4) Else (arr[mid+1..r] must be sorted)
    a) If key to be searched lies in range from arr[mid+1]
       to arr[r], recur for arr[mid+1..r].
    b) Else recur for arr[l..mid] */

public class SearchElementSortedRotatedArray { //Time Complexity O(logn).

	public static void main(String[] args) {
		
		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
        int n = arr.length; 
        int key = 3; 
        int i = search(arr, 0, n-1, key); 
        if (i != -1)  
            System.out.println("Index: " + i); 
        else
            System.out.println("Key not found"); 

	}
	
	public static int search(int arr[], int s, int e, int key){
		
		int mid = (s + e)/2;
		
		if (s > e)
			return -1;
		
		if(key == arr[mid])
			return mid;
		
		/* If arr[s...mid] is sorted */
		if(arr[s] <= arr[mid]){
			
			/* As this subarray is sorted, we  
            can quickly check if key lies in  
            half or other half */
			if(key >= arr[s] && key <= arr[mid])
				return search(arr, s, mid-1, key);
			
			return search(arr, mid+1, e, key);
		}
		/* If arr[l..mid] is not sorted,  
        then arr[mid... r] must be sorted*/
		if (key >= arr[mid] && key <= arr[e])
			return search(arr, mid+1, e, key); 
     
		return search(arr, s, mid-1, key); 
	}
}
