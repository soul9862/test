package programmers.level1;

// ¦���� Ȧ��
class evenOrOdd{
	public String evenOrOdd(int num) {
		String result = "";
		
		if(num % 2 == 0) {
			result = "Even";
		}else {
			result = "Odd";
		}
		

		return result;
	}
}

public class Level1_05 {

	public static void main(String[] args) {
		String str = "1 2 3 4";
		evenOrOdd evenOrOdd = new evenOrOdd();
		
		int num = 3;
		
		System.out.println("��� : " + evenOrOdd.evenOrOdd(num));
		
	}
}
