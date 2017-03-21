/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		/* You fill this in. */
		double Ra1=72;
		double Ra2=0.65*Ra1;
		double Ra3=0.3*Ra1;
		int y = getHeight()/2;
		int x = getWidth()/2;
		
		GOval r1= new GOval(x-Ra1,y-Ra1,Ra1*2,Ra1*2);
		/*GRect r1= new GRect(x,y,Ra1*2,Ra1*2);*/
		r1.setFilled(true);
	    r1.setColor(Color.RED);
	    add(r1);
	    
	    GOval r2= new GOval(x-Ra2,y-Ra2,Ra2*2,Ra2*2);
		r2.setFilled(true);
	    r2.setColor(Color.WHITE);
	    add(r2);
	    
	    GOval r3= new GOval(x-Ra3,y-Ra3,Ra3*2,Ra3*2);
		r3.setFilled(true);
	    r3.setColor(Color.RED);
	    add(r3);
				
	}
}
