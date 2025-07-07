public class Client {


	public static void main(String[] args){
		SortingContext sortingContext = new SortingContext(new selectionSort());
		int[] array1 = {5,2,9,1,5};
		sortingContext.sort(array1);
		
		
	}

}
