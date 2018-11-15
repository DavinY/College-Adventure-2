/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Davin Yulion
 */
public class FrameUtama extends JFrame {
    
    public void init(String menuUtama){
        
        this.setLayout(null);
        this.setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

//        setLocationRelativeTo(null);
        setTitle("College Adventure");
        
        Image background = resizeImage(menuUtama, 1500, 900);
        setContentPane(new JLabel(new ImageIcon(background)));
        
        lblExit.setLocation(1310, 0);
        lblExit.setSize(50,50);
        lblExit.setIcon(new ImageIcon(resizeImage("img/exit.png", 50, 50)));
        lblExit.setOpaque(false);
        add(lblExit);
        
        btnOption.setIcon(new ImageIcon(resizeImage("img/option.png", 50, 50)));
        btnOption.setLocation(1250, 0);
        btnOption.setSize(50, 50);
        btnOption.setOpaque(false);
        add(btnOption);
        
         //Untuk EXIT 
        lblExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

        });
        
        //Ke Panel Option
        btnOption.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               makeOption();
            }

        });

        
    }
     private void makeOption() {
        panelOption.setSize(800, 600);
        panelOption.setLocation(300, 50);
        this.add(panelOption);
    }
    
     //Untuk Me Rize Image
    private Image resizeImage(String url, int w, int h) {
        Image dimg = null;
        try {
            BufferedImage img = ImageIO.read(new File(url));
            dimg = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        return dimg;
    }
    
    public Image resizeImage(String url) {
        Image dimg = null;
        try {
            BufferedImage img = ImageIO.read(new File(url));
            dimg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        return dimg;

    }
    
    JLabel btnOption = new JLabel();
    JLabel lblExit = new JLabel();
    
    JPanel panelOption = new JPanel();
    

}
