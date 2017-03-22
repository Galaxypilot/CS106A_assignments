/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		println("This is the demo of Hailstone sequence.");
		int n = readInt("Enter a number: ");
		int times=0;
		if (n>0) {
			while (n!=1) {
				if (n%2==0) {
					println(n+" is even, so I take half: "+n/2);
					n=n/2;
				}
				else {
					println(n+" is odd, so I make 3n+1: "+ (n*3+1));
					n=n*3+1;
				}
				
				times++;
				if (n==1) break;
			}
			println("The process took "+times+" to reach "+n);
		}
		else println("Pls input positive integer.");
		
	}
}

