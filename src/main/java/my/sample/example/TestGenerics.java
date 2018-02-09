package my.sample.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestGenerics {
	public static void main(String[] args) {
			
		Box<String> bStr = new Box<String>();
		bStr.setT("testString");
		String tempStr = bStr.getT();
		System.out.println("tempStr :  "+tempStr );
		
		Box<Integer> bInt = new Box<>(); //In Java SE 7 and later //Integer optional while creating object
		bInt.setT(Integer.valueOf(10));
		
		Integer tempInt = bInt.getT();
		System.out.println("tempInt :  "+tempInt );
		
		Box<Integer> bIntB = new Box<Integer>(); //Integer optional while creating object
		bIntB.setT(Integer.valueOf(20));
		
		Integer tempIntB = bIntB.getT();
		System.out.println("tempIntB :  "+tempIntB );
		
		Box rawType = new Box();
		rawType = bStr;
		rawType.setT(8);
		
		System.out.println("rawType :  "+rawType.getT() );
		
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");
		boolean same = Util.<Integer, String>compare(p1, p2);
		
		boolean sameP1 = Util.<Integer, String>compare(p1, p1);
		
		System.out.println("same :  "+same );
		
		System.out.println("sameP1 :  "+sameP1);
		
		List<String> intList = new ArrayList<>();
		
		//intList.add(1); //error
		intList.add("test");

		List rawList = new ArrayList();//raw TYpe support - Autoboxing
		
		rawList.add(1);
		rawList.add("test");
		
		List<String> testList = new ArrayList<String>();//raw TYpe support - Autoboxing
		testList.add("X");
		testList.add("A");
		testList.add("Q");
		testList.add("D");
		
		System.out.println("testList : "+ testList);
		
		Collections.sort(testList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		
		});
		
		System.out.println("testList AFTER SORT: "+ testList);

	}
}
