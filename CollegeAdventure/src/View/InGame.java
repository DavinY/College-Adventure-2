/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import InGame.Player;
import InGame.Pohon;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Davin Yulion
 */
public class InGame extends JFrame {

    InGame() {
        initInGame();
    }

    private void initInGame() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);

//        setUndecorated(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLayout(null);

        pnlOption.setSize(1200, 50);
        pnlOption.setLocation(80, 0);
        pnlOption.setBackground(Color.blue);
        this.add(pnlOption);

        pnlUtama.setSize(1200, 600);
        pnlUtama.setLocation(80, 50);
        pnlUtama.setBackground(Color.black);
        pnlUtama.setLayout(null);

//        pnlUtama.setLayout(new GridLayout(30, 20));
        this.add(pnlUtama);

//        lblmain.setIcon(new ImageIcon("img/logo.png"));
//        lblmain.setSize(1200, 600);
//        lblmain.setLocation(0, 0);
//        lblmain.setBackground(Color.black);
//        pnlUtama.add(lblmain);
        Player s = new Player();
        s.setLocation(0, 0);
        pnlUtama.add(s);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 40; j++) {
                lbltanah[i][j] = new JLabel();
                lbltanah[i][j].setSize(30, 30);
                lbltanah[i][j].setLocation(j * 30, i * 30);
                lbltanah[i][j].setIcon(new ImageIcon("img/tanah.png"));
                lbltanah[i][j].setVisible(false);
                pnlUtama.add(lbltanah[i][j]);
            }
        }
        
        System.out.println(lbltanah[19][39].getLocation());
        
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int x = 0;
                int y = 0;
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP: {
                        if (s.getY() > 0) {
                            x = 0;
                            y = -30;
                            break;
                        } else {
                            break;
                        }

                    }
                    case KeyEvent.VK_LEFT: {
                        if (s.getX() > 0) {
                            x = -30;
                            y = 0;
                            break;
                        } else {
                            break;
                        }

                    }
                    case KeyEvent.VK_RIGHT: {
                        if (s.getX() < 1170) {
                            x = 30;
                            y = 0;
                            break;
                        } else {
                            break;
                        }
                    }
                    case KeyEvent.VK_DOWN: {
                        if (s.getY() < 570) {
                            x = 0;
                            y = 30;
                            break;
                        } else {
                            break;
                        }
                    }
                    default:
                        break;
                }
                lbltanah[s.getY()/30][s.getX()/30].setVisible(true);
                s.setLocation(s.getX() + x, s.getY() + y);
            }
        });
        
        
    }

    public static void main(String[] args) {    
        new InGame().setVisible(true);
    }

    
    JPanel pnlUtama = new JPanel();
    JPanel pnlOption = new JPanel();
    JLabel[][] lbltanah = new JLabel[20][40];
    JLabel lblmain = new JLabel();
}
