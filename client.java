public class client {


	public static void main(String[] args){
		SortingContext sort1 = new SortingContext(new BubbleSort());
		int[] array1 = {5,2,9,1,5};
		sort1.performSorting(array1);
		for(int i = 0; i < array1.length; i++){
			System.out.println(array1[i]);
		}
		
	}

}
