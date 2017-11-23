package unilim;

public class EuropeanParrot extends Parrot{
	
	public EuropeanParrot() {
		super(0, 0, false);
	}
	
	@Override
	public double getSpeed(){
		return BASESPEED;
	}
	

}
