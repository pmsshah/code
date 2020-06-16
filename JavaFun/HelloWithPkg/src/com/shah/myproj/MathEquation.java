package com.shah.myproj;

public class MathEquation {

	private double dVal1;
	private double dVal2;
	private char cOpCode='a';
	private double dResult;
	

	public MathEquation() {}
	public MathEquation(char OpCode) {
		cOpCode = OpCode;
	}
	
	public MathEquation(double leftVal, double rightVal, char OpCode) {
		this(OpCode);
		dVal1 = leftVal;
		dVal2 = rightVal;
	}

	public double getdVal1() {
		return dVal1;
	}

	public double getdVal2() {
		return dVal2;
	}

	public char getcOpCode() {
		return cOpCode;
	}

	public double getdResult() {
		return dResult;
	}

	public void setdVal1(double dVal1) {
		this.dVal1 = dVal1;
	}
	
	public void setdVal2(double dVal2) {
		this.dVal2 = dVal2;
	}

	public void setcOpCode(char cOpCode) {
		this.cOpCode = cOpCode;
	}

	public void setdResult(double dResult) {
		this.dResult = dResult;
	}

	public void execute() {
		switch(cOpCode) {
			case 'a':
					dResult = dVal1+dVal2;
					break;
			case 's':
					dResult = dVal1-dVal2;
					break;
			case 'd':
					dResult = dVal2 == 0 ? 0.0d : dVal1/dVal2;
					break;
			case 'm':
					dResult = dVal1*dVal2;
					break;
			default: 
					dResult = 0.0d; 
					System.out.println("Onvalid OpCode");
					break;
		}
	}

	public void execute(double leftVal, double rightVal) {
		dVal1= leftVal;
		dVal2 = rightVal;
		switch(cOpCode) {
			case 'a':
					dResult = dVal1+dVal2;
					break;
			case 's':
					dResult = dVal1-dVal2;
					break;
			case 'd':
					dResult = dVal2 == 0 ? 0.0d : dVal1/dVal2;
					break;
			case 'm':
					dResult = dVal1*dVal2;
					break;
			default: 
					dResult = 0.0d; 
					System.out.println("Onvalid OpCode");
					break;
		}
	}	
}
