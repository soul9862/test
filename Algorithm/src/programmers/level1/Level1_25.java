package programmers.level1;

// �̻��� ���� �����
public class Level1_25 {
	public String solution(String s) {
	      String answer = "";
	      String [] arr = {};
	      String [] temp = {};
	      
	      arr = new String[s.split(" ").length];
	      arr = s.split(" ", -1);
	      for(int i = 0; i < arr.length; i++) {
	    	  temp = new String[arr[i].split("").length];
	    	  temp = arr[i].split("", -1);
	    	  for(int j = 0; j < temp.length; j++) {
	    		  if(j % 2 == 0) {
	    			  answer += temp[j].toUpperCase();
	    		  }else {
	    			  answer += temp[j].toLowerCase();
	    		  }
	    	  }
	    	  if(i < arr.length-1) {
	    		  answer += " ";
	    	  }
	      }
	      
	      return answer;
	  }
	public static void main(String[] args) {
		Level1_25 test = new Level1_25();
		String s = "AAAAAAAAAAA A A A A AAAAA AAA";
		
		System.out.println(test.solution(s));
	}
}
