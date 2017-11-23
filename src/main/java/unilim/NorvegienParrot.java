package unilim;

public class NorvegienParrot extends Parrot{
	private final double voltage;
	private final boolean isNailed;
	
	public NorvegienParrot(double voltage, boolean isNailed) {
		super(0, voltage, isNailed);
		this.voltage=voltage;
		this.isNailed=isNailed;
		
	}
	
	
	public double getSpeed(){
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}
	
	private double getBaseSpeed(double voltage){
		return Math.min(24.0, this.voltage*BASESPEED);
	}
	

}
