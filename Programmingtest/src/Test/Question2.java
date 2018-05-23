package Test;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String x=sc.nextLine();
		String y="";
		for(int i=0;i<x.length();i++)
		{
			//int k=i;
			char ch[]=y.toCharArray();
			if(ch[i]==0 && ch[i]!='.')
			{
				y=y+ch[i];
			}
			else if(ch[i]=='.'&& ch[i]==',')
			{
				int k=i-1;
				for(i=0;i<k;i++)
				{
					y=y+ch[i];
				}
			}
		}
		System.out.println(y);

	}

}
