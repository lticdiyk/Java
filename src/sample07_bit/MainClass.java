package sample07_bit;

public class MainClass {

	public static void main(String[] args) {		
		/*
			bit : 0, 1
			
			&		AND
			|		OR
			^		XOR
			<<		left shift
			>>		right shift
			~		NOT
		*/
		
		// AND
		int number = 0x71 & 0x8a;
		System.out.println(number);
		
		// OR
		int number1 = 0x71 | 0x8a;
		System.out.println(number1);
		System.out.printf("0x%x \n", number1);
		
		// XOR -> 보안
		int number2 = 0x71 ^ 0x85;
		System.out.println(number2);
		System.out.printf("0x%x \n", number2);
		
		int number3 = 0xf4 ^ 0x85;
		System.out.println(number3);
		System.out.printf("0x%x \n", number3);
		
		// left shift == *2
		short sh;
		sh = 0x1 << 3;
		System.out.println(sh);
		
		// right shift == /2
		sh = 0x8 >> 1;
		System.out.println(sh);
		
		// ~ 반전 0 -> 1    1 -> 0
		byte by = ~0x55;		
		System.out.printf("%x \n", by);
	}

}






