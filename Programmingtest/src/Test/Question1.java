package Test;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=2*(n-1);j++)
			{
				if(j%2!=0)
				{
					System.out.print("*");
				}
				else{
					
				}
			}
		}

	}

}
