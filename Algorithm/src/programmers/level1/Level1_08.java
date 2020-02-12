package programmers.level1;

public class Level1_08 {
	public String printTriangle(int num){
		String result = "";
		String star = "*";
		
		for(int i = 0; i < num; i++) {
			result += star + "\n";
			star += "*";
		}
	
		return result;		
	}
	
	public static void main(String[] args) {

		Level1_08 pt = new Level1_08();
		System.out.println( pt.printTriangle(3) );
		
	}
}

