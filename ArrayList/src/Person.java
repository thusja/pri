import lombok.AllArgsConstructor;
import lombok.ToString;

/// 2022.10.11

@AllArgsConstructor
@ToString
// @EqualsAndHashcode �ѹ��̸� �ؿ��� �ϴ� ������ �ȴ�
public class Person {
	String name;
	int age;
	
	
	@Override
	public int hashCode() {
		return (this.name + this.age).hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		Person another = (Person)obj;
		return this.name.equals(another.name) && this.age == another.age;
	}
	
	
	
}