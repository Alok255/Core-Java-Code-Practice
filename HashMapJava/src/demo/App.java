package demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	private static final int Integer = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> hashMap2=new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap=new TreeMap<Integer, String>();
		
		testMap(hashMap);
	}
	
	public static void testMap(Map<Integer, String> map){
		map.put(1, "JAVA");
		map.put(2, "Android");
		map.put(2, "Android App");
		map.put(3, "PHP");
		map.put(4, "C & C++");
		
		for(Integer key :	map.keySet()){
			System.out.println(key + map.get(key));
		}
	}

}
