package com.edu.array.algol.test;

public class ArrayMAxAndMinTest1 {

	public static void main(String[] args) {
		int[] scores = {79, 88, 91, 44, 100 ,55, 95};
		// 가장 높은 점수와 가장 낮은 점수 출력 (MAX MIN)
		
		int min = scores[0], max = scores[0];
		for(int i=0; i<scores.length; i++) {
			
			if(scores[i]<min) min = scores[i];
			if(scores[i]>max) max = scores[i];
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
	}

}
