import java.util.Random;

public class HeapSort {
	static int N = 100;
    int[] values = new int[N];
    static int heapSize = N-1;

	public static void main(String[] args) {
		int r = N-1;
		int p = 0;
		HeapSort HeapSort = new HeapSort();
		HeapSort.random(N);
		HeapSort.sort(p, r);
		HeapSort.print();
	}
	
	public void sort(int p ,int r){
		buildMaxHeap(r);
		for(int i = r; i > 0; i--){
			swap(0, i);
			heapSize--;
			buildMaxHeap(heapSize);
		}
	}
	
	public void maxHeapify(int r, int i){
		int left = 2*(i+1)-1;
		int right = 2*(i+1);
		int largest;
		if(left <= heapSize && values[left] > values[i]){
			largest = left;
		}
		else
			largest = i;
		if(right <= heapSize && values[right] > values[largest]){
			largest = right;
		}
		if(largest != i){
			swap(i, largest);
			maxHeapify(r, largest);
		}
	}
	
	public void buildMaxHeap(int r){ 
		for(int i = r/2; i >= 0; i--)
			maxHeapify(r, i);
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
}