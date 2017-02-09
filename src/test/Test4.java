package test;//素数查询-数量

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of primes:");
		int number=input.nextInt();
		while (number<=0)
		{
			System.out.println("Wrong number!\nPlease enter the number of primes:");
			number=input.nextInt();
		}
		int[] prime = new int[number];
		int count=1;
		prime[0]=2;
		MAIN_LOOP:
		for (int i=3;count<number;i+=2)
		{
			for (int j=0;j<count;j++)
			{
				if (i%prime[j]==0)
				{
					continue MAIN_LOOP;
				}
			}
			prime[count++]=i;
		}
		for (int i:prime)
		{
			System.out.print(i+" ");
		}
	}

}
