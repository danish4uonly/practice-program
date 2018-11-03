package sorting;

//https://www.youtube.com/watch?v=TzeBrDU-JaY&t=805s
//https://www.youtube.com/watch?v=8zV9RQWydCY
public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {122, 1, 2, 5, 54, 67, 99, 32};
		
		for(int i =0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		mergeSort(arr);
		for(int i =0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void mergeSort(int a[]){
		int n = a.length;
		if(n < 2) return;
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];
		
		for(int i = 0; i < mid - 1; i++){
			left[i] = a[i];
		}
		
		for(int i = mid; i < n - 1; i++){
			right[i - mid] = a[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		
		merge(left, right, a);
	}
	
	public static void merge(int[] left, int[] right, int a[]){
		int nL = left.length;
		int nR = right.length;
		int i = 0; int j = 0; int k = 0;
		
		while(i < nL && j < nR){
			
			if(left[i] <= right[i]){
				a[k] = left[i];
				i = i + 1;
				k = k + 1;
			}
			else{
				a[k] = right[j];
				j = j + 1;
				k = k + 1;
			}
		}
		
		while(i < nL){
			a[k] = left[i];
			i = i + 1;
			k = k + 1;
		}
		
		while(j < nR){
			a[k] = right[j];
			j = j + 1;
			k = k + 1;
		}
	}
}
