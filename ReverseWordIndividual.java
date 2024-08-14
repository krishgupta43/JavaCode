package Examples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordIndividual {
	public static void main(String[] args) {

		String str = "Hello Word";
		String res = Arrays.stream(str.split(" ")).map(x -> new StringBuffer(x).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(res);

	}
}
