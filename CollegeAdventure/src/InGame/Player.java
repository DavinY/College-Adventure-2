/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InGame;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Davin Yulion
 */
public class Player extends JLabel{
    
    public Player(){
        this.setIcon(new ImageIcon(resizeImage("img/zombie.png", 30, 30)));
        this.setSize(30, 30);
        this.setLocation(0, 0);
    }
    
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
  
    
    
}
