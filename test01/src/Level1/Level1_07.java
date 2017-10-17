package Level1;

class StringExercise{
	String getMiddle(String word){

		int count = word.length()/2;
		String result = "";
		
		if(word.length() % 2 == 0) {
			result = word.substring(count-1, count+1);
		}else {
			result = word.substring(count, count+1);
		}
		return result;    
	}
}

public class Level1_07 {
	public static void main(String[] args) {
		
		StringExercise se = new StringExercise();
		System.out.println(se.getMiddle("power"));
		
	}
}
