package Opps;

public class TeaMain {
	  public static void main(String[] args) {
	        Tee[] teas = new Tee[2];
	        teas[0] = new Tee();
	        teas[1] = new BlackTee();
	       // teas[2] = new GreenTee();
	       // teas[3] = new HerbalTee();

	        for (Tee tee : teas) {
	            tee.prepareTee();
	        }
	    }
}
