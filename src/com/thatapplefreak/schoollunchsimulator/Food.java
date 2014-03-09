package com.thatapplefreak.schoollunchsimulator;

import java.util.Random;

/**
 * 
 * @author Byron Zaharako
 */
public enum Food {

	/*
	 * 0=grains
	 * 1=fruit
	 * 2=Vegetable
	 * 3=dairy
	 * 4=protein
	 * 5=EmptyCalories
	 */
	
	BREAD         (0, .04F, 185),
	BAGEL         (0, .10F, 245),
	RAMEN         (0, .06F, 190),
	
	
	GRAPES        (1, .12F, 98),
	APPLE         (1, .05F, 95),
	BANNANA       (1, .06F ,105),
	PEAR          (1, .09F, 102),
	KIWI          (1, .08F, 42),
	
	CARROTS       (2, .16F, 35),
	BROCCOLI      (2, .13F, 50),
	TOMATO        (2, .08F, 22),
	
	SKIMMILK      (3, .17F, 90),
	YOGURT        (3, .29F, 100),
	
	BURGER        (4, .33F, 204),
	EGG           (4, .14F, 78),
	CHICKEN       (4, .31F, 250),
	
	REESESCUP     (5, .29F, 105),
	
	;
	
	int group;
	float price;
	int calories;
	
	private Food(int group, float price, int calories) {
		this.group = group;
		this.price = price;
		this.calories = calories;
	}
	
	public static Food getRandomFood() {
		return values()[new Random().nextInt(values().length)];
	}

}
// start9