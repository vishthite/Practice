package Pack1;

import java.util.*;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] chelsea = {"Hazard","Oscar","Terry","Diego Costa"};
		List<String> list1 = new LinkedList<String>();
		for(String x:chelsea){
			list1.add(x);
		}
		
		String[] mcfc = {"Aguero","David Silva","Kevin De Bruyne","Kompany"};
		List<String> list2 = new LinkedList<String>();
		List<String> list3 = new ArrayList<String>();
		
		for (String y:mcfc){
			list2.add(y);
			list3.add(y);
		}
		
		printMe(list1); System.out.println();
		ListIterator<String> lit=list1.listIterator();
		printMe(list2); System.out.println();
		printMe(list3); System.out.println();
		list1.addAll(list2); 
		printMe(list1); System.out.println();
		Collections.sort(list1); 
		printMe(list1); System.out.println();
		list2.remove(1);
		printMe(list2);
		//lit.hasNext()
	}
	private static void printMe(List<String> l){
		for(String y:l)
			System.out.print(y+", ");
	}
}
