package streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveAndParallelStream {

	public static void main(String[] args) {
		int[] integers = {1,2,3,4,5,5};
		IntStream intStream = Arrays.stream(integers);
		
		System.out.println(intStream.min().getAsInt());
		
	//	List<Integer> listofIntegers = intStream.boxed().collect(Collectors.toList());
		
		List<String> list = Arrays.asList("java","spring","hibernet","mvc","mysql","mongodb","springboot","python");
		list.parallelStream().forEach(System.out::print);
//  OR	list.parallelStream().forEach(p ->System.out.print(p);
		
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
	}
}
