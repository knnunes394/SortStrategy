public class client {


	public static void main(String[] args){
		SortingContext sortingStrategy = new SortingContext(new selectionSort());
		int[] array1 = {5,2,9,1,5};
		sortingStrategy.performSorting(array1);
		for(int i = 0; i < array1.length; i++){
			System.out.print("Hi" + array1[i]);
		}
		
	}

}
