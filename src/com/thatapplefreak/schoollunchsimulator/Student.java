package com.thatapplefreak.schoollunchsimulator;

public class Student {
	
	boolean active;
	
	boolean impoverished;
	
	public Student(boolean active, boolean impoverished) {
		this.active = active;
		this.impoverished = impoverished;
	}
	
	public float getLunchCost() {
		float cost = 0;
		cost += chooseGrain();
		cost += chooseFriut();
		cost += chooseVegatable();
		cost += chooseDairy();
		cost += chooseGrain();
		cost += chooseProtin();
		cost += chooseEmptyCalories();
		return cost;
	}

	private float chooseProtin() {
		Food item;
		do {
			item = Food.getRandomFood();
		} while (item.group != 4);
		return item.price;
	}

	private float chooseEmptyCalories() {
		Food item;
		do {
			item = Food.getRandomFood();
		} while (item.group != 5);
		return item.price;
	}

	private float chooseDairy() {
		Food item;
		do {
			item = Food.getRandomFood();
		} while (item.group != 3);
		return item.price;
	}

	private float chooseVegatable() {
		Food item;
		do {
			item = Food.getRandomFood();
		} while (item.group != 2);
		return item.price;
	}

	private float chooseFriut() {
		Food item;
		do {
			item = Food.getRandomFood();
		} while (item.group != 1);
		return item.price;
	}

	private float chooseGrain() {
		Food item;
		do {
			item = Food.getRandomFood();
		} while (item.group != 0);
		return item.price;
	}
}
