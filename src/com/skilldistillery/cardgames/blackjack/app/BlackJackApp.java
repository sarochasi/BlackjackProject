package com.skilldistillery.cardgames.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.cardgames.blackjack.Dealer;
import com.skilldistillery.cardgames.blackjack.Player;

public class BlackJackApp {
	
	//No List<Cards>
	//No Deck
	
	private Player player = new Player();
	private Dealer dealer = new Dealer();
	private Scanner scanner;
	
	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.launch();
	}

	private void launch() {
		
		dealer.shuffleCard();
		
		player.addCardToHand(dealer.dealCard());
		System.out.println(player);
		
		dealer.addCardToHand(dealer.dealCard());
		
		player.addCardToHand(dealer.dealCard());
		System.out.println("Player's card: " + player);
		
		dealer.addCardToHand(dealer.dealCard());
		System.out.println("Dealer's card: " + dealer);
		
		playerOption();
		
			
	}
	
	private void playerOption() {
		System.out.println("Do you want to hit or stand?\n"
				+ "Press\t(1) for hit\n\t(2) for stand ");
	}
	
	private void checkWin() {
		
		if(player.checkBlackjack()) {
			System.out.println("");
		}
	}

}
