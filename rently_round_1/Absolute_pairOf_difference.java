package rently;
import java.util.*;

public class Absolute_pairOf_difference {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int arr_size = scan.nextInt();
		int[] arr = new int[arr_size];
		System.out.print("Enter each elements of array : ");
		for(int s=0; s<arr_size; s++) {
			int val = scan.nextInt();
			arr[s] = val;
		}
		
		Arrays.sort(arr);
		
		
		/*for(int each:arr) {
			System.out.println(each);
		}*/
		
		
		
		int a_d = arr[1]-arr[0];
		for(int i=2; i<arr.length; i++) {
			if ((arr[i]-arr[i-1])<a_d) {
				a_d = arr[i]-arr[i-1];
			}
		}
		System.out.println("Absolute difference : "+a_d);
		
		
		for(int x=1; x<arr.length; x++) {
			ArrayList<Integer> pairs = new ArrayList<>();
			if((arr[x]-arr[x-1]==a_d)) {
				pairs.add(arr[x-1]);
				pairs.add(arr[x]);
			}
			if(pairs.size()!=0) {
			System.out.println(pairs);
			}
		}
	}

}
