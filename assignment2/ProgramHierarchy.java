/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	public void run() {
		/* You fill this in. */
		double BoxX= 130;
		double BoxY= 40;
		double BoxXX = 1.2*BoxX;
		double BoxYY = 2*BoxY;
		
		double x=0.5*600;
		double y=0.5*300;

		GRect boxmid= new GRect(x-0.5*BoxX,y-0.5*BoxY,BoxX,BoxY);
		add(boxmid);
		
		GLabel labelmid = new GLabel("ConsoleProgramme", x, y);
		labelmid.move(-0.5*labelmid.getWidth(), 0.5*labelmid.getHeight());
		add(labelmid);

		GRect boxup= new GRect(x-0.5*BoxX,y-0.5*BoxY-BoxYY,BoxX,BoxY);
		add(boxup);
		
		GLine linemid = new GLine(x,y+0.5*BoxY-BoxYY, x,y-0.5*BoxY);
		add(linemid);
		
		GLabel labelup = new GLabel("Programme", x, y-BoxYY);
		labelup.move(-0.5*labelup.getWidth(), 0.5*labelup.getHeight());
		add(labelup);
		
		GRect boxleft= new GRect(x-BoxXX-0.5*BoxX,y-0.5*BoxY,BoxX,BoxY);
		add(boxleft);
		
		GLine lineleft = new GLine(x,y+0.5*BoxY-BoxYY, x-BoxXX,y-0.5*BoxY);
		add(lineleft);
		
		GLabel labelleft = new GLabel("GraphicsProgramme", x-BoxXX, y);
		labelleft.move(-0.5*labelleft.getWidth(), 0.5*labelleft.getHeight());
		add(labelleft);
		
		GRect boxright= new GRect(x+BoxXX-0.5*BoxX,y-0.5*BoxY,BoxX,BoxY);
		add(boxright);
		
		GLine lineright = new GLine(x,y+0.5*BoxY-BoxYY, x+BoxXX,y-0.5*BoxY);
		add(lineright);
		
		GLabel labelright = new GLabel("DialogProgramme", x+BoxXX, y);
		labelright.move(-0.5*labelright.getWidth(), 0.5*labelright.getHeight());
		add(labelright);
		
		
		

		
	}
}

