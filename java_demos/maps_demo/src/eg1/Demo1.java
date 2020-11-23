package eg1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<>();
		hm.put(100, "java");
		hm.put(120, "java");
		hm.put(null, "java");
		hm.put(140, "java");
		hm.put(110, null);
		hm.put(160, null);
		//System.out.println(hm);
		hm.put(null, "null updated");
		hm.put(160,"repo");
		hm.put(150, "git");
		System.out.println("hm ="+ hm);
		
		
		Map<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(100, "java");
		lhm.put(120, "java");
		lhm.put(null, "java");
		lhm.put(140, "java");
		lhm.put(110, null);
		lhm.put(160, null);
		//System.out.println(hm);
		lhm.put(null, "null updated");
		lhm.put(160,"repo");
		lhm.put(150, "git");
		System.out.println("lhm:"+lhm);
		
		Map<Integer, String> tm = new TreeMap<>(Collections.reverseOrder());
		tm.put(100, "java");
		tm.put(120, "java");
		//tm.put(null, "java");
		tm.put(140, "java");
		tm.put(110, null);
		tm.put(160, null);
		//System.out.println(hm);
		//tm.put(null, "null updated");
		tm.put(160,"repo");
		tm.put(150, "git");
		System.out.println("tm="+tm);
		
		Map<Integer, String> ht = new Hashtable<>();
		ht.put(100, "java");
		ht.put(120, "java");
		//ht.put(null, "java");
		ht.put(140, "java");
		//ht.put(110, null);
		//ht.put(160, null);
		//System.out.println(hm);
		//ht.put(null, "null updated");
		ht.put(160,"repo");
		ht.put(150, "git");
		System.out.println("ht:"+ht);
		
		System.out.println(ht.size());
		
		System.out.println(ht.containsKey(101));
		System.out.println(ht.containsKey(100));
		System.out.println(ht.containsValue("git"));
		System.out.println(ht.containsValue("git-repo"));
		
		System.out.println(ht.get(100));
		System.out.println(ht.get(1000));
		
		System.out.println(ht.remove(100));
		System.out.println(ht);
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		System.out.println(ht.entrySet());
		
		Set<Integer> set = ht.keySet();
		
		System.out.println("Iterating with keySet()");
		for(Integer i : set) {
			System.out.println("Key "+i +" Value: "+ht.get(i));
		}
		
		System.out.println("Iterating with EntrySet()");
		for(java.util.Map.Entry<Integer, String> e : ht.entrySet()) {
			System.out.println("Key -> "+e.getKey() +" Value -> "+e.getValue());
		}
	}
}

