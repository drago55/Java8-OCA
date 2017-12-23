package main.chapter_2_operators_and_statements;

class ExampleA {
}

class ExampleB extends ExampleA {
}

public class JavaOperators {

	public static void operatorsExample() {

		int a = 0;
		// Pre-unary-increment first increment and assign
		++a;
		print(a);
		// Pre-unary-decrement first decrement and assign
		--a;
		print(a);
		// Post increment first assign and increment
		a = a++;
		print(a);
		// Post decrement first assign and decrement
		a = a--;
		print(a);
	}

	public static void promotionExample() {
		byte b = 1;
		char c = 5;
		/*
		 * char result=b*c; will not compile because java is promoting byte short and
		 * char to int when using arithmetic operators result will be in int and can't
		 * fit in char
		 *
		 */
		char result_C = (char) (b * c); // We are casting result to char example compile but there can occur overflow or
										// underflow
		int result = b * c;
		print("Result in int " + result);
	}

	public static void instanceOfOperator() {
		/*
		 * True if the reference that points to is an instance of a class, subclass or
		 * class that implements particular interface, as named in b.
		 * 
		 */

		ExampleA a = new ExampleA();
		ExampleA b = new ExampleB();
		print(a instanceof ExampleA);
		print(b instanceof ExampleA);
		print(b instanceof ExampleB);

	}

	public static void compoundAssigmentOperators() {

		long l = 12;
		int i = 5;
		// i=i*l; will not compile because result will be promoted to bigger type in
		// this case long and
		// we are trying to store long value in int
		i *= l; // compound operator will first cast to long apply multiplication of two long
				// values and
		// then cast result to int type
		print(i);

	}

	public static void equalityOperators() {
		// equals operator ==
		// not equals operator !=

		int a = 5;
		double d = 5.0;
		/*
		 * Comparing two numeric variables if values are of different data types the
		 * values are automatically promoted
		 */
		print(a == d);
		// Comparing boolean values
		boolean c = false, b = true;
		print(c != b);
		// Comparing object reference
		ExampleA examA = new ExampleA();
		ExampleB examB = new ExampleB();
		ExampleA examC = examA;
		print(examA == examC); // prints true
		print(examB == examC); // prints false

	}

	public static void logicalOperators() {
		int a = 4;
		int b = 10;

		print((a < b) & (b > a)); // AND true if both operators are true
		print((a < b) | (b > a)); // Inclusive OR is false if both operands are false
		print((a < b) ^ (b > a)); // Exclusive OR true if operands are different
	}

	public static void conditionalOperators() {
		/*
		 * Conditional operators are often referred to as short-circuit operators if the
		 * final result can be evaluated by the left-hand side of the expression the
		 * right hand will never run
		 */
		int a = 4;
		int b = 10;
		print((a < b) && (b > a));
		print((a < b) || (b > a));

	}

	public static void relationalOperators() {

		int a = 10;
		int b = 20;
		int c = 5;
		print(a < b);
		print(a <= b);
		print(a >= c);
		print(a > c);
		print(a == b);

	}

	public static void promotionExample2() {
		int x = 1;
		long l = 44;
		// result= x+l; result will be in long since it is promoting to larger type
		print(x + l);
	}

	public static void promotionExample3() {
		short x = 18;
		float f = 31;
		double d = 25;
		print(x * f / d);// Result will be in double
		/*
		 * x will be promoted to int because it is short and when doing arithmetic
		 * operation it is promoted to int x again will be promoted to float so it can
		 * be multiplied with float f and result will be promoted to double so it can be
		 * divided with d final result will be double
		 */
	}

	public static void operatorsExample(int a, int b) throws ArithmeticException {
		print(a / b);
		print(a % b);
		print(a / b);
		print(a * b);
		print(a + b);
		print(a - b);
	}

	public static void print(Object o) {
		System.out.println(o);
	}

}
