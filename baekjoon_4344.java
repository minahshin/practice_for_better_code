/**
 * 평균 이상인 사람들의 비율 구하기(4344) : https://www.acmicpc.net/problem/4344
 * @author Minah Shin
 *
 */

import java.util.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int testCaseCount = scan.nextInt();
		
		for(int i=0;i<testCaseCount;++i) {
			int count = scan.nextInt();
			List<Integer> scores = new ArrayList<>();
			
			for(int j=0;j<count;++j) {
				scores.add(scan.nextInt());
			}
			
			System.out.println(calcPercent(scores, calcAvg(scores)) + "%");
		}
	}
	
	private static double calcAvg(List<Integer> scores) {
		return (double) scores.stream().mapToInt(e -> e).sum() / scores.size();
	}
	
	private static String calcPercent(List<Integer> scores, double avg) {
		int overAvgCount = 0;
			
		for(int score : scores) {
			if(score > avg)
				overAvgCount++;
		}
		
		return getRoundValue((double) overAvgCount / scores.size() * 100);
	}
	
	private static String getRoundValue(double value) {
		return String.format("%.3f", value);
	}
}