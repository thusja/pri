import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/// 2022.10.11

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("1"); // String -> Object 형변환이 발생
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		list.get(0);
		String str = (String)list.get(0); // Object -> String
		System.out.println(str);
		
		System.out.println();
		
		int sum = 0;
		
		for(Object obj : list) {
			String str2 = (String)obj;
			System.out.println(str2);
			
			int num = Integer.parseInt(str2);
			sum += num;		
		}
		
		System.out.println("sum = " + sum);
		System.out.println();
		
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		list.remove(3);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// iterator 반복자 패턴
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) { // 데이터 존재 유무 확인
			String str3 = (String)it.next(); // 값을 가지고 오는 역할
			System.out.println(str3);
			
		}
		
		// 제네릭 : 컬렉션 객체의 데이터 타임을 한정한다
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("1");
	//	list2.add(1);
		
		
		//set
		HashSet set = new HashSet();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		
		for(Object obj : set) {
			String str4 = (String)obj;
			System.out.println(str4);
		}
		
		// TreeSet : 반드시 값으로 사용되는 해당 클래스 안에는 정렬 조건이 오버라이딩 되어있어야한다
		// implements COmparable (Integer, String ....)
		
		TreeSet set2 = new TreeSet(); // 값이 정렬되어진다
		
		set2.add(2); // Integer intg2 = it.next(); 로 쓸꺼면
		set2.add(5); // TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.add(1); // set2.add(new Integer(2)); 로 써줘야 한다
		set2.add(4);
		set2.add(3);
		
		System.out.println(set2);
		
//		Iterator it2 = set2.iterator();
//		while(it2.hasNext()) {
//			Integer intg2 = (Integer)it.next();
//			System.out.println(intg2);
//		}
		
		TreeSet<Student> set3 = new TreeSet<Student>(); // 값이 정렬되어진다
		
		Student s1 = new Student("kim",1,1,10,10,10);
		Student s2 = new Student("pim",3,1,10,10,10);
		Student s3 = new Student("aim",6,1,10,10,10);
		Student s4 = new Student("sim",9,1,10,10,10);
		Student s5 = new Student("fim",4,1,10,10,10);
		
		set3.add(s1);
		set3.add(s2);
		set3.add(s3);
		set3.add(s4);
		set3.add(s5);
		
		Iterator<Student> it3 = set.iterator();
		
		while(it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.toString());
		}
		
		
		
		
		
		
		
		
	}

}
