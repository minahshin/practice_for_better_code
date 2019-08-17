/**
 * 빠른 A+B(15552) : https://www.acmicpc.net/problem/15552
 * @author Minah Shin
 *
 */

import java.util.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0;i<count;++i) {
			String input = br.readLine();
			String[] array = input.split(" ", -1);
			int sum = 0;
			for(String arrayValue : array) {
        		sum += Integer.parseInt(arrayValue);
    		}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}

/* 시간 초과로 정답처리 되지 못한 코드
import java.util.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0;i<count;++i) {
			bw.write(calcSum(br.readLine())+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	private static int calcSum(String inputs) {
		return stringParser(inputs).stream()
		.mapToInt(i -> i)
		.sum();
	}
	
	private static ArrayList<Integer> stringParser (String inputs) {
		Scanner scanner = new Scanner(inputs);
		ArrayList<Integer> list = new ArrayList<>();
		while (scanner.hasNextInt())
    		list.add(scanner.nextInt());
		
		return list;
	}
}
*/