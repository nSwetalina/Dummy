import java.util.Scanner;


public class Strong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		boolean rs=isStrong(no);
		if(rs==true)
			System.out.println("The number is a strong number");
		else
			System.out.println("The number is not a strong number");
	}
	static boolean isStrong(int n)
	{
		int sum=0;
		int t=n;
		while(n!=0){
			int r=n%10;
			sum=sum+getFact(r);
			n=n/10;
		}
		if(sum==t)
			return true;
		else 
			return false;
	}
	static int getFact(int x)
	{
		int f=1;
		while(x>0);
		{
			f=f*x;
			x--;
		}
		return f;
	}

}
