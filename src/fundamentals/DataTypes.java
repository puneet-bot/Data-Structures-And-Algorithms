package fundamentals;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Valid variable names: 
//		int x,x1,x_w,x$t;
//		IValid variable names: 
//		int 1x ,x@w,23;	
		

		Scanner s1=new Scanner(System.in);
		String x=s1.next();
		System.out.println(x);
		x=s1.next();
		System.out.println(x);
		String y="a";
		char my_char=y.charAt(0);
		System.out.println(my_char);
		int i=23;
		short s=23;
		long l=23;
		byte b=76;
		double d=19.376;
		float f=12.3f;
		char c='a';
		boolean bh=true;
		//all data Types ....
		System.out.println("int "+i);
		System.out.println("long "+l);
		System.out.println("byte "+b);
		System.out.println("short "+s);
		System.out.println("double "+d);
		System.out.println("float "+f);
		System.out.println("character "+c);
		System.out.println("boolean "+bh);
	}

}
