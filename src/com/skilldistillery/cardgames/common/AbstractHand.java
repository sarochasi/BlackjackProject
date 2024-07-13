package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {
	
	//DO not add getCardsInHand() method
	protected List<Card> cardsInHand;
	
	public AbstractHand() {
		this.cardsInHand = new ArrayList<>();
	}
	
	public abstract int getHandValue();
	
	//TODO addCArd(Card card) and clear() need to be added
	
	public void addCard(Card card) {
		
		cardsInHand.add(card);
	}
	
	public void clear() {
		
	}

	@Override
	public String toString() {
		return "AbstractHand [cardsInHand=" + cardsInHand + "]";
	}
	
	
}
