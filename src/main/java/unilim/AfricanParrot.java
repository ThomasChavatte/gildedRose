package unilim;

public class AfricanParrot extends Parrot{
	
	private final int numberOfCoconut;
	public AfricanParrot(int numberOfCoconut) {
		super(numberOfCoconut, 0, false);
		this.numberOfCoconut = numberOfCoconut;
		
	}
	
	@Override
	public double getSpeed(){
		return Math.max(0,BASESPEED- 9.0*this.numberOfCoconut) ;
	}
	

}
