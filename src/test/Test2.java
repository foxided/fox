package test;//阶乘算法

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int i,n=input.nextInt(),result=1;
		while (n<0)
		{
			System.out.println("Wrong number!");
			System.out.println("Please enter a number:");
			n=input.nextInt();
		}
		for (i=1;i<=n;i++)
		{
			result*=i;
		}
		System.out.println(result);
	}

}
