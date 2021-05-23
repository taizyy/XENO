package Xeno;

import java.util.List;
import java.util.Scanner;

import Xeno.cards.Card;

public class PlayerTurnMethod {

	public static boolean playerTurn(List<Card> player1Hand,List<Card> player2Hand,List<Card> playedCard, List<Card> deck,boolean turnChange) {

		player1Hand.add(Method.draw(deck));

		Scanner sc = new Scanner(System.in);

		int num;

		do {
			System.out.println("Select play hand 1 ->" + player1Hand.get(0).cardNum + ":" + player1Hand.get(0).cardName + " 2 ->" + player1Hand.get(1).cardNum + ":" + player1Hand.get(1).cardName );
			num = sc.nextInt();
		}while(num != 1 && num != 2);

		if(num == 1) {

			System.out.print("play hand ->");
			player1Hand.get(0).explain();
			playedCard.add(player1Hand.get(0));
			player1Hand.remove(0);


		}else {
			System.out.print("play hand ->");
			player1Hand.get(1).explain();
			playedCard.add(player1Hand.get(1));
			player1Hand.remove(1);
		}


		return !turnChange;



	}
}
