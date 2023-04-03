package CEN3024C;
import java.util.Arrays;
import java.util.Random;

public class Module8 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] array = random.ints(200000000, 1, 10).toArray();
		
		long systemStart = System.currentTimeMillis();		
		
		System.out.print("Random Single Sum: " + module8Sum.sum(array) + " in: ");
		System.out.println((System.currentTimeMillis() - systemStart) + "ms");
		
		systemStart = System.currentTimeMillis();
		
		
		//System.out.print("Random Parallel Sum: " + module8Sum.parallelSum(array) + "in: ");
		//System.out.println((System.currentTimeMillis() - systemStart) + "ms");

		
		// testing breaks app lol
		//System.out.println(Arrays.toString(array));
	}

}
