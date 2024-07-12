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
}
