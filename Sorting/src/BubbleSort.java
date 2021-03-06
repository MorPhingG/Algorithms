import java.util.Random;

public class BubbleSort {
	static int N = 100;
    int[] values = new int[N];

	public static void main(String[] args) {
		int r = N-1;
		int p = 0;
		BubbleSort BubbleSort = new BubbleSort();
		BubbleSort.random(N);
		BubbleSort.sort(p, r);
		BubbleSort.print();
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
		for(int i = 0; i <= r; i++){
			for(int j = i+1; j <= r; j++){
				if(values[i] >= values[j])
					swap(i,j);
			}
		}
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