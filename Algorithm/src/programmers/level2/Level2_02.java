package programmers.level2;

public class Level2_02 {
    public int getMinSum(int []A, int []B)
    {
        int answer = 0;

        int temp;
        
        for(int i = 0; i < B.length/2; i++) {
        	temp = B[i];
        	B[i] = B[B.length-1-i];
        	B[B.length-1-i] = temp;
        }
        
        for(int i = 0; i < A.length; i++) {
        	answer += A[i] * B[i];
        }
        
        return answer;
    }
    public static void main(String[] args)
    {
        Level2_02 test = new Level2_02();
        int []A = {1,2};
        int []B = {3,4};
        System.out.println(test.getMinSum(A,B));
    }
}
