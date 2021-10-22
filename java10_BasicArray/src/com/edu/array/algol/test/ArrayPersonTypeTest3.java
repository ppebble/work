package com.edu.array.algol.test;

import java.util.Scanner;

public class ArrayPersonTypeTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사람 수 입력 >> ");
		int num = sc.nextInt();
		
		int[] people = new int[num];
		for(int i=0; i<people.length; i++) {
			System.out.println(i+1 + "번째 사람 유형 등록");
			people[i] = sc.nextInt();
			
		}
		int count1=0, count2=0, count3=0, count4=0,count5=0;
		//for 문을 이용하여 가장 많은 유형 출력
		for(int i = 0; i<people.length; i++) {
			if(people[i]==1) {
				count1 = count1 + 1;
			}
			else if(people[i]==2) {
				count2 = count2+1;
			}
			else if(people[i]==3) {
				count3 = count3+1;
				}
			else if(people[i]==4) {
				count4 = count4+1;
			}
			else if(people[i]==5) {
				count5 = count5+1;
			}
			else {
				System.out.println("Non Type Error!");
				System.exit(0);
			}

		}
		
		int count[] = {count1, count2, count3, count4, count5};
		int max = 0; int val=0;
		for(int i=0; i<5; i++) {
			if(count[i]>max) {
				max = count[i];
				val=i+1;
				
				
			}
		}
		
		System.out.println(count5);
		
		System.out.println("가장 많은 유형은  >>" + val );
		
	}

}
