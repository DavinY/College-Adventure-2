/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Davin Yulion
 */
public class Menu extends JFrame {

    Menu() {
        this.setLayout(null);
        this.setUndecorated(true);
        playSound();
        awal();

    }

    public static void main(String[] args) {
        new Menu().setVisible(true);
    }

    private void awal() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);

//        setLocationRelativeTo(null);
        setTitle("College Adventure");
        String menuUtama = "img/MenuUtama.png";
        Image background = resizeImage(menuUtama, 1500, 900);
        setContentPane(new JLabel(new ImageIcon(background)));

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    menu_Awal();
                }
            }

        });
    }

    //GUI awal" new Game,LoadGame,Option
    private void menu_Awal() {
        panelAwal.setSize(500, 600);
        panelAwal.setLocation(430, 70);
        panelAwal.setOpaque(false);
        this.add(panelAwal);

        lblLogo.setIcon(new ImageIcon("img/logo.png"));
        lblLogo.setSize(300, 100);
        lblLogo.setLocation(120, 50);
        panelAwal.add(lblLogo);
        
        
        btnExit.setLocation(1310, 0);
        btnExit.setSize(50,50);
        btnExit.setIcon(new ImageIcon(resizeImage("img/exit.png", 85, 50)));
        add(btnExit);
        
        btnOption.setIcon(new ImageIcon(resizeImage("img/option.png", 85, 50)));
        btnOption.setLocation(1250, 0);
        btnOption.setSize(50, 50);
        add(btnOption);
        
        btnNewGame.setIcon(new ImageIcon("img/newgame.png"));
        btnNewGame.setSize(250, 50);
        btnNewGame.setLocation(130, 200);
        panelAwal.add(btnNewGame);

        btnLoadGame.setIcon(new ImageIcon("img/loadgame.png"));
        btnLoadGame.setSize(250, 50);
        btnLoadGame.setLocation(130, 270);
        panelAwal.add(btnLoadGame);

        repaint();

        //Untuk EXIT 
        btnExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);

            }

        });

        //Ke panel New Game
        btnNewGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                makeNewGame();

            }

        });

        //Ke Panel LoadGame
        btnLoadGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                makeLoadGame();

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

    private void makeNewGame() {

        panelAwal.setVisible(false);
        panelNewGame.setSize(800, 600);
        panelNewGame.setLayout(null);
        panelNewGame.setLocation(300, 50);
        panelNewGame.setBackground(Color.white);

        lblNama.setBounds(30, 30, 200, 30);
        panelNewGame.add(lblNama);

        txtnama.setBounds(100, 30, 200, 30);
        panelNewGame.add(txtnama);
        
        rdnMale = new JRadioButton("Male");
        rdnMale.setBounds(100, 50, 100, 50);
        rdnMale.setOpaque(false);
        panelNewGame.add(rdnMale);
        
        rdnFemale = new JRadioButton("Female");
        rdnFemale.setBounds(200,50,100,50);
        rdnFemale.setOpaque(false);
        panelNewGame.add(rdnFemale);
        
        rdnGroup.add(rdnMale);
        rdnGroup.add(rdnFemale);
        
       
        add(panelNewGame);
        
        repaint();
        
      

    }

    private void makeLoadGame() {
        panelAwal.setVisible(false);
        panelLoadGame.setSize(800, 600);
        panelLoadGame.setLocation(300, 50);
        add(panelLoadGame);
        int a;
    }

    private void makeOption() {
        panelNewGame.setVisible(false);
        panelLoadGame.setVisible(false);
        panelAwal.setVisible(false);
        panelOption.setSize(800, 600);
        panelOption.setLocation(300, 50);
        add(panelOption);
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

    //Untuk memasukan Musik
    public static void playSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("music/openingmusik.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    static Clip clip;
    JPanel panelAwal = new JPanel();
    JPanel panelNewGame = new JPanel();
    JPanel panelLoadGame = new JPanel();
    JPanel panelOption = new JPanel();

    JLabel lblLogo = new JLabel();

    JLabel lblNama = new JLabel("Nama ");

    JButton btnLoadGame = new JButton();
    JButton btnNewGame = new JButton();
    JButton btnOption = new JButton();
    JButton btnExit = new JButton();

    JTextField txtnama = new JTextField();
    
    JRadioButton rdnMale = new JRadioButton();
    JRadioButton rdnFemale = new JRadioButton();
    ButtonGroup rdnGroup = new ButtonGroup();
}
