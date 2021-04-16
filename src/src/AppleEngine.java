
package src;

import java.util.Random;
import java.util.Stack;

public class AppleEngine {
    
    public static String getNameOfEngine() {
        return "Fereal";
    }
    
    private static int think(int onBoard, int lim){
        int rocks = (onBoard-1)%(lim+1);
        
        if (rocks==0) {
            return new Random().nextInt(Board.lim);
        } else return rocks;
    }

    public static Stack<Integer> getRocks() {
        Stack<Integer> selectRocks = new Stack();
        Random random = new Random();
        
        int num = think(Board.onBoard, Board.lim);
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
