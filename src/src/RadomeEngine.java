package src;

import java.util.Random;
import java.util.Stack;

public class RadomeEngine{
    
    public static String getNameOfEngine() {
        return "Donald Trump";
    }

    public static Stack<Integer> getRocks() {
        Stack<Integer> selectRocks = new Stack();
        
        Random random = new Random();
        Board board = new Board();
        
        int num = random.nextInt(Board.lim);
        if (num==0) num+=1;
        System.out.println("Computer will select " + num + " rocks");
        
        for (int i = 0; i < num; i++) {
            int j = 0;
            while (true) {
                int ranVal = random.nextInt(Board.beginBoard);
                if ((Board.traceBoard[ranVal] == 1) && (selectRocks.indexOf(ranVal)==-1)) {
                    j = ranVal; break;
                }
            }
            System.out.println("Computer selected " + j);
            selectRocks.add(j);
        }     
        return selectRocks;
    }
    
    
    
}
