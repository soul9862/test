package hello.ch05;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckVoter {

    private static Set<String> voted = new HashSet<>();

    public static void main(String[] args) {
        checkVoter("tom");
        checkVoter("mike");
        checkVoter("mike");
    }

    public static void checkVoter(String name){
        if(voted.contains(name)){
            System.out.println("쫓아내세요!");
        }else{
            voted.add(name);
            System.out.println("투표하게 하세요.");
        }
    }

}
