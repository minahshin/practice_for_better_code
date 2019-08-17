/**
 * 연속으로 맞출 때마다 점수가 늘어나는 시험의 점수 구하기(8958) : https://www.acmicpc.net/problem/8958
 * @author Minah Shin
 *
 */

import java.util.*;
import java.util.stream.Collectors;

class Main
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt(); // consumes only integer value, not \n
		scan.nextLine(); // this line consumes "\n"
		
		for(int i=0;i<count;++i) {
			String sub = scan.nextLine();
			System.out.println(calcScore(sub));
		}
	}
	
	private static int calcScore(String sub) {
		int totalScore = 0;
		List<String> corrects = disuniteSub(sub);
		
		for(String parts : corrects) {
			totalScore += calcPartScore(parts.length());
		}
		
		return totalScore;
	}
	
	private static List<String> disuniteSub(String sub) {
		List<String> corrects = Arrays.asList(sub.split("X", -1));
		corrects = corrects.stream()
					.filter(x -> !x.equals(""))
					.collect(Collectors.toList());
		
		return corrects;
	}
	
	private static int calcPartScore(int length) {
		if(length == 1)
			return 1;
		
		return length + calcPartScore(length - 1);
	}
}