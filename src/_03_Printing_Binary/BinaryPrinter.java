package _03_Printing_Binary;

public class BinaryPrinter {
	 //Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printIntBinary(521);
		short s = 521;
		bp.printShortBinary(s);
		byte b = (byte) 127;
		bp.printByteBinary(b);
		long l = 888;
		bp.printLongBinary(l);
	}
	
	public void printByteBinary(byte b) {
	printIntBinary(b);
	
	}
	
	
	public void printShortBinary(short s) {
		String str = String.valueOf(s); 
		int i = Short.parseShort(str);
		printIntBinary(i);
	}
	
	public void printIntBinary(int i) {
		String binary = "0";
		int x = i;
		
		for(int z = 2048; z>0; z = z/2) {
			if(x>=z) {
				x = x-z;
				binary = binary + "1";
			}
			else {
				binary = binary + "0";
			}
		}
		System.out.println(binary);
		
	}
	
	public void printLongBinary(long l) {
		String binary = "0";
		long x = l;
		
		for(int z = 2048; z>0; z = z/2) {
			if(x>=z) {
				x = x-z;
				binary = binary + "1";
			}
			else {
				binary = binary + "0";
			}
		}
		System.out.println(binary);
		
	}
	}
