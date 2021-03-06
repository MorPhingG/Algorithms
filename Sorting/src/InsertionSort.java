import java.util.Random;

public class InsertionSort {
	static int N = 100;
	int[] values = new int[N];

	public static void main(String[] args) {
		InsertionSort insert = new InsertionSort();
		insert.random(N);
		insert.sort();
		insert.print();
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
