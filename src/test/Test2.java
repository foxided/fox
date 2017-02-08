package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int i,n=input.nextInt(),result=1;
		for (i=1;i<=n;i++)
		{
			result*=i;
		}
		System.out.println(result);
	}

}
