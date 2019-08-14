/**
 * 알람시계 맞추기(2884) : https://www.acmicpc.net/problem/2884
 * @author Minah Shin
 *
 */

import java.util.*;

public class Main
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		System.out.println(calcHour(hour, min) + " " + calcMinute(min));
	}
	
	private static int calcMinute(int min) {
		if(min < 45)
			return 60 - (45 - min);
			
		return min - 45;
	}
	
	private static int calcHour(int hour, int min) {
		boolean isBack = isNegativeMinute(min);
		if(hour == 0 && isBack)
			return 23;
			
		if(isBack)
			return hour - 1;
		
		return hour;
	}
	
	private static boolean isNegativeMinute(int min) {
		if(min < 45)
			return true;
			
		return false;
	}
}