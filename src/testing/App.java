package testing;

public class App {
public static void main(String[] args) {

	loopFizzBuzz();
}

public static void loopFizzBuzz() {
	for (int i = 1; i <= 100; i++) {
		if (i % 2 == 0 && i % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (i % 2 == 0) {
			System.out.println("Fizz");
		} else if (i % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(i);
		}
	}
}
}
