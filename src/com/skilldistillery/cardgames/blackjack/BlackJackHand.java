package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.AbstractHand;
import com.skilldistillery.cardgames.common.Card;

public class BlackJackHand extends AbstractHand{

	//Has no fields
	public BlackJackHand() {
		super();
	}
	
	@Override
	public int getHandValue() {
		int value = 0;
		int aces = 0;
		
		for (Card card : cardsInHand) {
			value += card.getValue();
			if(card.getValue() == 11) {
				aces++;
			}
		}
		while (value > 21 && aces > 0) {
			value -= 10;
			aces--;
		}
		return value;
	}

	
	
	//TODO add other methods 
	public boolean isBlackjack() {
		if(getHandValue() == 21 && cardsInHand.size() == 2) {
			return true;
		}
		else {
			return false;
		}
				
		
	}
	
	public boolean isBust() {
		if(getHandValue() > 21) {
			return true;
		}else {
			return false;
		}
	}
	
//	public boolean isHard() {
//		return false;
//	}
//	
//	public boolean isSoft() {
//		return false;
//	}
//	

}
