package test;//成绩计算

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] score = new int[10];
		int sum=0,count=0;
		double average;
		for (int i=0;i<score.length;i++)
		{
			score[i]=input.nextInt();
			if (score[i]==-1)
			{
				break;
			}
			sum+=score[i];
			count++;
		}
		average=(double)sum/count;
//		System.out.printf("%d\n%d\n%f\n",sum,count,average);
		boolean k =true;
		if (k!=false)
		{
			System.out.println(sum);
			System.out.println(count);
			System.out.println(average);
		}
		
	}

}
