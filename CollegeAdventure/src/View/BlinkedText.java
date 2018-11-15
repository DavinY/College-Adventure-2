/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author Davin Yulion
 */
public class BlinkedText extends JLabel implements Runnable {

    public BlinkedText() {

        this.setText("<html><font color='white'><bold>PRESS ENTER TO CONTINUE</bold></font></html>");
        setFont(new Font("Comic Sans", Font.PLAIN, 40));
        setBounds(400, 500, 1200, 40);
    }

    @Override
    public void run() {
        while (true) {
            try {
                int i = 0;
                while (true) {
                    if (i % 2 == 0) {
                        this.setVisible(true);
                    } else {
                        this.setVisible(false);
                    }
                    i++;
                    Thread.sleep(500);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
