
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jay
 */
public class MainView extends javax.swing.JFrame {

	Board board;
	GameLogicController controller;
	/**
	 * Creates new form MainView
	 */
	public MainView(Board inputBoard) {
		board = inputBoard;
		controller = new GameLogicController(inputBoard);
		
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		try{
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e){
		
		}
		//</editor-fold>
		
		initComponents();
		this.setVisible(true);

		appendToGameLog("test");
	}
	
	public void appendToGameLog(String message) {
		message = message.concat("\n");
		textAreaGameLog.append(message);
	}
	
	private Player getCurrentPlayer() {
		return board.players.get(board.getCurrentPlayerID());
	}
	
	public void update() {
		Player currentPlayer = getCurrentPlayer();
		if (currentPlayer.getActionLockedEndTurn() == true) {
			buttonEndTurn.setEnabled(false);
		}
		else {
			buttonEndTurn.setEnabled(true);
		}
		
		if (currentPlayer.getActionLockedRollDice() == true) {
			buttonRollDice.setEnabled(false);
		}
		else {
			buttonRollDice.setEnabled(true);
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaGameLog = new javax.swing.JTextArea();
        buttonRollDice = new javax.swing.JButton();
        buttonEndTurn = new javax.swing.JButton();
        buttonUNLOCK = new javax.swing.JButton();
        buttonLOCK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(400, 400));

        textAreaGameLog.setColumns(20);
        textAreaGameLog.setRows(5);
        jScrollPane1.setViewportView(textAreaGameLog);

        buttonRollDice.setText("Roll Dice");
        buttonRollDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRollDiceActionPerformed(evt);
            }
        });

        buttonEndTurn.setText("End Turn");
        buttonEndTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEndTurnActionPerformed(evt);
            }
        });

        buttonUNLOCK.setText("UNLOCK");
        buttonUNLOCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUNLOCKActionPerformed(evt);
            }
        });

        buttonLOCK.setText("LOCK");
        buttonLOCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLOCKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonRollDice, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEndTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUNLOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRollDice, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEndTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonUNLOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonLOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRollDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRollDiceActionPerformed
        controller.diceRollManager();
        update();
    }//GEN-LAST:event_buttonRollDiceActionPerformed

    private void buttonUNLOCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUNLOCKActionPerformed
        appendToGameLog("buttonUNLOCK");
        update();
    }//GEN-LAST:event_buttonUNLOCKActionPerformed

    private void buttonLOCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLOCKActionPerformed
        update();
    }//GEN-LAST:event_buttonLOCKActionPerformed

    private void buttonEndTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEndTurnActionPerformed
        controller.endTurnManager();
        update();
    }//GEN-LAST:event_buttonEndTurnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEndTurn;
    private javax.swing.JButton buttonLOCK;
    private javax.swing.JButton buttonRollDice;
    private javax.swing.JButton buttonUNLOCK;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaGameLog;
    // End of variables declaration//GEN-END:variables
}
