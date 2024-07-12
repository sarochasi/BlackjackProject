package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;

public class Player {

	//Player HAS-A Hand
	//Do not add a getHand();
	private BlackJackHand hand;
	//No List<card>, hand has one
	
	public Player() {
		this.hand = new BlackJackHand();
	}
	
	public void addCardToHand(Card card) {
		//hand.addCard(card);
		
	}
	
	public int getHandValue() {
		return hand.getHandValue();
		
	}
	
	
	
}
