package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

public class Dealer extends Player{
	
	//Already has a hand, because Dealer extends player
	//DO not add a getDeck();
	
	public Deck deck;
	
	public Dealer() {
		super();
		deck = new Deck();
		
	}
	
	
	//TODO add dealer specific behaviors
	public Card dealCard() {
		return deck.dealCard();
	}

	@Override
	public String toString() {
		return Dealer.super.toString();
	}

	public void shuffleCard() {
		deck.shuffle();
	}

	
}
