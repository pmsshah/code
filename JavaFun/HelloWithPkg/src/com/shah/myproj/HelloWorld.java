package com.shah.myproj;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world from pkg");
		//BasicTypePrecedence();
		//BasicTypeConversion();
		//NestedIf();
		//CalcEng1();
		//CalcEng2();
		//CalcEng3();
		//CalcEng4();
		CalcEng5();
	}
	
	public static void BasicTypePrecedence() {
		int valA = 21;
		int valB = 6;
		int valC = 3;
		int valD = 1;
		
		int result1 = valA - valB / valC;
		int result2 = (valA - valB) / valC;
	
		System.out.println(result1);
		System.out.println(result2);
		
		int result3 = valA / valC * valD + valB;
		int result4 = valA / (valC * (valD + valB));
		System.out.println(result3);
		System.out.println(result4);
	}
	
	public static void BasicTypeConversion() {
		float floatVal = 1.0f;
		double doubleVal = 4.0d;
		byte byteVal = 7;
		short shortVal = 7;
		long longVal = 5;
		
		short result1 = (short) byteVal; 
		short result2 = (short) (byteVal - longVal);

		float result3 = longVal - floatVal;
		long result4 = (long) (shortVal - longVal + floatVal + doubleVal);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

	public static void NestedIf() {
		float students = 0.0f;
		float rooms = 4.0f;
		
		if(students > 0.0f) {
			if(rooms>0.0f)	
				System.out.println("students/rooms");
		}
		else
			System.out.println("No Students");
	}

	public static void CalcEng1() {
		double dVal1 = 100.0d;
		double dVal2 = 0.0d;
		double dResult;
		char cOpCode='x';
		
		if(cOpCode == 'a') 
			dResult = dVal1+dVal2;
		else if(cOpCode == 's')
			dResult = dVal1-dVal2;
		else if(cOpCode == 'd')
			dResult = dVal2 == 0 ? 0.0d : dVal1/dVal2;
		else if(cOpCode == 'm')
			dResult = dVal1*dVal2;
		else {
			dResult = 0.0d; 
			System.out.println("Onvalid OpCode");
		}
			
		System.out.println(dResult);
	}
	public static void CalcEng2() {
		double[] dVal1 = {100.0d, 25.0d, 225.0d, 11.0d};
		double[] dVal2 = {50.0d, 92.0d, 17.0d, 3.0d};
		char[] cOpCode = {'d', 'a', 's', 'm'};
		double[] dResult = new double[cOpCode.length];

		for(int i=0; i<cOpCode.length; i++) {
			switch(cOpCode[i]) {
				case 'a':
						dResult[i] = dVal1[i]+dVal2[i];
						break;
				case 's':
						dResult[i] = dVal1[i]-dVal2[i];
						break;
				case 'd':
						dResult[i] = dVal2[i] == 0 ? 0.0d : dVal1[i]/dVal2[i];
						break;
				case 'm':
						dResult[i] = dVal1[i]*dVal2[i];
						break;
				default: 
						dResult[i] = 0.0d; 
						System.out.println("Onvalid OpCode");
						break;
			}
		}
		for(double res : dResult)
			System.out.println(res);
	}
	
	public static void CalcEng3() {
		MathEquation[] equation = new MathEquation[4];
		equation[0] = CalcEng3Create(100.0d, 50.0d, 'd');
		equation[1] = CalcEng3Create(25.0d, 92.0d, 'a');
		equation[2] = CalcEng3Create(225.0d, 17.0d, 's');
		equation[3] = CalcEng3Create(11.0d, 3.0d, 'm');
		

		for(int i=0; i<equation.length; i++) {
			equation[i].execute();
			System.out.println("Result: ");
			System.out.println(equation[i].getdResult());
		}
	}
	
	public static MathEquation CalcEng3Create(double leftVal, double rightVal, char opCode) {
		MathEquation equation = new MathEquation();
		equation.setdVal1(leftVal);
		equation.setdVal2(rightVal);
		equation.setcOpCode(opCode);
		return equation;
	}

	public static void CalcEng4() {
		MathEquation[] equation = new MathEquation[4];
		equation[0] = new MathEquation(100.0d, 50.0d, 'd');
		equation[1] = new MathEquation(25.0d, 92.0d, 'a');
		equation[2] = new MathEquation(225.0d, 17.0d, 's');
		equation[3] = new MathEquation(11.0d, 3.0d, 'm');
		
		for(int i=0; i<equation.length; i++) {
			equation[i].execute();
			System.out.println("Result: ");
			System.out.println(equation[i].getdResult());
		}
	}

	public static void CalcEng5() {
		MathEquation equationOverload = new MathEquation('m');
		
		equationOverload.execute(11.0d, 3.0d);
		System.out.println("Result: ");
		System.out.println(equationOverload.getdResult());
	}

}
