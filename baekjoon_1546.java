/**
 * 조작된 점수 값으로 평균 구하기(1546) : https://www.acmicpc.net/problem/1546
 * @author Minah Shin
 *
 */

import java.util.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		ArrayList<Double> scores = new ArrayList<>();
		
		for(int i=0;i<count;++i) {
			scores.add(scan.nextDouble());
		}
		
		double maxScore = Collections.max(scores);
		/*
		 int[] score = new int[count]; 였을 시, 최대값 반환 메소드
		 int maxScore = Arrays.stream(scores).max.getAsInt();
		*/
		
		for(int i=0;i<count;++i) {
			scores.set(i, (scores.get(i) / maxScore) * 100);
		}
		
		double sum = scores.stream().mapToDouble(a -> a).sum();
		System.out.println(sum / count);
	}
}