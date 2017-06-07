import java.util.Scanner;
public class casting {
public static void main(String[] args) {
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;

	Scanner Input=new Scanner(System.in);
	System.out.println("Enter a value");
	a=Input.nextByte();
	System.out.println("Enter a value");
	b=Input.nextShort();
	
	c=a+b;
	System.out.println("the sum is(int)=" +c);
	d=c+b;
	System.out.println("the sum is(long)=" +d);
	e=d+c;
	System.out.println("the sum is(float)=" +e);
	f=e+d;
	System.out.println("the sum is(double)="+f);
}
}
