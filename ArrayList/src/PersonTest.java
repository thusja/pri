import java.util.HashSet;
import java.util.Set;
/// 2022.10.11

public class PersonTest {

	public static void main(String[] args) {
		
		Set<Person> set = new HashSet();
		
		set.add(new Person("Hongkil",10));
		set.add(new Person("Hongkil",10));
		
		System.out.println(set);

	}

}
