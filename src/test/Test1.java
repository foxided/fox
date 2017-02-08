package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number=(int)(Math.random()*100+1);
		int guess,count=1;
		guess=in.nextInt();
		while (guess!=number)
		{
			if (guess<number)
			{
				System.out.println("Small!");
			}
			else if (guess>number)
			{
				System.out.println("Large!");
			}
			count++;
			guess=in.nextInt();
		}
		System.out.println("Right!\nYou guess "+count+" times!");
		
	}

}
