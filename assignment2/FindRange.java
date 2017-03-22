/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		println("This program finds the largest and smallest numbers.");
		double max=0;
		double min=0;
		double sentinel = 0;
		int times=0;
		while (true) {
			double a = readDouble("? ");
			times++;
			if (a>max) max=a;
			if (a<min) min=a;
			if (a == sentinel) break;	
		}
		if (times==1) println("No values have been entered!");
		else {
			println("smallest: " + min);
			println("largest: "+ max);
		}

	}
}

