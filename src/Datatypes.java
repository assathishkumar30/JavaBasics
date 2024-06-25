public class Datatypes {
	// control - default
	// F6 - line by line
	// F8 - normally
	public static void main(String[] args) {
		System.out.println("Learning dataypes");

		byte b = 127;
		short s = 400;
		int i = 100;// 99% int will be used in selenium
		long l = 1000;
		System.out.println("byte " + b);
		System.out.println("short " + s);
		System.out.println("long " + l);

		i = 200;

		System.out.println("i");
		System.out.println(i);

		float f = 100.45f;
		System.out.println("float " + f);
		double d = 300; // 99% float will be used for decimal values
		System.out.println(d);
		char c = 'g';
		System.out.println(c);
		boolean bool = true; // true or false
		System.out.println(7 > 12);
		bool = 15 > 11;
		System.out.println("boolean value :" + bool);

		// Concatenation operator
		System.out.println("Value of i is " + i);
		
		// Println starts from left to right
		System.out.println("10 added to i " + i + 10); // Here print will start with string then i value then 10
		System.out.println(i + 10); // Here i value will be added by 10 and then gets printed
		System.out.println(i + 10 + " is the result of addition");
		System.out.println("10 added to i " + (i + 10)); // If we want to get output as we wish, we need to give within brackets

		String str = "Hello there";
		System.out.println(str);

	}

}
