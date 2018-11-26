package durco.test.reactive.reactivetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ReactiveTestApplication {

	public static void main(String[] args) {
		isNextDigitSame(5888);
		SpringApplication.run(ReactiveTestApplication.class, args);
	}

	public static boolean isNextDigitSame(int valueToCheck) {
		Stream.of(Integer.toString(valueToCheck).).forEach(System.out::println);
		//char[] c = xx.toCharArray();
		return true;
	}
}
