package MapExe;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(234, "maran");
		hm.put(345, "raja");
		hm.put(365, "ram");
//		for(String g:hm.values()) {
//			
//		}
//		for(Integer i : hm.keySet()) {
//			if(i>300) {
//				System.out.println(hm.get(i));
//			}
//		}
	Iterator<Integer> itr = hm.keySet().iterator();
	while (itr.hasNext()) {
		if(hm.get(itr.next()).equals("raja")) {
			itr.remove();
		}
	}
	hm.forEach((k,v)->System.out.println(v));
	System.out.println(hm);
		
		
	}

}
