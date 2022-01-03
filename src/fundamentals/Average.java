package fundamentals;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String x=s.next();
		char a=x.charAt(0);
		int m1=s.nextInt(),m2=s.nextInt(),m3=s.nextInt();
		System.out.println(a);
		System.out.println((m1+m2+m3)/3);
	}

}
