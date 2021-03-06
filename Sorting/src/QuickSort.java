import java.util.Random;

public class QuickSort {
	static int N = 100;
    int[] values = new int[N];

	public static void main(String[] args) {
		int r = N-1;
		int p = 0;
		QuickSort quickSort = new QuickSort();
		quickSort.random(N);
		quickSort.sort(p, r);
		quickSort.print();
	}
	
	public void random(int n){
		Random random = new Random();
        for(int i = 0; i < n; i++){
            int number = random.nextInt(n) + 1;
            for(int j = 0; j <= i; j++){
            	if(number != values[j]){
            		values[i] = number;
            	}
            }
        }
        for(int i = 0;i < values.length;i++){
            System.out.print(values[i] + " ");
            if(( i + 1 ) % 10 == 0){
                System.out.println("\n");
            }
        }
	}
	
	public void sort(int p ,int r){
		if(p < r){
			int q = partition(p, r);
			sort(p, q-1);
			sort(q+1, r);
		}
	}
	
	public int partition(int p, int r){
		int x = values[r];
		int i = p-1;
		for(int j = p; j < r; j++){
			if(values[j] <= x){
				i++;
				swap(i, j);
			}
		}
		swap(i+1, r);
		return(i+1);
	}
	
	public void swap(int i, int j){
		int temp = values[i];
		values[i] = values[j];
		values[j] = temp;
	}
	
	public void print(){
		for(int i = 0; i < values.length; i++){
			System.out.print(values[i]+" ");
		}
		System.out.println();
	}
}
