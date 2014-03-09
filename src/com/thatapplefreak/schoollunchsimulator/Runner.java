package com.thatapplefreak.schoollunchsimulator;

import java.util.Random;

public class Runner {

	public static float budget;
	
	static Window display;
	
	private static final int numOfStudents = 2000;
	
	public static void run(Window display, float budget) {
		Runner.budget = budget;
		Runner.display = display;
		
		Random r = new Random();
		int active = r.nextInt(2);
		int impoverished = r.nextInt(2);
		float total = 0;
		for (int i = 0; i < numOfStudents; i++) {
			float c = new Student(active == 0 ? true : false, impoverished == 0 ? true : false).getLunchCost();
			c = (float)Math.round(c * 100) / 100;
			total += c;
			println(c);
		}
		println("");
		println("Total: $" + Math.round((total) * 100) / 100);
		println("Average: $" + (total/numOfStudents));
		println("Within Budget?: " + ((total/numOfStudents) < Integer.parseInt((String) display.comboBox.getSelectedItem()) / 5F)) ;
	}
	
	public static void println(Object line) {
		display.textPane.setText(display.textPane.getText() + "\n" + line.toString());
	}
	
	
}