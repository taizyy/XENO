package Xeno;

import java.util.LinkedList;
import java.util.List;

import Xeno.cards.Card;

public class Xeno {

	public static void main(String[] args) {

 		//プレイヤーネーム
		String player1 = "taiji",player2 = "okuda";
		//転生札
		Card Reincarnation;
		//デッキ
		List<Card> deck = new LinkedList<Card>();
		//場に出たカード
		List<Card> playedCard = new LinkedList<>();
		//プレイヤーが持っているカード
		List<Card> player1Hand = new LinkedList<Card>();
		List<Card> player2Hand = new LinkedList<Card>();

		//ターンチェンジフラグ
		boolean turnChange = true;

		Method.createDeck(deck);
		Method.deckShuffle(deck);
		Method.showDeck(deck);



		Reincarnation = Method.draw(deck);
		player1Hand.add(Method.draw(deck));
		player2Hand.add(Method.draw(deck));

		System.out.println(player1Hand.get(0).cardNum + " " + player2Hand.get(0).cardNum + " ");

		while(deck.size() > 1 ) {

			if(turnChange) {
				turnChange = PlayerTurnMethod.playerTurn(player1Hand,player2Hand,playedCard,deck,turnChange);
			}
			else {
				turnChange = PlayerTurnMethod.playerTurn(player2Hand,player1Hand,playedCard,deck,turnChange);
			}
		}

		System.out.println("game set");


		//プレイヤーのターン



	}

}
