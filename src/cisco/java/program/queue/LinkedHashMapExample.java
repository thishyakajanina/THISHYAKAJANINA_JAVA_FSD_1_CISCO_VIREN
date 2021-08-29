package cisco.java.program.queue;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> LinkedHashMap = new LinkedHashMap<Integer, String>();
		LinkedHashMap.put(1, new String("Samsung"));
		LinkedHashMap.put(2, new String("Toshiba"));
		LinkedHashMap.put(3, new String("HP"));
		LinkedHashMap.put(4, new String("HCL"));
		LinkedHashMap.put(5, new String("Sony"));
		
		System.out.println("contains elements :"+LinkedHashMap);
		System.out.println("\n Values of map after iterating over it :");
		for(Integer key:LinkedHashMap.keySet()){
			System.out.println(":\t"+LinkedHashMap.get(key));
		}
		System.out.println("\n The size of the linked hash map is :"+LinkedHashMap.size());
		System.out.println("\n Is linkedhashmap is empty?:"+LinkedHashMap.isEmpty());
		System.out.println("\nLinkedHashMap contains 2 as key? :"+LinkedHashMap.containsKey(2));
		System.out.println("\n LinkedHashMap contains HCL as value?:"+LinkedHashMap.containsValue("HCL"));
		System.out.println("\n Remove entry for key 3:"+LinkedHashMap.remove(3));
		System.out.println("\nContent of LinkedHashMap List :"+LinkedHashMap);
		
		LinkedHashMap.clear();
		System.out.println("\n After clearing Content of LinkedHashMap List :"+LinkedHashMap);
	}

}
