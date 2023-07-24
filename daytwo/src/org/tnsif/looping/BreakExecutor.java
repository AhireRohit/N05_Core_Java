package org.tnsif.looping;
import java.util.Scanner;
public class BreakExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			if(i == 5)
				break;
			else
				System.out.println(i + " ");
		}
		
		
	}

}
