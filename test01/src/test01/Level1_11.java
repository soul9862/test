package test01;

public class Level1_11 {
    public int getStrToInt(String str) {

    	int n = 0;
    	n = Integer.parseInt(str);
    	
        return n;
    }
    
    public static void main(String args[]) {
        Level1_11 strToInt = new Level1_11();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
