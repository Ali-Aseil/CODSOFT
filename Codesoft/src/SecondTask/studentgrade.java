package SecondTask;

import java.time.temporal.ValueRange;
import java.util.Scanner;

public class studentgrade {
	public static void stgrade() {
		int sum=0;
		long avg=0;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<6;i++) {
			System.out.println("subject "+i);
			int sub=sc.nextInt();
			sum=sum+sub;
		}
		avg=sum/5;
		if(ValueRange.of(70, 100).isValidValue(avg)) {
			System.out.println("your total marks is "+sum);
			System.out.println("-----------");
			System.out.println("your average is "+avg);
			System.out.println("-----------");
			System.out.println("your grade is A");
			System.out.println("-----------");
		}
		else if(ValueRange.of(40, 70).isValidValue(avg)) {
			System.out.println("your total marks is"+sum);
			System.out.println("-----------");
			System.out.println("your average is "+avg);
			System.out.println("-----------");
			System.out.println("your grade is B");
			System.out.println("-----------");
		}
		else if(ValueRange.of(1, 40).isValidValue(avg)) {
			System.out.println("your total marks is"+sum);
			System.out.println("-----------");
			System.out.println("your average is "+avg);
			System.out.println("-----------");
			System.out.println("your grade is C");
			System.out.println("-----------");
		}
	}
public static void main(String[] args) {
	stgrade();
}
}
