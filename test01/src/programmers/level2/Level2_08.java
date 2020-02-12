package Level2;

// 영어 끝말잇기
public class Level2_08 {

//	3
//	["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]
//	[3,3]
	
//	5
//	["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]
//	[0,0]
	
//	2
//	["hello", "one", "even", "never","now", "world", "draw"]
//	[1,3]
	
//	3
//	["tank", "kick", "know", "wheel", "land", "dream", "mother", "bot", "tank"]
//	[2,3]
	
//	2
//	["land", "dream", "mom", "mom"]
//	[2,2]
	
//	2
//	[land, dream, mom, mom, ror]
//	[2,2]
//
	
	public int[] solution(int n, String[] words) {
        int[] answer = {};
        answer = new int[2];
        int index = 0;
        
        for(int i = 1; i < words.length; i++) {
        	if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
        		index = i;
        		break;
        	}else {
        		for(int j = 0; j < i; j++) {
            		if(words[i].equals(words[j])) {
            			index = i;
            			i = words.length-1;
            			break;
            		}
            	}
        	}
        }
        System.out.println("해당 인덱스 : " + index);
        
        if(index != 0) {
            answer[0] = (index % n) + 1; 
            answer[1] = (index / n) + 1; 
        }

        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
