
import java.util.Scanner;

class calculator
{
	double a;
	double b;
	double res;
	
void acceptInput()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	a=sc.nextDouble();
	System.out.println("enter b value");
	b=sc.nextDouble();
}

void addition()
{
	res=a+b;
}
void subtraction()
{
	res=a-b;
}
void multiply()
{
	res=a*b;
}
void division()
{
	res=a/b;
}

void display() {
	System.out.println((res));
}
}
public  class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calculator c=new calculator();
c.acceptInput();
c.addition();
c.display();

c.acceptInput();
c.subtraction();
c.display();

c.acceptInput();
c.multiply();
c.display();

c.acceptInput();
c.division();
c.display();
	}

}
