import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSetAnsHashMap {
	public static void main(String[] args) {
		
		//HashSet
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(3);  // note that this will not be added
		
		System.out.println(hashSet);  // [1, 2, 3]
		System.out.println(hashSet.size()); // 3
		System.out.println(hashSet.contains(3)); // true
		System.out.println(hashSet.isEmpty()); // false
		System.out.println(hashSet.remove(3));  // true
		System.out.println(hashSet);  // // [1, 2]
		
		Iterator<Integer> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}  // 1 2
		System.out.println();
		
		// Hash Map
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2,"bcd");
		map.put(3,"xyz");
		map.put(3,"pqr");  // key 3 will be updated with xyz
		map.put(4,"rst");
		
		System.out.println(map);  // {1=abc, 2=bcd, 3=pqr, 4=rst}
		map.remove(4, "abc");
		System.out.println(map);  // {1=abc, 2=bcd, 3=pqr, 4=rst}
		map.remove(4);
		System.out.println(map);  // {1=abc, 2=bcd, 3=pqr}
		
		System.out.println(map.containsKey(1));  // true
		System.out.println(map.containsValue("bcd"));  // true
		System.out.println(map.get(1)); //abc
		System.out.println(map.getOrDefault(5, "Default")); //Default
		System.out.println(map.getOrDefault(1, "Default")); //abc
		System.out.println(map.isEmpty()); // false
		System.out.println(map.values());  // [abc, bcd, pqr]
		System.out.println(map.keySet());  // [1, 2, 3]
		System.out.println(map.size());  // 3
		
		map.putIfAbsent(2, "newValue");
		System.out.println(map);  // {1=abc, 2=bcd, 3=pqr}
		map.putIfAbsent(5, "newValue");
		System.out.println(map); // {1=abc, 2=bcd, 3=pqr, 5=newValue}
		
		System.out.println(map.entrySet()); // [1=abc, 2=bcd, 3=pqr, 5=newValue]
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.print("{"+entry.getKey()+","+entry.getValue()+"} ");
		}  // {1,abc} {2,bcd} {3,pqr} {5,newValue}
				
	}
}


