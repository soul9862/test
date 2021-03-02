package Algorithm.src.programmers.level1;
// ���ڼ��ڼ��ڼ��ڼ��ڼ�?
public class Level1_28 {
	public String solution(int n) {
	      String answer = "";
	      int count = 0;
	      
	      while(count < n) {
	    	  if(count % 2 == 0) {
	    		  answer += "��";
	    	  }else {
	    		  answer += "��";
	    	  }
	    	  count++;
	      }
	      /* if�� ��� 3�׿��� ���
	       * result += i % 2 == 0 ? "��" : "��";
	       */
	      return answer;
	  }

	public static void main(String[] args) {
		Level1_28 test = new Level1_28();
		int n = 3;
		System.out.println(test.solution(n));
	}
}
