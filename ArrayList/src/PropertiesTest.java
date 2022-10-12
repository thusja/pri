import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/// 2022.10.12

public class PropertiesTest {

	public static void main(String[] args) {
		// Properties : k ->String, v -> String
		Properties prop = new Properties();
		
		prop.setProperty("myid", "1234");
		prop.setProperty("asdf", "1111");
		prop.setProperty("asdf", "1234");
		
	//	String value = prop.getProperty("myid");
	//	System.out.println(value);
		
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			String value = prop.getProperty(element);
			System.out.println(value);
		}
		
		Properties prop2 = new Properties();
		
		try {
			prop.load(new FileInputStream("input.txt"));
		}
		catch(IOException e2) {
			System.out.println("지정한 파일이 없습니다");
			System.exit(0); // 프로그램 강제종료
		}
		
		String name = prop.getProperty("name"); // Hong Kil Dong
		String[] data = prop.getProperty("data").split(","); // split 다 쪼개버리기
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
		// 이름 max min sum 평균
		// 문자열 -> 숫자 : Integer.parseInt();
		// 숫자 -> 문자열 : String.va
		
		for(int i = 0; i<data.length; i++) {
			int value = Integer.parseInt(data[i]);
			
			if(i == 0) {
				max = min = value;
			}
			
			if(max < value) {
				max = value;
			}
			else if(min>value) {
				min = value;
			}
			
			sum += value;
			
		}
		
		double avg = (double)sum / data.length;
		
		System.out.println("이름은 : " + name);
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		System.out.println("Sum : " + sum);
		System.out.println("평균은 : " + avg);
		
		
		
		
		
		

	}

}
