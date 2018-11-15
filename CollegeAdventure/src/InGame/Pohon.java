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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Davin Yulion
 */
public class Pohon extends JLabel implements Runnable {

    int x, y;
    Player player;

    public Pohon(Player c) {
        player = c;

        initPohon();
        this.setVisible(false);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY() {
        this.y = y;
    }

    public void initPohon() {
        setIcon(new ImageIcon(resizeImage("img/pohon.png", 50, 50)));
        setSize(50, 50);
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

    @Override
    public void run() {
        while (true) {
            // cek jika kondisi yg membuat pohon muncul, bernilai TRUE, maka
            // setVisibile (true) pohonnya.
            // Sebaliknya setVisible (false).

            ;

            try {
                Thread.currentThread().sleep(200);
                if (player.getX() >= this.getX() - 50 && player.getY() >= this.getY() - 50 || player.getX() <= this.getX() + 50 && player.getY() <= this.getY() + 50) {
                    this.setVisible(true);
                }else {
                    this.setVisible(false);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
