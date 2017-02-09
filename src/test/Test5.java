package test;//素数查询-范围

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range;
		boolean[] prime_test = new boolean[1000];
		for(int i=1;i<prime_test.length;i++)
		{
			prime_test[i]=true;			
		}
		prime_test[1]=false;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the range of primes:");
		range=input.nextInt();
		while (range<2)
		{
			System.out.println("Wrong range!");
			System.out.println("Please enter the range of primes:");
			range=input.nextInt();
		}
		for (int i=2;i<=range;i++)
		{
			if (prime_test[i])
			{
				System.out.print(i+" ");
				for (int j=2;i*j<=range;j++)
				{
					prime_test[i*j]=false;
				}				
			}
		}
	}

}
