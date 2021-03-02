package Algorithm.src.programmers.level1;
import java.util.Arrays;

public class Level1_10 {

	public int[] divisible(int[] array, int divisor) {
		//ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
		int n = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % divisor == 0) {
				n++;
			}
		}
		
		int[] ret = new int[n];
		n = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % divisor == 0) {
				ret[n] = array[i];
				n++;
			}
		}
		return ret;
	}
	
	//�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Level1_10 div = new Level1_10();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}
