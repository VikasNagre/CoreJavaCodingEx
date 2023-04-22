package streamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		
//		Map
		List<Integer> number = Arrays.asList(2,3,4,5);
		System.out.println(number.stream().map(x ->x*x).collect(Collectors.toList()));
		System.out.println(number);
	
//	filter
		List<String> names = Arrays.asList("Vikas","Saurabh","shah","java","spring");
		List<String> result = names.stream().filter(s ->s.startsWith("V")).collect(Collectors.toList());
		
		System.out.println(names);
		System.out.println(result);
	
//  Terminal operation (multiple)
		
		names.stream().filter(p->p.startsWith("s") && p.length()>2)
			.map(p-> p.toUpperCase())
			.sorted()
			.forEach(p->System.out.println(p));
		
		
	}

}
