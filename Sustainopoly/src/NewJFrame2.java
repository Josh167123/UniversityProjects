
import game.Board;
import game.Chance;
import game.ChanceCards;
import game.Player;
import game.PlayerType;
import game.Square;
import game.Task;
import game.Utility;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


import java.util.HashMap;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class NewJFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     * @param jTable1
     */
    public NewJFrame2(javax.swing.JTable jTable1) {
        
     
        initComponents();
        hideCardTable();
         
         for (int i = 0; i < jTable1.getRowCount(); i++) {
             String typeString = jTable1.getModel().getValueAt(i, 1).toString();
             String name = jTable1.getModel().getValueAt(i, 0).toString();
             PlayerType typeEnum = null;
             
             switch (typeString) {
                 case "Developer" -> typeEnum = PlayerType.DEVELOPER;
                 case "Tester" -> typeEnum = PlayerType.TESTER;
                 case "Designer" -> typeEnum = PlayerType.DESIGNER;
             }
             
             Player player = new Player(name,typeEnum);
             board.addPlayer(player);
         }
         
         updateTable();
         cards = game.Utility.setUpChanceCards();
         board = Utility.setUpTasks(board);
         calTotaltsks();
         calRemStatsTasks();
         playerTurnLablel.setText(board.getPlayer(board.getPlayerTurnIndex()).getName());
         
          ChanceLabel.setVisible(false);
           ChanceScroll.setVisible(false);
         
       
    }
    
    private void hideCardTable() {
        cardLabel.setVisible(false);
        cardBtn.setVisible(false);
        tablePanCard.setVisible(false);
        hoursToPut.setVisible(false);
        energyToPut.setVisible(false);
        cardHoursLabel.setVisible(false);
        cardEnergyLabel.setVisible(false);
        cardBtnSkip.setVisible(false);

    }
    
    private void showCardTable() {
        cardLabel.setVisible(true);
        cardBtn.setVisible(true);
        tablePanCard.setVisible(true);
        hoursToPut.setVisible(true);
        energyToPut.setVisible(true);
        cardHoursLabel.setVisible(true);
        cardEnergyLabel.setVisible(true); 
        cardBtnSkip.setVisible(true);
     
    }
    
    private void updateCardTable() {
        DefaultTableModel model = (DefaultTableModel) cardTable.getModel();
        model.setRowCount(0);
        int sqrIndex = board.getPlayer(board.getPlayerTurnIndex()).getPosition();
        cardLabel.setText("Card Of Position " + sqrIndex);
        ArrayList<Task> tsks = board.getSquare(sqrIndex).getTask();     
         for (int i= 0; i < tsks.size() ; i++) {
             Task tsk = tsks.get(i);
             model.addRow(new Object[]{tsk.getTaskTitle(), tsk.getEnergyRequired(), tsk.getHoursRequired(), tsk.getRole().toString()});
         }
    }
    
    
    private void updateTable() {
        DefaultTableModel model = (DefaultTableModel) playersTable2.getModel();
        model.setRowCount(0);
         for (int i= 0; i < board.getPlayersNumber(); i++) {
             Player player = board.getPlayer(i);
             model.addRow(new Object[]{player.getName(),player.getType(),player.getPosition(),player.getHours(),player.getEnergy()});
         }
         //select player to play in the table 
        playersTable2.getSelectionModel().addSelectionInterval(board.getPlayerTurnIndex(), board.getPlayerTurnIndex());
    }
    
    
    
    private void showChanceCard() {
        Chance chance = cards.getRandomCard();
       //  JOptionPane.showMessageDialog(this, chance.getDescription());
           ChanceLabel.setVisible(true);
        
          ChanceScroll.setVisible(true);
         ChanceCard.setLineWrap(true);
        ChanceCard.setText(chance.getDescription());
        board.getPlayer(board.getPlayerTurnIndex()).addEnergy(chance.getEnergyGain());
        board.getPlayer(board.getPlayerTurnIndex()).addHours(chance.getHoursGain());
        updateTable();
    }

    private NewJFrame2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        dice1 = new javax.swing.JButton();
        dice2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cardBtn = new javax.swing.JButton();
        cardHoursLabel = new javax.swing.JLabel();
        cardEnergyLabel = new javax.swing.JLabel();
        energyToPut = new javax.swing.JSpinner();
        hoursToPut = new javax.swing.JSpinner();
        cardBtnSkip = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        remStatsLable = new javax.swing.JLabel();
        totalStatsLable = new javax.swing.JLabel();
        persStatsLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        playersTable2 = new javax.swing.JTable();
        playerTurnLablel = new javax.swing.JLabel();
        ChanceLabel = new java.awt.Label();
        ChanceScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ChanceCard = new javax.swing.JTextArea();
        tablePanCard = new javax.swing.JScrollPane();
        cardTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cardLabel = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dice1.setBackground(new java.awt.Color(0, 0, 0));
        dice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/rolling-dices (1).png"))); // NOI18N
        dice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dice1ActionPerformed(evt);
            }
        });
        getContentPane().add(dice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 150, 150));

        dice2.setBackground(new java.awt.Color(0, 0, 0));
        dice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/rolling-dices (1).png"))); // NOI18N
        dice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dice2ActionPerformed(evt);
            }
        });
        getContentPane().add(dice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 700, 150, 150));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player's turn:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 350, 30));

        jPanel2.setBackground(new java.awt.Color(20, 47, 63));
        jPanel2.setPreferredSize(new java.awt.Dimension(1380, 920));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Press any of the dice buttons to get dice numbers and to move");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cardBtn.setBackground(new java.awt.Color(255, 126, 160));
        cardBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cardBtn.setForeground(new java.awt.Color(255, 255, 255));
        cardBtn.setText("Do the Task!");
        cardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardBtnActionPerformed(evt);
            }
        });

        cardHoursLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cardHoursLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardHoursLabel.setText("Hours to put");

        cardEnergyLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cardEnergyLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardEnergyLabel.setText("Energy to put");

        energyToPut.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        energyToPut.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        hoursToPut.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        hoursToPut.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        cardBtnSkip.setBackground(new java.awt.Color(255, 126, 160));
        cardBtnSkip.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cardBtnSkip.setForeground(new java.awt.Color(255, 255, 255));
        cardBtnSkip.setText("Skip");
        cardBtnSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardBtnSkipActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(124, 69, 137));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Game Stats");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("The tasks remaining:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("The total tasks :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("The percentage done :");

        remStatsLable.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        remStatsLable.setForeground(new java.awt.Color(255, 255, 255));
        remStatsLable.setText("0");

        totalStatsLable.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        totalStatsLable.setForeground(new java.awt.Color(255, 255, 255));
        totalStatsLable.setText("0");

        persStatsLable.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        persStatsLable.setForeground(new java.awt.Color(255, 255, 255));
        persStatsLable.setText("0%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalStatsLable))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(remStatsLable))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(persStatsLable)))))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(remStatsLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalStatsLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(persStatsLable))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        playersTable2.setBackground(new java.awt.Color(2, 166, 139));
        playersTable2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        playersTable2.setForeground(new java.awt.Color(255, 255, 255));
        playersTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Postion", "Hours", "Energy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        playersTable2.setRowHeight(30);
        jScrollPane1.setViewportView(playersTable2);
        if (playersTable2.getColumnModel().getColumnCount() > 0) {
            playersTable2.getColumnModel().getColumn(0).setResizable(false);
            playersTable2.getColumnModel().getColumn(1).setResizable(false);
            playersTable2.getColumnModel().getColumn(2).setResizable(false);
            playersTable2.getColumnModel().getColumn(3).setResizable(false);
            playersTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        playerTurnLablel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        playerTurnLablel.setForeground(new java.awt.Color(255, 255, 255));
        playerTurnLablel.setText("player");
        playerTurnLablel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ChanceLabel.setAlignment(java.awt.Label.CENTER);
        ChanceLabel.setBackground(new java.awt.Color(100, 100, 100));
        ChanceLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ChanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        ChanceLabel.setText("CHANCE");

        ChanceScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ChanceScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ChanceCard.setColumns(20);
        ChanceCard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChanceCard.setLineWrap(true);
        ChanceCard.setRows(5);
        ChanceCard.setWrapStyleWord(true);
        ChanceCard.setAutoscrolls(false);
        ChanceCard.setRequestFocusEnabled(false);
        ChanceCard.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        ChanceCard.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(ChanceCard);

        ChanceScroll.setViewportView(jScrollPane2);

        cardTable.setBackground(new java.awt.Color(2, 166, 139));
        cardTable.setForeground(new java.awt.Color(255, 255, 255));
        cardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Task", "Energy", "Hours", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cardTable.setRowHeight(60);
        cardTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        cardTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePanCard.setViewportView(cardTable);
        if (cardTable.getColumnModel().getColumnCount() > 0) {
            cardTable.getColumnModel().getColumn(1).setPreferredWidth(10);
            cardTable.getColumnModel().getColumn(2).setPreferredWidth(10);
            cardTable.getColumnModel().getColumn(3).setPreferredWidth(25);
        }

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Map (1) (1).png"))); // NOI18N

        cardLabel.setAlignment(java.awt.Label.CENTER);
        cardLabel.setBackground(new java.awt.Color(20, 47, 63));
        cardLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cardLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardLabel.setText("Card Label");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(cardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tablePanCard, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(playerTurnLablel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChanceScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(energyToPut, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cardEnergyLabel))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cardHoursLabel)
                                    .addComponent(hoursToPut, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(cardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(cardBtnSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(ChanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(ChanceScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(playerTurnLablel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(tablePanCard, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardEnergyLabel)
                            .addComponent(cardHoursLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hoursToPut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(energyToPut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardBtnSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1400, 1030));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextPlayer() {
        ChanceLabel.setVisible(false);
        ChanceScroll.setVisible(false);
        hideCardTable();
        board.next();
        dice1.setEnabled(true);
        dice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/rolling-dices (1).png")));
        dice2.setEnabled(true);
        dice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/rolling-dices (1).png")));
        updateTable();
        playerTurnLablel.setText(board.getPlayer(board.getPlayerTurnIndex()).getName());
    }
    
    private void dice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dice1ActionPerformed
        
        Random rd = new Random(); 
        random1 = rd.nextInt(6)+1;
        switch(random1) {
            case 1 -> dice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-one.png")));
            case 2 -> dice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-two.png")));
            case 3 -> dice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-three.png")));
            case 4 -> dice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-four.png")));
            case 5 -> dice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-five.png")));
            case 6 -> dice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-six.png")));
        }
        random2 = rd.nextInt(6)+1;
        switch(random2) {
            case 1 -> dice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-one.png")));
            case 2 -> dice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-two.png")));
            case 3 -> dice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-three.png")));
            case 4 -> dice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-four.png")));
            case 5 -> dice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-five.png")));
            case 6 -> dice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dice/dice-six-faces-six.png")));
        }
        dice1.setEnabled(false);
        dice2.setEnabled(false);
        
         board.getPlayer(board.getPlayerTurnIndex()).movePlayer(random1 + random2,board.getMaxSquareNumber());
       updateTable();
       if (random1 == random2 ) {
           showChanceCard();
       }
       updateCardTable();
       int sqrIndex = board.getPlayer(board.getPlayerTurnIndex()).getPosition();
       if (board.getSquare(sqrIndex).getTask().isEmpty()) {
           nextPlayer();
           JOptionPane.showMessageDialog(this, "The Square you have landed on has no tasks! The turn will go to the next player");
       }
       else {
        showCardTable();
        }
    }//GEN-LAST:event_dice1ActionPerformed

    private void dice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dice2ActionPerformed
        dice1ActionPerformed(evt);
    }//GEN-LAST:event_dice2ActionPerformed

    private void calRemStatsTasks() {     
        ArrayList<Square> sqrs = board.getSquares();
        int length = sqrs.size();
        tasksNumber = 0;
        for (int i = 0; i < length; i++){
           tasksNumber += sqrs.get(i).getTask().size();
        }
        remStatsLable.setText(String.valueOf(tasksNumber));
    }
    
    private void calTotaltsks() {
        ArrayList<Square> sqrs = board.getSquares();
        int length = sqrs.size();
        tasksNumber = 0;
        for (int i = 0; i < length; i++){
           tasksNumber += sqrs.get(i).getTask().size();
        }
        totalStatsLable.setText(String.valueOf(tasksNumber));
          
    }
    
    
        private void WinGame()
    {
           EndScreen frame = new EndScreen (board);
            
            frame.setVisible(true);
            this.dispose();
            
    }
    
    
    private void calPerTsks() {
        double per = 100-((Double.parseDouble( remStatsLable.getText()) / Double.parseDouble(totalStatsLable.getText()))*100);
        persStatsLable.setText(String.format("%.1f", per)+"%");
    }
        
    private void cardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardBtnActionPerformed
        int row = cardTable.getSelectedRow();
        
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "No task selected! Please select a task"); 
        } 
        else {
            int energyPut = (Integer) energyToPut.getModel().getValue();
            int hourPut = (Integer) hoursToPut.getModel().getValue();
            Square sqr = board.getSquare(board.getPlayer(board.getPlayerTurnIndex()).getPosition());
            DefaultTableModel model = (DefaultTableModel) cardTable.getModel();
            Player ply = board.getPlayer(board.getPlayerTurnIndex());
            if (model.getValueAt(row, 3).equals(ply.getType().toString())|| model.getValueAt(row, 3).equals(PlayerType.GENERAL.toString())) //if the task is general or equals player type
            {
                    if (energyPut <= sqr.getTask().get(row).getEnergyRequired() && hourPut <= sqr.getTask().get(row).getHoursRequired()) //if hours entered are less than or equal to required
                    {

                    if (ply.getEnergy() >= energyPut && ply.getHours() >= hourPut ) //If player has enough energy and enough hours
                    {
                        if ((Integer) model.getValueAt(row, 1) == energyPut && (Integer) model.getValueAt(row, 2) == hourPut ) //if tasks hours and energy = players input
                        {
                          board.getSquare(board.getPlayer(board.getPlayerTurnIndex()).getPosition()).deleteTask(row); //task complete
                          board.getPlayer(board.getPlayerTurnIndex()).addTaskComplete();
                             if(tasksNumber <=1) //If all tasks are complete call win game
                                  {
                                  WinGame();       
                                }  
                        }
                        else //reduce tasks requirements
                        {
                            board.getSquare(board.getPlayer(board.getPlayerTurnIndex()).getPosition()).getTask().get(row).reduceEnergyRequired(energyPut);
                            board.getSquare(board.getPlayer(board.getPlayerTurnIndex()).getPosition()).getTask().get(row).reduceHoursRequired(hourPut);
                        }
                        board.getPlayer(board.getPlayerTurnIndex()).reduceEnergy(energyPut); //reduce player energy
                    
                        
                        board.getPlayer(board.getPlayerTurnIndex()).reduceHours(hourPut);
                        calRemStatsTasks();
                        calPerTsks();
                        nextPlayer();
                    }
                    else { // when player dosent have enough resources
                            JOptionPane.showMessageDialog(this, "Sorry, you don't have enough resources!"); 
                        }
                }
                else {// when player type energy or hours number > the required
                    JOptionPane.showMessageDialog(this, "Sorry, you typed a number that is higher than the required!"); 
                }
            }
            else if((ply.getEnergy() >= energyPut && ply.getHours() >= hourPut) && (energyPut <=1 && hourPut <= 1)) //player has at least 1 energy or 1 hour
            {
            	 if ((Integer) model.getValueAt(row, 1) == energyPut && (Integer) model.getValueAt(row, 2) == hourPut ) //if tasks hours and energy = players input
                 {
                   board.getSquare(board.getPlayer(board.getPlayerTurnIndex()).getPosition()).deleteTask(row); //task complete
                   board.getPlayer(board.getPlayerTurnIndex()).addTaskComplete();
                      if(tasksNumber <=1) //If all tasks are complete call win game
                           {
                           WinGame();       
                         }  
                 }
                 else //reduce tasks requirements
                 {
                     board.getSquare(board.getPlayer(board.getPlayerTurnIndex()).getPosition()).getTask().get(row).reduceEnergyRequired(energyPut);
                     board.getSquare(board.getPlayer(board.getPlayerTurnIndex()).getPosition()).getTask().get(row).reduceHoursRequired(hourPut);
                 }
                 board.getPlayer(board.getPlayerTurnIndex()).reduceEnergy(energyPut); //reduce player energy
             
                 
                 board.getPlayer(board.getPlayerTurnIndex()).reduceHours(hourPut);
                 calRemStatsTasks();
                 calPerTsks();
                 nextPlayer();
            
            }
            

            
        }
    }//GEN-LAST:event_cardBtnActionPerformed

    
    private void cardBtnSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardBtnSkipActionPerformed
        nextPlayer();
    }//GEN-LAST:event_cardBtnSkipActionPerformed

 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame2().setVisible(true);
        });
        
       
        
        
         
    }
    
    private int tasksNumber;
    private int random1;
    private int random2;
    private ChanceCards cards;
    private Board board = new Board(21);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ChanceCard;
    private java.awt.Label ChanceLabel;
    private javax.swing.JScrollPane ChanceScroll;
    private javax.swing.JButton cardBtn;
    private javax.swing.JButton cardBtnSkip;
    private javax.swing.JLabel cardEnergyLabel;
    private javax.swing.JLabel cardHoursLabel;
    private java.awt.Label cardLabel;
    private javax.swing.JTable cardTable;
    private javax.swing.JButton dice1;
    private javax.swing.JButton dice2;
    private javax.swing.JSpinner energyToPut;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JSpinner hoursToPut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel persStatsLable;
    private javax.swing.JLabel playerTurnLablel;
    private javax.swing.JTable playersTable2;
    private javax.swing.JLabel remStatsLable;
    private javax.swing.JScrollPane tablePanCard;
    private javax.swing.JLabel totalStatsLable;
    // End of variables declaration//GEN-END:variables
}
