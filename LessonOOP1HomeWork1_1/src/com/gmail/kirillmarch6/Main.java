package com.gmail.kirillmarch6;

public class Main {

	public static void main(String[] args) {
		
		Cat oneCat = new Cat("Barsik", "Persidskaya", 2, true);
		Cat twoCat = new Cat("Cherchill", "Main-kun", 1, false);
		Cat threeCat = new Cat("Halk", "Siamskaya", 1, true);
		
		System.out.println(oneCat);
		oneCat.getVoice();
		System.out.println(twoCat);
		twoCat.getEat();
		System.out.println(threeCat);
		threeCat.toPlay();
	}

}
