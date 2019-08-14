/**
 * 윤년(2753) : https://www.acmicpc.net/problem/2753
 * @author Minah Shin
 *
 */

import java.util.*;

public class Main
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		System.out.println(getAnswer(a));
	}
	
	private static int getAnswer(int a) {
		if((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0)))
			return 1;
			
		return 0;
	}
}