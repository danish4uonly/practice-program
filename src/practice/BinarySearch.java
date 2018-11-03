package practice;

//sorted array, divide and conquer principle follow.
public class BinarySearch {

	//Linear search time complexity is O(n)
	//Binary search time complexity is O(log n) much better than LinearSearch
	public static void main(String[] args) {
		int arr[] = {1, 3, 13, 14, 15, 71, 79};
		int key = 99;
		int s = 0;
		int e = arr.length - 1;
		
		
		System.out.println(binarySearchRecurssion(arr, s, e, key));
		
		System.out.println();
		
		int arr1[] = {1, 3, 13, 14, 15, 71, 79};
		int key1 = 79;
		int s1 = 0;
		int e1 = arr1.length - 1;
		System.out.println(binarySearchIterative(arr1, s1, e1, key1));
		
	}

	public static int binarySearchRecurssion(int arr[], int s, int e, int key){
		
		// means the number is not present.
		if(s > e)
			return -1;
		
		int mid = (s + e) / 2;
		
		if(arr[mid] == key)
			return mid;
		
		// iterating the left hand side array.
		if(arr[mid] > key)
			return binarySearchRecurssion(arr, s, mid-1, key);
		
		// iterating the right hand side array.
		return binarySearchRecurssion(arr, mid+1, e, key);
	}
	
	
	public static int binarySearchIterative(int arr[], int s, int e, int key){
		
		while (s<=e){
			
			int mid = (s + e) / 2;
			
			if(arr[mid] == key)
				return mid;
			
			else if (arr[mid] > key)
				e = mid - 1;
			
			else
				s = mid + 1;			
		}
		
		// means the number is not present.
		return -1;
	}
	
}
