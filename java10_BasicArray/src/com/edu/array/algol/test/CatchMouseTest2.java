package com.edu.array.algol.test;

import java.util.Scanner;

public class CatchMouseTest2 {
	
	private static String solve(int x, int y, int z) {
		// x=catA y= catB z = mouse
		int val =0;
		if(Math.abs(x-z)>Math.abs(y-z)
				
				
				) {
			val=2;		
		}
		else if(Math.abs(y-z)>Math.abs(x-z)) {
			val=1;		
		}
		else if(Math.abs(y-z)==Math.abs(x-z) && x<z && z<
				y) {

			val=3;
		}		
		
		
		
		switch(val) {
		case 1:
			
			
			
			return "CatA Catch!";
		case 2:
			return "CatB Catch!";
		case 3:
			return "Mouse Escapes!!";
			
		default:
			return"Error!";
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("cat a >> ");
		int cata = sc.nextInt();
		System.out.print("cat b >> ");
		int catb = sc.nextInt();
		System.out.print("mouse  >> ");
		int mouse = sc.nextInt();
		
		String result = solve(cata, catb, mouse);
		System.out.println(result);
	}

	

}
