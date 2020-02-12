package programmers.level2;

public class Level2_06 {
	public String getDayName(int a, int b)
	{
		String answer = "";
		
		int index = 0;
		
		String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i = 0; i < a-1; i++) {
			index += month[i];
		}
		
		index = (index + b - 1) % 7;
		
		answer = week[index];

		return answer;
	}
	public static void main(String[] args)
	{
		Level2_06 test = new Level2_06();
		int a=5, b=24;
		System.out.println(test.getDayName(a,b));
	}
}
