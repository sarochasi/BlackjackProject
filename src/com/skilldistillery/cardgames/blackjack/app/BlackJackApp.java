package com.skilldistillery.cardgames.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.cardgames.blackjack.Dealer;
import com.skilldistillery.cardgames.blackjack.Player;

public class BlackJackApp {

	// No List<Cards>
	// No Deck

	private Player player = new Player();
	private Dealer dealer = new Dealer();
	private Scanner scanner = new Scanner(System.in);
	boolean gameOver = false;

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.launch();
	}

	private void launch() {

		dealer.shuffleCard();

		player.addCardToHand(dealer.dealCard());

		dealer.addCardToHand(dealer.dealCard());

		player.addCardToHand(dealer.dealCard());
		System.out.println("Player's hand: " + player + "value: " + player.getHandValue());

		dealer.addCardToHand(dealer.dealCard());
		System.out.println("Dealer's visible card: " + dealer.toString().split(",")[1] + "value: " + dealer.getHandValue());
		
		if(!checkBlackjackOrBust()) {
			playerOption();
		}

	}

	private void playerOption() {
		
		while (!gameOver) {
			System.out.println();
			System.out.println("Do you want to hit or stand?\n" + "Enter\t(1) for hit\n\t(2) for stand ");
			String decision = scanner.next();
			
			switch (decision) {

			case "1":
				player.addCardToHand(dealer.dealCard());
				System.out.println("Player's hand: " + player + "value: " + player.getHandValue());				//checkWin();
				
				if(checkBlackjackOrBust()) {
					gameOver = true;
				}
				
				break;

			case "2":
				dealerMove();
				gameOver = true;
				return;
			default:
				System.out.println("Invalid option.");

			}
		}
	}

	private void dealerMove() {
		while (dealer.getHandValue() < 17) {
			System.out.println("Dealer is drawing.");
			dealer.addCardToHand(dealer.dealCard());
			System.out.println("Dealer's hand: " + dealer + "value: " + dealer.getHandValue());
			if(checkBlackjackOrBust()) {
				gameOver = true;
			}
		}
		if(!gameOver) {
			checkWin();
		}
	}
	
	private boolean checkBlackjackOrBust() {
		
		if (player.checkBlackjack()) {
			System.out.println("Blackjack! Player wins!!!");
			gameOver = true;
			return true;
		}

		if (player.checkBust()) {
			System.out.println("Player busts. Dealer win!!!");
			gameOver = true;
			return true;
		}

		if (dealer.checkBlackjack()) {
			System.out.println("Blackjack! Dealer wins!!!");
			gameOver = true;
			return true;
		}

		if (dealer.checkBust()) {
			System.out.println("Dealer busts. Player win!!!");
			gameOver = true;
			return true;
		}
		return false;
	}
	

	private void checkWin() {

	
		if (player.getHandValue() <= 21 && player.getHandValue() > dealer.getHandValue()) {		
			System.out.println("Player wins!!!");
			
		} else if (player.getHandValue() < dealer.getHandValue() && dealer.getHandValue() <= 21) {			
			System.out.println("Dealer wins!!!");
			
		} else if(player.getHandValue() == dealer.getHandValue()){
			System.out.println("It's a tie!!!");
			
		}

	}

}
