package java_enum;

public enum OperationEnum {
	A,B,C,D; //ABCD代表加减乘除
	public static Double getResult(Double num1,Double num2,OperationEnum op) {
		Double result = 0D;
		switch(op) {
		case A: result = num1+num2;
			break;
		case B: result = num1-num2;
			break;
		case C: result = num1*num2;
			break;
		case D: result = num1/num2;
			break;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(OperationEnum.getResult(3d, 2d, D));
	}
}
