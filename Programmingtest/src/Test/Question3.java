package Test;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	
	
	String x=new String("cutcopypaste");
	String y=new String();
	//String y="";
	for(int i=0;i<x.length();i++)
	{
		for(int j=0;j<y.length();j++)
		{
			if(x.charAt(i)!=y.charAt(j))
				y=y+x.charAt(i);
		}
	}
	System.out.println(y);
	}
		
}
