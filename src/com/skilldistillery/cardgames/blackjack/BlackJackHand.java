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
		return 0;
		// TODO Auto-generated method stub
	
	}

	
	
	//TODO add other methods 
	public boolean isBlackjack() {
		int sumCard = 0;
		for (int i = 0; i < cardsInHand.size(); i++) {
			sumCard += cardsInHand.get(i).getValue();	
		}
		
		if(sumCard == 21) {
			return true;
		}
		return false;
				
		
	}
	
	public boolean isBust() {
		int sumCard = 0;
		for (int i = 0; i < cardsInHand.size(); i++) {
			sumCard += cardsInHand.get(i).getValue();	
		}
		
		if(sumCard > 21) {
			return true;
		}
		return false;
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
