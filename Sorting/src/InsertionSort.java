
public class InsertionSort {
	int[] values;

	public static void main(String[] args) {
		int[] a = {4,6,7,5,2,9,0,3,1,8};
		InsertionSort insert = new InsertionSort();
		insert.values = a;
		insert.sort();
		insert.print();
	}
	
	public void sort(){
		for(int i = 1; i < values.length; i++){
			int key = values[i];
			int j = i-1;
			while(j >= 0 && values[j] > key){
				values[j+1] = values[j];
				j--;
			}
			values[j+1] = key; 
		}
	}
	
	public void print(){
		for(int i = 0; i < values.length; i++){
			System.out.print(values[i]+" ");
		}
		System.out.println();
	}

}
