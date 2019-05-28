package test.test2;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {

		// int[] data = {10,45,43,65,23,34,76,65,89,19,54,34};
		//
		// for(int count = 0; count<data.length-1; count++)
		// {
		//
		// if(data[count]>data[count+1])
		// {
		// data[count] = data[count+1];
		// data[count+1] = data[count];
		// }
		// }
		//

		/**********************************************************************/

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.print("Enter String");
		// String s = br.readLine();
		// System.out.println("enter String..!!" + s);
		// System.out.print("Enter Integer:");
		// try{
		// int i = Integer.parseInt(br.readLine());
		// System.out.println("Test..!!" + i);
		// }catch(NumberFormatException nfe){
		// System.err.println("Invalid Format!");
		// }

		/********************************************************************/

		// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// System.out.print("Please enter user name : ");
		// String username = null;
		// try {
		// username = reader.readLine();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// System.out.println("You entered : " + username);

		/*******************************************************************/

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Entre Integer Number");
		// int num = sc.nextInt();
		// boolean isPrime = true;
		//
		// for(int i=2; i<num/2; i++ )
		// {
		// int temp = num%i;
		// if(temp == 0)
		// {
		// isPrime = false;
		// break;
		// }
		// }
		//
		// if(isPrime)
		// {
		// System.out.println("Given number is prime");
		//
		// }
		// else
		// {
		// System.out.println("Given number is not prime");
		// }

		/******************************************************/

		// n factorial
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		Search search = new Search();
		 System.out.println(search.fact(5));
		search.fibbo(10);
		search.trio(5);

		// fibbonaci till n number

	}

	public int fact(int n) {

		int result = 0;
		if (n == 0 || n == 1) {
			result = 1;
			
		} else {

			result = fact(n-1) * n;
			
		}

		return result;
	}

	public void fibbo(int n) {

		List<Integer> list = new ArrayList<>();

		int result = 0;

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == 1) {
				result = 1;
			} else {

				result = list.get(list.size() - 1) + list.get(list.size() - 2);

			}

			list.add(result);

		}

		System.out.println(list);

	}
	
	public void trio(int n) {
		
				
//		for(int i=0; i<n; i++)
//		{
//			
//			
//			for(int j=i; j<n; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.print(" ");
//
//			System.out.println();
//		}
		
//		for(int i=0; i<n; i++)
//		{		
//			for(int j=0; j<i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.print(" ");
//
//			System.out.println();
//		}
		
//		for (int i=0; i<n; i++)
//		{
//			for(int j=n; j>=i; j--)
//			{
//				System.out.print(" ");			
//			}
//			for(int k=0; k<=i; k++)
//			{
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<n; i++)
		{
			for(int k=i; k<n; k++)
			{
				System.out.print("*");	
				for(int j=0; j<n; j++)
				{
					System.out.print(" ");	
				}
			}
			System.out.println();	
		}
	}
}
