import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int result[] = getSorted(arr);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		sc.close();
	}

	private static int[] getSorted(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int n=0;
			while(arr[i] > 0) {
				n = n*10 + arr[i]%10;
				arr[i] /= 10;
			}
			arr[i] = n;
		}
		Arrays.sort(arr);
		return arr;
	}

}
