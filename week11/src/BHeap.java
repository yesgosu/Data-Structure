
public class BHeap<Key extends Comparable<Key>,Value> {
	private Entry[] a;
	private int N;
	public BHeap(Entry[] harray,int initialSize) {
		a = harray;
		N = initialSize;
	}
	public int size() {
		return N;
	}
	public void createHeap() {
		for(int i=N/2; i>0; i--) {
			downheap(i);
		}
	}
	public void insert(Key NewKey,Value newValue) {
		Entry<Key,Value> temp = new Entry<Key,Value>(NewKey,newValue);
		a[++N] = temp;
		upheap(N);
	}
	public Entry delteMin() {
		Entry min = a[1];
		swap(1, N--);
		a[N+1] =null;
		downheap(1);
		return min;
	}
	public void downheap(int i) {
		while( 2*i <=N) {
			int k= 2*i;
			if(k<N && greater(k,k+1)) k++;
			if(!greater(i,k)) break;
			swap(i,k);
			i = k;
		}
	}
	private void upheap(int j) {
		while(j > 1 && greater(j/2,j)) {
			swap(j/2,j);
			j = j/2;
		}
	}
	private boolean greater(int i,int j) {
		return a[j].getKey().compareTo(a[i].getKey()) < 0;
	}
	private void swap(int i,int j) {
		Entry<Key, Value> temp = a[i]; a[i]=a[j];
		a[j] = temp;
	}
	public void print() {
		for(int i=1; i<N+1; i++) {
			System.out.printf("["+a[i].getKey()+" "+a[i].getValue()+ " ]");
		}
		System.out.println(); System.out.printf("�� ũ�� ="+size()+"\n\n");
	}
	
}
