import lombok.AllArgsConstructor;
import lombok.ToString;

/// 2022.10.11

@AllArgsConstructor
@ToString

public class Student implements Comparable {
	
	String name;
	int ban;
	int no;
	int kor,eng,math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAvg() {
		return getTotal() / 3.0f;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return this.ban - tmp.ban; // 오름차순
                                       // 0 : 같은값, 양수 : 앞에값이 큰값, 음수 : 뒤에값이 큰값
		//	return tmp.ban - this.ban // 내림차순
		}
		
		return -1;
	}


}

