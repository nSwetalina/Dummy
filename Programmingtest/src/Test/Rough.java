package Test;

import java.util.Scanner;

public class Rough {
	
	int []readArr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	void dispArr(int ele[])
	{
		for(int i=0;i<ele.length;i++)
		{
			System.out.println(ele[i]+" ");
		}
		System.out.println();
	}
	public int[] removeDuplicate(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
				a[j]=a[n-1];
				n--;
				j--;
				}
			}
		}
		int na[]=new int[n];
		for(int i=0;i<n;i++)
		{
			na[i]=a[i];
		}
		return na;
	}
	public static void main(String[] args) {
		Question3 q3=new Question3();
		System.out.println("enter the array");
		int a[]=q3.readArr();
		q3.dispArr(a);
		int ele=q3.removeDuplicate(a);
		System.out.println("the combined array is: " +ele);
		
		
	}

}
