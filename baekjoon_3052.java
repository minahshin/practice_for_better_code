/**
 * 입력 받은 수를 42로 나눈 나머지 중 서로 다른 값의 개수 찾기(3052) : https://www.acmicpc.net/problem/3052
 * @author Minah Shin
 *
 */

import java.util.*;
import java.util.stream.Collectors; 
import java.util.stream.Stream; 

class Main
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i=0;i<10;++i) {
			nums.add(scan.nextInt() % 42);
		}
		
		List<Integer> reminders = nums.stream()
		                                  .distinct()
		                                  .collect(Collectors.toList());
		
		System.out.println(reminders.size());
	}
}