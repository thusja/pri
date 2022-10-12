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
			System.out.println("������ ������ �����ϴ�");
			System.exit(0); // ���α׷� ��������
		}
		
		String name = prop.getProperty("name"); // Hong Kil Dong
		String[] data = prop.getProperty("data").split(","); // split �� �ɰ�������
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
		// �̸� max min sum ���
		// ���ڿ� -> ���� : Integer.parseInt();
		// ���� -> ���ڿ� : String.va
		
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
		
		System.out.println("�̸��� : " + name);
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		System.out.println("Sum : " + sum);
		System.out.println("����� : " + avg);
		
		
		
		
		
		

	}

}
