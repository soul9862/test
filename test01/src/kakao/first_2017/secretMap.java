package kakao.first_2017;

public class secretMap {
	public String[] solution(int n, int[] arr1, int[] arr2) {
	      String[] answer = {};
	      answer = new String[n];
	      
	      // int n : 한변의 길이, 1 <= n <= 16
	      // int[] arr1 : 지도1
	      // int[] arr2 : 지도2
	      for(int i = 0; i < n; i++) {
	    	  answer[i] = "";
	    	  String[] temp = new String[n];
	    	  for(int j = 0; j < n; j++) {
	    		  temp[j] = "";
	    		  if(arr1[i] % 2 == 1 || arr2[i] % 2 == 1) {
	    			  temp[j] = "#";
	    		  }else {
	    			  temp[j] = " ";
	    		  }
	    		  arr1[i] /= 2;
	    		  arr2[i] /= 2;
	    	  }
	    	  for(int j = n-1; j >= 0; j--) {
	    		  answer[i] += temp[j];
	    	  }
	      }
	      
	      return answer;
	  }
}
