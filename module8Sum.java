package CEN3024C;

public class module8Sum extends Thread {
	
	private int[] arr;
	private int low, high;
	
	public module8Sum (int[] arr, int low, int high) {
		this.arr = arr;
		this.low = low;
		this.high = Math.min(high, arr.length);
		
	}
	
	public static int sum(int[] arr) {
		return sum(arr, 0, arr.length);
	}
	
	public static int sum(int[] arr, int low, int high) {
		int total = 0;
		
		for (int i = low; i < high; i++) {
			total += arr[i];
		}
		
		return total;
	}
	
	public void run() {
		sum(arr, low, high);
	}

}
