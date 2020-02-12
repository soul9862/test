package Level1;

import java.util.Arrays;

// 완주하지 못한 선수
public class Level1_42 {
	
//	["leo", "kiki", "eden"]	["eden", "kiki"]	leo
//	[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
//	[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        int index;
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(index = 0; index < completion.length; index++) {
        	if(!participant[index].equals(completion[index])) {
        		return participant[index];
        	}
        }
        
        
        //런타임 오류(list 사용)
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        
//        ArrayList<String> parList = new ArrayList<>(Arrays.asList(participant));
//        ArrayList<String> comList = new ArrayList<>(Arrays.asList(completion));
//        
//        for(int i = 0; i < comList.size(); i++) {
//        	for(int j = 0; j < parList.size(); j++) {
//        		if(comList.get(i).equals(parList.get(j))) {
//        			parList.remove(j);
//        		}
//        	}
//        }
//        answer = parList.get(0);
        // return answer;
//        
        // hashmap 다른 사람 풀이
//        String answer = "";
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
        
        return participant[index];
    }
	public static void main(String[] args) {
		
	}
}
