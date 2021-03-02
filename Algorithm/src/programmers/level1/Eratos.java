package Algorithm.src.programmers.level1;
import java.util.ArrayList;
import java.util.Scanner;

// �����佺�׳׽��� ü (�Ҽ� ã��)
public class Eratos {
	public static void main(String[] args) {
		// ArrayList�� ����
		ArrayList<Boolean> primeList;

		// ����ڷκ����� �ܼ� �Է�
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// n <= 1 �� �� ����
		if(n <= 1) return;

		// n+1��ŭ �Ҵ�
		primeList = new ArrayList<Boolean>(n+1);
		// 0��°�� 1��°�� �Ҽ� �ƴ����� ó��
		primeList.add(false);
		primeList.add(false);
		// 2~ n ���� �Ҽ��� ����
		for(int i=2; i<=n; i++ )
			primeList.add(i, true);

		// 2 ����  ~ i*i <= n
		// ������ ������� ��������.
		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)){
				for(int j = i*2; j<=n; j+=i) primeList.set(j, false);
				//j�� ���۰��� i*i�� �ϼ̴µ� i*2�� �´°� ���ƿ�
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for(int i=0; i<=n; i++){
			if(primeList.get(i) == true){
				sb.append(i);
				sb.append(",");
			}
		}
		sb.setCharAt(sb.length()-1, '}');

		System.out.println(sb.toString());
	}
}
