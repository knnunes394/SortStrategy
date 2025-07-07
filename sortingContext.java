public class SortingContext {
	
	private SortingContext sortingContext;
	
	public sortingContext(SortingContext sortingContext){
		this.sortingContext = sortingContext;
	}
	
	public void setSortingContext(SortingContext sortingContext){
		this.sortingContext = sortingContext;
	}
	
	public void performSorting(int[] array){
		sortingContext.sort(array);
	}

}
