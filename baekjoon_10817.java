/**
 * 두번째로 큰 정수 찾기(10817) : https://www.acmicpc.net/problem/10817
 * @author Minah Shin
 * 두번째로 큰 정수인데 예시에는 중복된 숫자도 같이 세길래 Collections.sort 이용
 */

import java.util.*;

public class Main
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i=0;i<3;++i)
			nums.add(scan.nextInt());
		
		Collections.sort(nums);
		
		System.out.println(nums.get(1));
	}

}