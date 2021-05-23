package Xeno.cards;

public class Teller extends Card{

	public Teller() {
		super(3, "占い師");
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void explain() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(cardNum + ":" + cardName + "です" );
	}

	@Override
	public void cardEffect() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
