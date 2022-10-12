
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
	//		System.out.println("���̵� �Է� : ");
	//		String id = sc.next();
	//		System.out.println("��й�ȣ �Է� : ");
	//		String password = sc.next();
			
			// get(key) -> value�� ��ȯ
			// get("myid") -> "1234"
			// containKey(key) -> ���� ����(true or false)
			
	//		if(!map.containsKey(id)) {
	//			System.out.println("���̵� �������� �ʽ��ϴ�. �ٽ� �Է� �ϼ���.");
	//			continue;
	//		}
	//		else {
	//			if(!(map.get(id)).equals(password)) {
	//				System.out.println("��й�ȣ�� �������� �ʽ��ϴ�. �ٽ� �Է� �ϼ���");
	//			}
	//			else {
	//				System.out.println("�α��� ����");
	//				break;
	//			}
	//		}
			
		//	map.remove("myid");
		//	System.out.println(map); // key�� �����
			
	//	} // while end
		
		
		// KeySet() : Ű�� ��ü�� ��ȯ�Ѵ�
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
		
		// values() : values ��ü�� ��ȯ�Ѵ� 
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
