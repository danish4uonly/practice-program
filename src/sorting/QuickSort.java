package sorting;

public class QuickSort {

	
	//https://www.youtube.com/watch?v=COk73cpQbFQ&t=831s
	public static void main(String[] args) {
		
		int[] arr = {122, 1, 2, 5, 54, 67, 99, 32};
		
		for(int i =0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		quickSort(arr, 0, arr.length-1);
		for(int i =0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		/*//2nd logic
		int[] arr1 = {122, 1, 2, 5, 54, 67, 99, 32};
		quickSort1(arr1, 0, arr1.length-1);
		for(int i =0; i< arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}*/
	}
	
	public static void quickSort(int a[], int start, int end){
		
		if(start < end){
			int pIndex = partition(a, start, end);
			quickSort(a, start, pIndex - 1);
			quickSort(a, pIndex + 1, end);
		}
	}
	
	public static int partition(int a[], int start, int end){
		int pivot = a[end];
		int pIndex = start;
		
		for(int i = start; i < end; i++){
			if(a[i] <= pivot){
				swap(a, i, pIndex);
				pIndex = pIndex + 1;
			}
		}
		swap(a, pIndex, end);
		return pIndex;
	}
	
	public static void swap(int a[], int i, int pIndex){
		int temp =  a[i];
		a[i] = a[pIndex];
		a[pIndex] = temp;
	}
	
	
	
	//https://www.youtube.com/watch?v=7h1s2SojIRw&list=PLDN4rrl48XKpZkf03iYFl-O29szjTrs_O&index=34
/*public static void quickSort1(int a[], int start, int end){
		
		if(start < end){
			int pIndex = partition1(a, start, end);
			quickSort1(a, start, pIndex - 1);
			quickSort1(a, pIndex + 1, end);
		}
	}
	
	public static int partition1(int A[], int low, int high){
		int pivot = A[low];
		int i = low;
		int j = high;
		//{122, 1, 2, 5, 54, 67, 99, 32};
		while(i<j){
			// increment i until you will find an element greater than pivot.
			do{
				if(i<j)
					i++;
			}while(A[i]<=pivot);
			
			// decrement j until you will find an element smaller than pivot.
			do{
				j--;
			}while(A[j]>pivot);
			
			if(i<j)
				swap(A, i, j);
		}
		swap(A, low, j);
		return j;
	}
	
	public static void swap1(int a[], int i, int j){
		int temp =  a[i];
		a[i] = a[j];
		a[j] = temp;
	}*/
	
}
