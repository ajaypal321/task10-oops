package Opps;

public class BlackTee extends Tee {
	@Override
    public void prepareTee() {
        System.out.println("Preparing black tea with hot water and black tea leaves.");
    }
}

class GreenTea extends Tee {
    @Override
    public void prepareTee() {
        System.out.println("Preparing green tea with hot water and green tea leaves.");
    }
}

class HerbalTea extends Tee {
    @Override
    public void prepareTee() {
        System.out.println("Preparing herbal tea with hot water and herbal tea leaves.");
    }
}
