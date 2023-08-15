package view;

import java.util.Scanner;

import controller.DivResto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
	
		DivResto d = new DivResto();
		int res = d.FuncDivResto(A, B);
		
		System.out.println("Resto: "+res);
				
	}

}
