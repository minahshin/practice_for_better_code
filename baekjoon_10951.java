/**
 * 테스트케이스의 수가 주어지지 않은 A+B(10951) : https://www.acmicpc.net/problem/10951
 * hasNext 활용을 기억하고자 업로드
 * @author Minah Shin
 *
 */

import java.util.*;

class Main
{
	public static void main (String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a+b);
		}
	}
}