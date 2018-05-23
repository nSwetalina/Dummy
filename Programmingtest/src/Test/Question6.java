package Test;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String st=sc.nextLine();   
			int n=converttoInt(st);
			System.out.println("the converted string to integer is:"+st);
			}
		

		private static int converttoInt(String s) {
			char ch[]=s.toCharArray();
			int n=0;
			for(int i=0;i<s.length();i++){
				n=n*10 + s.charAt(i)-48;
			}
			return n;
		}

	

}
