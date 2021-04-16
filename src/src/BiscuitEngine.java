
package src;

import java.util.Random;
import java.util.Stack;

public class BiscuitEngine {
    public static String getNameOfEngine() {
        return "AlphaGo";
    }
    
    private static int think(int onBoard, int lim){
        int rocks = onBoard%(lim+1);
        
        if (rocks==1) {
            return 1;
        } else return (rocks==0)?lim: rocks-1;
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
