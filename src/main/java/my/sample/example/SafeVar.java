package my.sample.example;

import java.util.List;

import com.google.common.collect.Lists;

//Example:- safevararg and list stream

public class SafeVar {
	public static void main(String[] args) {
		List<String> strList = Lists.newArrayList("1", "4", "7", "9");
		System.out.println("--------------------------------------------");
		strList.stream().forEach(str -> System.out.println(str));
		System.out.println("--------------------------------------------");
		strList.parallelStream().forEach(str -> System.out.println(str));
		System.out.println("--------------------------------------------");
		SafeVar.display(strList);
		System.out.println("--------------------------------------------");
	}

	@SafeVarargs
	private static void display(List<String>... products) {
		for (List<String> prd : products){
			System.out.println("prd: "+ prd);
		}
	}

}
