package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] sieve = new int [n];
		for (int i = 1; i < n; i++) // sieve.length is the same as n
		{
			sieve [i] = i + 1;
			System.out.println( sieve[i] );
		
		}
		for (int j = 2; j < n; j++) // j = 2 means that we are checking the multiples of 2
		{
			for (int i = (2 * j) - 1; i < n; i = i + j) // i = (2 * j) - 1 means that we are starting at the next multiple of whatever number (j) we are looking at, but at the index value
			{
				sieve [i] = 0;
			}
		}
		for (int i = 1; i < n; i++) // sieve.length is the same as n
		{
			System.out.println( sieve[i] );
		}
		
	}

}
