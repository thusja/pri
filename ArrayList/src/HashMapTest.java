
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/// 2022.10.12

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
  //	HashMap map = new HashMap();
		
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		
	//	while(true) {
	//		System.out.println("아이디 입력 : ");
	//		String id = sc.next();
	//		System.out.println("비밀번호 입력 : ");
	//		String password = sc.next();
			
			// get(key) -> value값 변환
			// get("myid") -> "1234"
			// containKey(key) -> 존재 유무(true or false)
			
	//		if(!map.containsKey(id)) {
	//			System.out.println("아이디가 존재하지 않습니다. 다시 입력 하세요.");
	//			continue;
	//		}
	//		else {
	//			if(!(map.get(id)).equals(password)) {
	//				System.out.println("비밀번호가 존재하지 않습니다. 다시 입력 하세요");
	//			}
	//			else {
	//				System.out.println("로그인 성공");
	//				break;
	//			}
	//		}
			
		//	map.remove("myid");
		//	System.out.println(map); // key값 지우기
			
	//	} // while end
		
		
		// KeySet() : 키값 전체를 반환한다
		 Set<String> keys = map.keySet();		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("========================");
		
		// values() : values 전체를 반환한다 
		Collection<String> values = map.values();
		Iterator<String> itV = values.iterator();
		
		while(itV.hasNext()) {
			String value = itV.next();
			System.out.println(value);
		}
		
		Set<Entry<String,String>> entry = map.entrySet();
		Iterator<Map.Entry<String,String>> itE = entry.iterator();
		
		while(itE.hasNext()) {
			Map.Entry<String, String> ent = itE.next();
			String key = ent.getKey();
			String value = ent.getValue();
			
			System.out.println("[key]:" + key + "[value]:" + value);
		}
		
		System.out.println("===========================");
		
		for(Map.Entry<String, String> ent : map.entrySet() ) {
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]:" + key + "[value]:" + value);
		}
		
		
		
		
		
		
		
		

	}

}
