package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		//int num = 100;
		int numShifted = num << 0;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		// 4. Try shifting num 3 places.
		int num3 = num >>> 3;
		System.out.println(num3);
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
/*

			1  1  0 0 1 1 1 0 0		
   
  512 256 128 64 32 16 8 4 2 1

*/