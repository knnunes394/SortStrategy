public class SelectionSort {

	static void selectSort(int[] array){
		int n = array.length;
		
		for(int i = 0; i < (n - 1);i++){
		    int min_index = i;
			for(int j = i + 1; j < n; j++){
				if(array[j] < array[min_index]){
				    min_index = j;
				}
			}
			int temp = array[i];
			array[i] = array[min_index];
			array[min_index] = temp;
		}
		
	}
	
	static void printArray(int arr[]){
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static void main(String args[]){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        selectSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
	
}
