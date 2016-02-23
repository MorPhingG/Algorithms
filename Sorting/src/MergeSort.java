
public class MergeSort {
	int[] values;

	public static void main(String[] args) {
		int[] a = {4,6,8,2,5,3,1,9,7};
		int r = a.length-1;
		int p = 0;
		MergeSort mergeSort = new MergeSort();
		mergeSort.values = a;
		mergeSort.sort(p, r);
		mergeSort.print();
	}
	
	public void sort(int p ,int r){
		if(p<r){
			int q = (p+r)/2;
			sort(p,q);
			sort(q+1,r);
			merge(p, q, r);
		}
	}
	
	public void merge(int p, int q, int r){
		int n1 = q-p+1;
		int n2 = r-q;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for(int i = 0; i < n1; i++){
			L[i] = values[p+i];
		}
		for(int i = 0; i < n2; i++){
			R[i] = values[q+i+1];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for(int k = p; k <= r; k++){
			if(L[i] <= R[j]){
				values[k] = L[i];
				i++;
			}
			else{
				values[k] = R[j];
				j++;
			}
		}
	}
	
	public void print(){
		for(int i = 0; i < values.length; i++){
			System.out.print(values[i]+" ");
		}
		System.out.println();
	}
}
