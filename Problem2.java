
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int a; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		a = sc.nextInt();
		
		List<String> list = new ArrayList<String>();
		
		while (j < a) {
			
			// if the number is not divisible by 2.
			
			if (i % 2 != 0) {
				j++;
				list.add(String.valueOf(i));
			}
			
			i++;
		}
		
		String s = String.join(",", list);
		System.out.println(s);
	}

}
