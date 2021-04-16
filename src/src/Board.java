
package src;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Board extends javax.swing.JFrame {

    public JToggleButton rock[];
    
    public static final int MAX_ROCK = 90;
    public static int[] traceBoard = new int[MAX_ROCK];
    public static int mode,no,lim,first,onBoard,beginBoard;
    
    public static String plr1 = "Người Chơi 1";
    public static String plr2 = "Người Chơi 2";
    public static final String computer= "Máy Tính";
    
    public Board() {
        
        initComponents();
        this.rock = new JToggleButton[]
        {rock1, rock2, rock3, rock4, rock5, rock6, rock7, rock8, rock9, rock10, rock11, rock12, rock13, rock14, rock15,
        rock16, rock17, rock18, rock19, rock20, rock21, rock22, rock23, rock24, rock25, rock26, rock27, rock28, rock29, rock30,
        rock31, rock32, rock33, rock34, rock35, rock36, rock37, rock38, rock39, rock40, rock41, rock42, rock43, rock44, rock45,
        rock46, rock47, rock48, rock49, rock50, rock51, rock52, rock53, rock54, rock55, rock56, rock57, rock58, rock59, rock60,
        rock61, rock62, rock63, rock64, rock65, rock66, rock67, rock68, rock69, rock70, rock71, rock72, rock73, rock74, rock75,
        rock76, rock77, rock78, rock79, rock80, rock81, rock82, rock83, rock84, rock85, rock86, rock87, rock88, rock89, rock90};
    }
    
    public int getNumberOfRocksOnBoard() {
        int y=0;
        for (int i= 0; i<MAX_ROCK;i++){
            if (rock[i].isVisible()) {
                y=y+1;
            }
        }
        onBoard=y;
        return y;
    }
    
    public void selectRock(int index) {
        rock[index].setSelected(true);
        traceBoard[index] = 2;
    }
    
    public void print(String context) {
        record.setText(record.getText() + context);
    }
    public void println(String context) {
        print(context + "\n");
    }

    public void getRock() {
        
        System.out.println(this.whoNow.getText() + " turned");
        
        int selectedRock = 0;                       //rocks collection
        for (int i=0; i < MAX_ROCK; i++) {
            if (rock[i].isSelected()) {
                traceBoard[i] = 0;
                selectedRock = selectedRock + 1;
            }
        }
        System.out.println("Collected " + selectedRock);
        
        if (selectedRock < 1) {
            JOptionPane.showMessageDialog(null, "Không thể bỏ lượt !!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (selectedRock <= lim) {  //changing information
            println(step.getText() + ". " + whoNow.getText() + " " + selectedRock);
            left.setText(Integer.toString(new Integer(left.getText()) - selectedRock));
            step.setText(Integer.toString(new Integer(step.getText()) + 1)); 
            
            if (whoNow.getText().equals(plr1)) {
                got1.setText(Integer.toString(new Integer(got1.getText()) + selectedRock));
                whoNow.setText(plr2);
            } else if (whoNow.getText().equals(plr2)) {
                got2.setText(Integer.toString(new Integer(got2.getText()) + selectedRock));
                whoNow.setText(plr1);
            }

            for (int i = 0; i < MAX_ROCK; i++) {
                if (traceBoard[i] == 0) {
                    rock[i].setVisible(false);
                    rock[i].setSelected(false);
                }
            }
            if (getNumberOfRocksOnBoard() <= 1) {
                if (whoNow.getText().equals(plr1)) {
                    JOptionPane.showMessageDialog(null, plr2 + " đã thắng !!!", "Game over", JOptionPane.INFORMATION_MESSAGE);
                    println("KẾT THÚC\n"+plr2+" THẮNG");
                    
                }
                if (whoNow.getText().equals(plr2)) {
                    JOptionPane.showMessageDialog(null, plr1 + " đã thắng !!!", "Game over", JOptionPane.INFORMATION_MESSAGE);
                    println("KẾT THÚC\n"+plr1+" THẮNG");
                }
                onBoard = this.getNumberOfRocksOnBoard();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vượt quá số sỏi cho phép", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
}

    public void machinePlay(){  //flow guiding for engines
        switch (mode) {
            case 1: {
                Stack<Integer> temp = RadomeEngine.getRocks();
                while (!temp.isEmpty()) {
                    int popped = temp.pop();
                    this.selectRock(popped);
                }
                getRock();
            } break;
            case 2: {
                Stack<Integer> temp = AppleEngine.getRocks();
                while (!temp.isEmpty()) {
                    int popped = temp.pop();
                    System.out.println(popped); //$tc
                    this.selectRock(popped);
                }
                getRock();
            } break;
            case 3: {
                Stack<Integer> temp = BiscuitEngine.getRocks();
                while (!temp.isEmpty()) {
                    int popped = temp.pop();
                    System.out.println(popped); //$tc
                    this.selectRock(popped);
                }
                getRock();
            } break;
        }
    }
 
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnExit = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        modeText = new javax.swing.JLabel();
        rock1 = new javax.swing.JToggleButton();
        rock2 = new javax.swing.JToggleButton();
        rock3 = new javax.swing.JToggleButton();
        rock4 = new javax.swing.JToggleButton();
        rock5 = new javax.swing.JToggleButton();
        rock6 = new javax.swing.JToggleButton();
        rock7 = new javax.swing.JToggleButton();
        rock8 = new javax.swing.JToggleButton();
        rock9 = new javax.swing.JToggleButton();
        rock10 = new javax.swing.JToggleButton();
        rock11 = new javax.swing.JToggleButton();
        rock12 = new javax.swing.JToggleButton();
        rock13 = new javax.swing.JToggleButton();
        rock14 = new javax.swing.JToggleButton();
        rock15 = new javax.swing.JToggleButton();
        rock16 = new javax.swing.JToggleButton();
        rock17 = new javax.swing.JToggleButton();
        rock18 = new javax.swing.JToggleButton();
        rock19 = new javax.swing.JToggleButton();
        rock20 = new javax.swing.JToggleButton();
        rock21 = new javax.swing.JToggleButton();
        rock22 = new javax.swing.JToggleButton();
        rock23 = new javax.swing.JToggleButton();
        rock24 = new javax.swing.JToggleButton();
        rock25 = new javax.swing.JToggleButton();
        rock26 = new javax.swing.JToggleButton();
        rock27 = new javax.swing.JToggleButton();
        rock28 = new javax.swing.JToggleButton();
        rock29 = new javax.swing.JToggleButton();
        rock30 = new javax.swing.JToggleButton();
        rock31 = new javax.swing.JToggleButton();
        rock32 = new javax.swing.JToggleButton();
        rock33 = new javax.swing.JToggleButton();
        rock34 = new javax.swing.JToggleButton();
        rock35 = new javax.swing.JToggleButton();
        rock36 = new javax.swing.JToggleButton();
        rock37 = new javax.swing.JToggleButton();
        rock38 = new javax.swing.JToggleButton();
        rock39 = new javax.swing.JToggleButton();
        rock40 = new javax.swing.JToggleButton();
        rock41 = new javax.swing.JToggleButton();
        rock42 = new javax.swing.JToggleButton();
        rock43 = new javax.swing.JToggleButton();
        rock44 = new javax.swing.JToggleButton();
        rock45 = new javax.swing.JToggleButton();
        rock46 = new javax.swing.JToggleButton();
        rock47 = new javax.swing.JToggleButton();
        rock48 = new javax.swing.JToggleButton();
        rock49 = new javax.swing.JToggleButton();
        rock50 = new javax.swing.JToggleButton();
        rock51 = new javax.swing.JToggleButton();
        rock52 = new javax.swing.JToggleButton();
        rock53 = new javax.swing.JToggleButton();
        rock54 = new javax.swing.JToggleButton();
        rock55 = new javax.swing.JToggleButton();
        rock56 = new javax.swing.JToggleButton();
        rock57 = new javax.swing.JToggleButton();
        rock58 = new javax.swing.JToggleButton();
        rock59 = new javax.swing.JToggleButton();
        rock60 = new javax.swing.JToggleButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        left = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        whoNow = new javax.swing.JLabel();
        over = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        step = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        max = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        got1 = new javax.swing.JTextField();
        got2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        record = new javax.swing.JTextArea();
        rock61 = new javax.swing.JToggleButton();
        rock62 = new javax.swing.JToggleButton();
        rock63 = new javax.swing.JToggleButton();
        rock64 = new javax.swing.JToggleButton();
        rock65 = new javax.swing.JToggleButton();
        rock66 = new javax.swing.JToggleButton();
        rock67 = new javax.swing.JToggleButton();
        rock68 = new javax.swing.JToggleButton();
        rock69 = new javax.swing.JToggleButton();
        rock70 = new javax.swing.JToggleButton();
        rock71 = new javax.swing.JToggleButton();
        rock72 = new javax.swing.JToggleButton();
        rock73 = new javax.swing.JToggleButton();
        rock74 = new javax.swing.JToggleButton();
        rock75 = new javax.swing.JToggleButton();
        rock76 = new javax.swing.JToggleButton();
        rock77 = new javax.swing.JToggleButton();
        rock78 = new javax.swing.JToggleButton();
        rock79 = new javax.swing.JToggleButton();
        rock80 = new javax.swing.JToggleButton();
        rock81 = new javax.swing.JToggleButton();
        rock82 = new javax.swing.JToggleButton();
        rock83 = new javax.swing.JToggleButton();
        rock84 = new javax.swing.JToggleButton();
        rock85 = new javax.swing.JToggleButton();
        rock86 = new javax.swing.JToggleButton();
        rock87 = new javax.swing.JToggleButton();
        rock88 = new javax.swing.JToggleButton();
        rock89 = new javax.swing.JToggleButton();
        rock90 = new javax.swing.JToggleButton();

        jLabel5.setText("jLabel5");

        jScrollPane1.setViewportView(jEditorPane1);

        jButton1.setText("jButton1");

        jTextField4.setEditable(false);
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BocSoi v1.0.0.69");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Trò Chơi Bóc Sỏi");

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnNew.setText("Ván Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnHelp.setText("Về Phần Mềm");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        modeText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modeText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        modeText.setText(" ");

        rock1.setPreferredSize(new java.awt.Dimension(35, 35));

        rock2.setPreferredSize(new java.awt.Dimension(35, 35));

        rock3.setPreferredSize(new java.awt.Dimension(35, 35));

        rock4.setPreferredSize(new java.awt.Dimension(35, 35));

        rock5.setPreferredSize(new java.awt.Dimension(35, 35));

        rock6.setPreferredSize(new java.awt.Dimension(35, 35));

        rock7.setPreferredSize(new java.awt.Dimension(35, 35));

        rock8.setPreferredSize(new java.awt.Dimension(35, 35));

        rock9.setPreferredSize(new java.awt.Dimension(35, 35));

        rock10.setPreferredSize(new java.awt.Dimension(35, 35));

        rock11.setPreferredSize(new java.awt.Dimension(35, 35));

        rock12.setPreferredSize(new java.awt.Dimension(35, 35));

        rock13.setPreferredSize(new java.awt.Dimension(35, 35));

        rock14.setPreferredSize(new java.awt.Dimension(35, 35));

        rock15.setPreferredSize(new java.awt.Dimension(35, 35));

        rock16.setPreferredSize(new java.awt.Dimension(35, 35));

        rock17.setPreferredSize(new java.awt.Dimension(35, 35));

        rock18.setPreferredSize(new java.awt.Dimension(35, 35));

        rock19.setPreferredSize(new java.awt.Dimension(35, 35));

        rock20.setPreferredSize(new java.awt.Dimension(35, 35));

        rock21.setPreferredSize(new java.awt.Dimension(35, 35));

        rock22.setPreferredSize(new java.awt.Dimension(35, 35));

        rock23.setPreferredSize(new java.awt.Dimension(35, 35));

        rock24.setPreferredSize(new java.awt.Dimension(35, 35));

        rock25.setPreferredSize(new java.awt.Dimension(35, 35));

        rock26.setPreferredSize(new java.awt.Dimension(35, 35));

        rock27.setPreferredSize(new java.awt.Dimension(35, 35));

        rock28.setPreferredSize(new java.awt.Dimension(35, 35));

        rock29.setPreferredSize(new java.awt.Dimension(35, 35));

        rock30.setPreferredSize(new java.awt.Dimension(35, 35));

        rock31.setPreferredSize(new java.awt.Dimension(35, 35));

        rock32.setPreferredSize(new java.awt.Dimension(35, 35));

        rock33.setPreferredSize(new java.awt.Dimension(35, 35));

        rock34.setPreferredSize(new java.awt.Dimension(35, 35));

        rock35.setPreferredSize(new java.awt.Dimension(35, 35));

        rock36.setPreferredSize(new java.awt.Dimension(35, 35));

        rock37.setPreferredSize(new java.awt.Dimension(35, 35));

        rock38.setPreferredSize(new java.awt.Dimension(35, 35));

        rock39.setPreferredSize(new java.awt.Dimension(35, 35));

        rock40.setPreferredSize(new java.awt.Dimension(35, 35));

        rock41.setPreferredSize(new java.awt.Dimension(35, 35));

        rock42.setPreferredSize(new java.awt.Dimension(35, 35));

        rock43.setPreferredSize(new java.awt.Dimension(35, 35));

        rock44.setPreferredSize(new java.awt.Dimension(35, 35));

        rock45.setPreferredSize(new java.awt.Dimension(35, 35));

        rock46.setPreferredSize(new java.awt.Dimension(35, 35));

        rock47.setPreferredSize(new java.awt.Dimension(35, 35));

        rock48.setPreferredSize(new java.awt.Dimension(35, 35));

        rock49.setPreferredSize(new java.awt.Dimension(35, 35));

        rock50.setPreferredSize(new java.awt.Dimension(35, 35));

        rock51.setPreferredSize(new java.awt.Dimension(35, 35));

        rock52.setPreferredSize(new java.awt.Dimension(35, 35));

        rock53.setPreferredSize(new java.awt.Dimension(35, 35));

        rock54.setPreferredSize(new java.awt.Dimension(35, 35));

        rock55.setPreferredSize(new java.awt.Dimension(35, 35));

        rock56.setPreferredSize(new java.awt.Dimension(35, 35));

        rock57.setPreferredSize(new java.awt.Dimension(35, 35));

        rock58.setPreferredSize(new java.awt.Dimension(35, 35));

        rock59.setPreferredSize(new java.awt.Dimension(35, 35));

        rock60.setPreferredSize(new java.awt.Dimension(35, 35));

        jLabel2.setText("Số Viên Sỏi Còn Lại:");

        left.setEditable(false);
        left.setText(" ");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        whoNow.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        whoNow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whoNow.setText("Hãy Bắt đầu");
        whoNow.setToolTipText("");

        over.setText("Kết Thúc Lượt");
        over.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overActionPerformed(evt);
            }
        });

        jLabel1.setText("Lượt bóc:");

        step.setEditable(false);

        jLabel3.setText("Bốc tối đa");

        max.setEditable(false);

        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("Người 1");

        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2.setText("Người 2");

        got1.setEditable(false);
        got1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        got1.setText(" ");

        got2.setEditable(false);
        got2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        got2.setText(" ");

        record.setEditable(false);
        record.setColumns(20);
        record.setRows(5);
        jScrollPane2.setViewportView(record);

        rock61.setPreferredSize(new java.awt.Dimension(35, 35));

        rock62.setPreferredSize(new java.awt.Dimension(35, 35));

        rock63.setPreferredSize(new java.awt.Dimension(35, 35));

        rock64.setPreferredSize(new java.awt.Dimension(35, 35));

        rock65.setPreferredSize(new java.awt.Dimension(35, 35));

        rock66.setPreferredSize(new java.awt.Dimension(35, 35));

        rock67.setPreferredSize(new java.awt.Dimension(35, 35));

        rock68.setPreferredSize(new java.awt.Dimension(35, 35));

        rock69.setPreferredSize(new java.awt.Dimension(35, 35));

        rock70.setPreferredSize(new java.awt.Dimension(35, 35));

        rock71.setPreferredSize(new java.awt.Dimension(35, 35));

        rock72.setPreferredSize(new java.awt.Dimension(35, 35));

        rock73.setPreferredSize(new java.awt.Dimension(35, 35));

        rock74.setPreferredSize(new java.awt.Dimension(35, 35));

        rock75.setPreferredSize(new java.awt.Dimension(35, 35));

        rock76.setPreferredSize(new java.awt.Dimension(35, 35));

        rock77.setPreferredSize(new java.awt.Dimension(35, 35));

        rock78.setPreferredSize(new java.awt.Dimension(35, 35));

        rock79.setPreferredSize(new java.awt.Dimension(35, 35));

        rock80.setPreferredSize(new java.awt.Dimension(35, 35));

        rock81.setPreferredSize(new java.awt.Dimension(35, 35));

        rock82.setPreferredSize(new java.awt.Dimension(35, 35));

        rock83.setPreferredSize(new java.awt.Dimension(35, 35));

        rock84.setPreferredSize(new java.awt.Dimension(35, 35));

        rock85.setPreferredSize(new java.awt.Dimension(35, 35));

        rock86.setPreferredSize(new java.awt.Dimension(35, 35));

        rock87.setPreferredSize(new java.awt.Dimension(35, 35));

        rock88.setPreferredSize(new java.awt.Dimension(35, 35));

        rock89.setPreferredSize(new java.awt.Dimension(35, 35));

        rock90.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modeText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(step, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(over, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rock46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock49, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock53, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock54, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock55, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock58, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rock1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rock16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rock31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rock61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock62, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock63, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock66, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock69, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock71, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock72, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock73, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock74, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock75, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rock86, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock87, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock88, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock89, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock90, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock76, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock77, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock78, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock79, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock82, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock84, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rock85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator5))
                    .addComponent(whoNow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(got1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(got2)
                                    .addComponent(name2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modeText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rock16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rock31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rock46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rock61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rock86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rock85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(over, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(step, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnHelp)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(whoNow, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name1)
                            .addComponent(name2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(got1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(got2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnExit, btnHelp, btnNew});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int status = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thoát không ?", "Cảnh Báo",JOptionPane.WARNING_MESSAGE);
        if (status == 0 ){
            System.exit(0);
        } 
    }//GEN-LAST:event_btnExitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        over.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened
        
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        record.setText("");
        
        for (int i=0; i<MAX_ROCK; i++) {
            rock[i].setVisible(true);
            rock[i].setEnabled(true);
            rock[i].setSelected(false);
            traceBoard[i] = 1;
        }
        beginBoard = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhập số sỏi ( 1 < n < 91 ) : ", "Nhập dữ liệu", JOptionPane.QUESTION_MESSAGE));
        lim   = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhập số bóc tối đa : " ,"Nhập dữ liệu", JOptionPane.QUESTION_MESSAGE));
        mode = Integer.parseInt(JOptionPane.showInputDialog(null, "Mức độ khó: \n"
                + "0 - Chơi 2 Người\n"
                + "1 - Chế độ dễ (Máy Radome)"
                + "2 - Chế độ trung bình (Máy Apple)"
                + "3 - Chế độ khó (Máy Biscuit)" ,"Nhập dữ liệu", JOptionPane.QUESTION_MESSAGE));

        onBoard = beginBoard;
        
        System.out.println("Ván mới lúc " + Calendar.DATE);
        System.out.println("Trước - " + first); //1 is computer,0 is player1
        
        no=1;
        
        for (int i=onBoard; i<MAX_ROCK; i++) {
            rock[i].setVisible(false);
            traceBoard[i] = 0;
        }

        over.setEnabled(true);
        left.setText(Integer.toString(onBoard));
        step.setText(Integer.toString(no));
        got1.setText(Integer.toString(0));
        got2.setText(Integer.toString(0));
        String n1 = JOptionPane.showInputDialog(null, "Tên Người chơi : ", "Nhập dữ liệu", JOptionPane.QUESTION_MESSAGE);
        if (!n1.equals("")) {
            plr1 = n1;
        }

        switch (mode) {
            case 0: {
                String n2 = JOptionPane.showInputDialog(null, "Tên Đối Thủ : ", "Nhập dữ liệu", JOptionPane.QUESTION_MESSAGE);
                if (!n2.equals("")) {
                    plr2 = n2;
                }
            }
            case 1:
                plr2 = RadomeEngine.getNameOfEngine();
                break;
            case 2:
                plr2 = AppleEngine.getNameOfEngine();
                break;
            case 3:
                plr2 = BiscuitEngine.getNameOfEngine();
                break;
        }
        
        name1.setText(plr1); name2.setText(plr2);
        first= JOptionPane.showConfirmDialog(null, "Bạn (Người 1) có muốn đi trước ? " ,"Nhập dữ liệu", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        println("THIẾT LẬP VÁN \nA: " + plr1 + "\nB: " + plr2);
        println("SỐ SỎI: " + onBoard + " CHO PHÉP: "+ lim);
        
        
        if (first==0) { 
            whoNow.setText(plr1); 
            println(plr1 + " ĐI TRƯỚC");
        } else { 
            whoNow.setText(plr2);
            println(plr2 + " ĐI TRƯỚC");
            machinePlay();
        }
        max.setText(Integer.toString(lim));
        over.setEnabled(true);
        
    }//GEN-LAST:event_btnNewActionPerformed

    private void overActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overActionPerformed
        getRock(); if (mode != 0 && onBoard > 1) {machinePlay();} 
    }//GEN-LAST:event_overActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        String version = "1.0.0.69 beta";
        String pubdate = "30/11/2016";
        String authors = "";
        
        JOptionPane.showMessageDialog(null, " Phần Mềm Bóc Sỏi \n Phiên Bản "+ version+ "  \n Ngày Phát Hành: " + pubdate + " \n "
                + "\n Sản phẩm được phát triển bởi: \n"
                + "Phạm Quốc Hùng \n"
                + "Đặng Lê Hoàng Tuấn\n"
                + "\n Dưới sự hướng dẫn của giáo viên:\n"
                + ""
                + "\n" + authors
                , "Thông Tin Phần Mềm", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension box    = this.getSize();
        this.setLocation(screen.width/2 - box.width/2, screen.height/2-box.height/2); //appear in the middle of the screen
        
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) { 
                    UIManager.setLookAndFeel(info.getClassName());  //Set default look and feel
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        EventQueue.invokeLater(() -> {
            new Board().setVisible(true);  //initialization
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnNew;
    private javax.swing.JTextField got1;
    private javax.swing.JTextField got2;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField left;
    private javax.swing.JTextField max;
    public javax.swing.JLabel modeText;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JButton over;
    private javax.swing.JTextArea record;
    private javax.swing.JToggleButton rock1;
    private javax.swing.JToggleButton rock10;
    private javax.swing.JToggleButton rock11;
    private javax.swing.JToggleButton rock12;
    private javax.swing.JToggleButton rock13;
    private javax.swing.JToggleButton rock14;
    private javax.swing.JToggleButton rock15;
    private javax.swing.JToggleButton rock16;
    private javax.swing.JToggleButton rock17;
    private javax.swing.JToggleButton rock18;
    private javax.swing.JToggleButton rock19;
    private javax.swing.JToggleButton rock2;
    private javax.swing.JToggleButton rock20;
    private javax.swing.JToggleButton rock21;
    private javax.swing.JToggleButton rock22;
    private javax.swing.JToggleButton rock23;
    private javax.swing.JToggleButton rock24;
    private javax.swing.JToggleButton rock25;
    private javax.swing.JToggleButton rock26;
    private javax.swing.JToggleButton rock27;
    private javax.swing.JToggleButton rock28;
    private javax.swing.JToggleButton rock29;
    private javax.swing.JToggleButton rock3;
    private javax.swing.JToggleButton rock30;
    private javax.swing.JToggleButton rock31;
    private javax.swing.JToggleButton rock32;
    private javax.swing.JToggleButton rock33;
    private javax.swing.JToggleButton rock34;
    private javax.swing.JToggleButton rock35;
    private javax.swing.JToggleButton rock36;
    private javax.swing.JToggleButton rock37;
    private javax.swing.JToggleButton rock38;
    private javax.swing.JToggleButton rock39;
    private javax.swing.JToggleButton rock4;
    private javax.swing.JToggleButton rock40;
    private javax.swing.JToggleButton rock41;
    private javax.swing.JToggleButton rock42;
    private javax.swing.JToggleButton rock43;
    private javax.swing.JToggleButton rock44;
    private javax.swing.JToggleButton rock45;
    private javax.swing.JToggleButton rock46;
    private javax.swing.JToggleButton rock47;
    private javax.swing.JToggleButton rock48;
    private javax.swing.JToggleButton rock49;
    private javax.swing.JToggleButton rock5;
    private javax.swing.JToggleButton rock50;
    private javax.swing.JToggleButton rock51;
    private javax.swing.JToggleButton rock52;
    private javax.swing.JToggleButton rock53;
    private javax.swing.JToggleButton rock54;
    private javax.swing.JToggleButton rock55;
    private javax.swing.JToggleButton rock56;
    private javax.swing.JToggleButton rock57;
    private javax.swing.JToggleButton rock58;
    private javax.swing.JToggleButton rock59;
    private javax.swing.JToggleButton rock6;
    private javax.swing.JToggleButton rock60;
    private javax.swing.JToggleButton rock61;
    private javax.swing.JToggleButton rock62;
    private javax.swing.JToggleButton rock63;
    private javax.swing.JToggleButton rock64;
    private javax.swing.JToggleButton rock65;
    private javax.swing.JToggleButton rock66;
    private javax.swing.JToggleButton rock67;
    private javax.swing.JToggleButton rock68;
    private javax.swing.JToggleButton rock69;
    private javax.swing.JToggleButton rock7;
    private javax.swing.JToggleButton rock70;
    private javax.swing.JToggleButton rock71;
    private javax.swing.JToggleButton rock72;
    private javax.swing.JToggleButton rock73;
    private javax.swing.JToggleButton rock74;
    private javax.swing.JToggleButton rock75;
    private javax.swing.JToggleButton rock76;
    private javax.swing.JToggleButton rock77;
    private javax.swing.JToggleButton rock78;
    private javax.swing.JToggleButton rock79;
    private javax.swing.JToggleButton rock8;
    private javax.swing.JToggleButton rock80;
    private javax.swing.JToggleButton rock81;
    private javax.swing.JToggleButton rock82;
    private javax.swing.JToggleButton rock83;
    private javax.swing.JToggleButton rock84;
    private javax.swing.JToggleButton rock85;
    private javax.swing.JToggleButton rock86;
    private javax.swing.JToggleButton rock87;
    private javax.swing.JToggleButton rock88;
    private javax.swing.JToggleButton rock89;
    private javax.swing.JToggleButton rock9;
    private javax.swing.JToggleButton rock90;
    private javax.swing.JTextField step;
    private javax.swing.JLabel title;
    private javax.swing.JLabel whoNow;
    // End of variables declaration//GEN-END:variables
}
