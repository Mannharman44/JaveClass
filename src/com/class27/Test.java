package com.class27;

public class Test {

	public static void main(String[] args) {

		Card card = new AX();

		card.creditLimit();

		Card card1 = new MC();
		card1.creditLimit();

		Card card2 = new Visa();
		card2.creditLimit();

		Card[] cardArray = { card, card1, card2 };

		Card[] cardArray1 = {new MC(), new AX(), new Visa() };
			
		//cardArray[0];
		//cardArray[3];
		
		for(Card obj:cardArray1) {
			
			obj.creditLimit();
			obj.chargeInterest();
			
		}
	}

}
