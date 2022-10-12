import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/// 2022.10.12

public class WordQuiz {

	private String name;
	private ArrayList<Word> w;
	
	
	public WordQuiz(String name) {
		super();
		this.name = name;
		
		w = new ArrayList<Word>();
		w.add(new Word("love","���"));
		w.add(new Word("animal","����"));
		w.add(new Word("emotion","����"));
		w.add(new Word("human","�ΰ�"));
		w.add(new Word("stock","�ֽ�"));
		w.add(new Word("trade","�ŷ�"));
		w.add(new Word("society","��ȸ"));
		w.add(new Word("baby","�Ʊ�"));
		w.add(new Word("honey","��"));
		w.add(new Word("dall","����"));
		w.add(new Word("bear","��"));
		w.add(new Word("picture","����"));
		w.add(new Word("painting","�׸�"));
		w.add(new Word("fault","����"));
		w.add(new Word("example","����"));
		w.add(new Word("eye","��"));
		w.add(new Word("statue","������"));
	}
	
	private int makeExample(int ex[], int answerIndex) { // ���� �����ϱ�
		int n[] = {-1,-1,-1,-1}; // ���⸦ ����㰡 ���� index��ȣ�� Ȱ��
		int index;
		for(int i = 0; i<n.length; i++) {
			do {
				index = (int)(Math.random() * w.size()); // 0 ~ 16
			}
			while(index == answerIndex || exists(n,index)); // ����� ���� index ��ȣ�̰ų� n�迭�� �̹� ����ִ� ���̸� ���Ұ� ����
			
			n[i] = index;
		}
		
		for(int i = 0; i<n.length; i++) {
			ex[i] = n[i];
		}
		return (int)(Math.random() * n.length); // 0 ~ 3 ex�迭�� ������ �� ��ġ��
	}
	
	private boolean exists(int n[], int index) { // ���Ⱑ �ߺ����� �ʵ��� �ϱ�
		
		for(int i = 0; i<n.length; i++) {
			if(n[i] == index) {
				return true;
			}
		}
		return false;
	}
	
	public void run() { // ���� �����ϱ�
		
		System.out.println("[" + name + "]" + "�� �ܾ� �׽�Ʈ ���� ���� | -1�� �Է��ϸ� ���� ����");
		System.out.println("���� " + w.size() + " ���� �ܾ �ֽ��ϴ�");
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int answerIndex = (int)(Math.random() * w.size()); // 0 ~ 16
			String eng = w.get(answerIndex).getEnglish();
			
			int example[] = new int[4];
			
			int answerLoc = makeExample(example, answerIndex);
			
			System.out.println(eng + "?");
			
			for(int i = 0; i<example.length; i++) {
				System.out.print("(" + (i+1) + ") " + w.get(example[i]).getKorean());
			}
			
			System.out.print(" :> ");
			
			try {
				int in = sc.nextInt();
				if(in == -1) {
					break;
				}
				in--;
				if(in == answerLoc) {
					System.out.println("�����Դϴ�");
				}
				else {
					System.out.println("�����Դϴ�");
				}
				
			}
			
			catch(InputMismatchException e) {
				sc.next(); // ���۸� ����ִ� ����
				System.out.println("���ڸ� �Է��ϼ���");
			}
			
		}
		
		System.out.println("[" + name + "]" + "�� �����մϴ�");
		
	}
	
}
