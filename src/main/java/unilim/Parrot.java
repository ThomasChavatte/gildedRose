package unilim;

public abstract class Parrot {
	final double BASESPEED = 12.0;
	
	private int numberOfCoconuts;
	private double voltage;
	private boolean isNailed;

	public Parrot(int numberOfCoconuts, double voltage, boolean isNailed) {
		this.numberOfCoconuts = numberOfCoconuts;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public abstract double getSpeed();

}