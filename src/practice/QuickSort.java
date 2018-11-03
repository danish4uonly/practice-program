package practice;

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
	}
	
	public static void quickSort(int[] arr, int s, int e){
		
		if(s<e){
			int pIndex = partition(arr, s, e);
			quickSort(arr, s, pIndex-1);
			quickSort(arr, pIndex+1, e);
		}
	}
	
	public static int partition(int[] arr, int s, int e){
		
		int pIndex = s;
		int pivot = arr[e];
		
		for(int i = s; i<e; i++){
			
			if(arr[i] <= pivot){
				swap(arr, i, pIndex);
				pIndex = pIndex + 1;
			}
		}
		swap(arr, pIndex, e);
		return pIndex;
	}
	
	public static void swap(int a[], int i, int pIndex){
		int temp =  a[i];
		a[i] = a[pIndex];
		a[pIndex] = temp;
	}
}
