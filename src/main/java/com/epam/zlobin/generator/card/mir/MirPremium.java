package com.epam.zlobin.generator.card.mir;

public class MirPremium extends Mir {

	private static final String TYPECARD = "Mir Premium";

	public MirPremium() {
		super.setTypecard(TYPECARD);
		this.getTypeCard();
		this.createNumber();
	}

}