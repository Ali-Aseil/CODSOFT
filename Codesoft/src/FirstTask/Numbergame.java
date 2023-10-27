package FirstTask;
import java.awt.font.NumericShaper.Range;
import java.time.temporal.ValueRange;
import java.util.Random;
import java.util.Scanner;

public class Numbergame {
	public static void guessnum() {
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		int rn=random.nextInt(100)+1;
		//System.out.println(rn);
		System.out.println("-----Game Start-----\n 3 attempts only!!!");
		int i=3;
		while(i>0) {
		System.out.println("******Guess number*******");
		int un=sc.nextInt();
		int lrn=rn-5;
		int hrn=rn+5;
		
		if(rn==un) {
			System.out.println("**********successfull guess you win********");
			
			break;
		}
		else if(ValueRange.of(lrn, hrn).isValidIntValue(un)) {
			System.out.println("your guess is close");
		}
		else {
			System.out.println("your guess is far");
		}
		i--;
		if(i>0) {
		System.out.println("---"+i+" more try---");}
		else {
			System.out.println("---best luck next time---");
		}
		}
		System.out.println("### the number is ### "+rn);
		System.out.println("end game");
		System.out.println("another round ");
		char opt=sc.next().charAt(0);
		if(opt=='y') {
			guessnum();
			
		}
		else {
			System.out.println("--thanks for participating!!--");
		}
		
	}
	
public static void main(String[] args) {
	
	Random random=new Random();
	Scanner sc=new Scanner(System.in);
	int rn=random.nextInt(100)+1;
	//System.out.println(rn);
	System.out.println("-----Game Start-----\n 3 attempts only!!!");
	int i=3;
	while(i>0) {
	System.out.println("******Guess number*******");
	int un=sc.nextInt();
	int lrn=rn-5;
	int hrn=rn+5;
	
	if(rn==un) {
		System.out.println("**********successfull guess you win********");
		
		break;
	}
	else if(ValueRange.of(lrn, hrn).isValidIntValue(un)) {
		System.out.println("your guess is close");
	}
	else {
		System.out.println("your guess is far");
	}
	i--;
	if(i>0) {
	System.out.println("---"+i+" more try---");}
	else {
		System.out.println("---best luck next time---");
	}
	}
	System.out.println("### the number is ### "+rn);
	
	System.out.println("end game");
	System.out.println("another round ");
	char opt=sc.next().charAt(0);
	if(opt=='y') {
		guessnum();
		
	}
	else {
		System.out.println("--thanks for participating!!--");
	}
}


}
