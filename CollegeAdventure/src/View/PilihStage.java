/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Davin Yulion
 */
public class PilihStage extends JFrame {

    private JPanel pnl;

    public PilihStage() {
        setSize(500, 500);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        init();
    }

    public void init() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 10; j++) {
                pnl = new JPanel();
                pnl.setBackground(Color.black);
                pnl.setSize(50, 50);
                pnl.setLocation(i * 50, j * 10);
                this.add(pnl);
                
            }
        }
        
    }

    public static void main(String[] args) {
        new PilihStage().setVisible(true);
    }
}
