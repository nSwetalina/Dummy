package Test;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of rows and columns");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		System.out.println("enter "+n*n+"elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++)
				System.out.println(a[i][k]);
			for(int k=i;k<j;k++)
				System.out.println(a[j][k]);
			for(int k=j;k>i;k--)
				System.out.println(a[k][j]);
			for(int k=j;k>i;k--)
				System.out.println(a[k][i]);
		}
		if(n%2==1)
			System.out.println(a[n/2][n/2]+" ");
		
			
	}

}


