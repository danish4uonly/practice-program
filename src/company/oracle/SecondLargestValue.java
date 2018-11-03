package company.oracle;

//find the second largest value from an array.
public class SecondLargestValue {
	
	public static void main(String[] args){
	//user can give the input from keyboard
	//int arr[] = {1,6,4,7,8,2,9};
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
	secondLargestValue(arr);
}

	public static void secondLargestValue(int arr[]){
		int temp;
		System.out.println("Before Sorting :");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		//sorting
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(i==j) continue;
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("\nAfter Sorting :");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nSecond largest vale: "+arr[arr.length-2]);
	}
}
