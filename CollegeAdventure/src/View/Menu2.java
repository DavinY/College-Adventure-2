///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package View;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Image;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
//import javax.swing.BorderFactory;
//import javax.swing.border.Border;
//import javax.swing.border.BevelBorder;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JSeparator;
//import javax.swing.JTextField;
//import static java.awt.GraphicsDevice.WindowTranslucency;
//
///**
// *
// * @author Davin Yulion
// */
//public class Menu2 extends JFrame implements KeyListener {
//
//    Menu2() {
//        this.setLayout(null);
//        this.setUndecorated(true);
////        playSound();
//        awal();
//
//    }
//
//    public static void main(String[] args) {
//        new Menu().setVisible(true);
//    }
//
//    private void awal() {
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//
////        setLocationRelativeTo(null);
//        setTitle("College Adventure");
//        String menuUtama = "img/background_awal.jpg";
//        String menuNewGame = "img/background_daftar3.jpg";
//        Image background = resizeImage(menuUtama, 1400, 770);
//        Image background_daftar = resizeImage(menuNewGame, 760, 400);
//        setContentPane(new JLabel(new ImageIcon(background)));
//        addKeyListener(this);
//        
//    }
//
//    //GUI awal" new Game,LoadGame,Option
//    private void menu_Awal() {
//        panelAwal.setSize(500, 600);
//        panelAwal.setLocation(0, 250);
//        panelAwal.setOpaque(false);
//        this.add(panelAwal);
//
////        lblLogo.setIcon(new ImageIcon("img/logo.png"));
////        lblLogo.setSize(300, 100);
////        lblLogo.setLocation(120, 50);
////        panelAwal.add(lblLogo);
//        btnExit.setSize(50, 50);
//        btnExit.setLocation(1310, 0);
//        btnExit.setIcon(new ImageIcon(resizeImage("img/exit.png", 85, 50)));
//        add(btnExit);
//
//        btnNewGame.setIcon(new ImageIcon("img/newgame.png"));
//        btnNewGame.setSize(250, 50);
//        btnNewGame.setLocation(130, 200);
//
//        panelAwal.add(btnNewGame);
//
//        btnLoadGame.setIcon(new ImageIcon("img/loadgame.png"));
//        btnLoadGame.setSize(250, 50);
//        btnLoadGame.setLocation(130, 270);
//        panelAwal.add(btnLoadGame);
//
//        btnOption.setIcon(new ImageIcon("img/option.png"));
//        btnOption.setSize(250, 50);
//        btnOption.setLocation(130, 340);
//
//        panelAwal.add(btnOption);
//        repaint();
//
//        //Untuk EXIT 
//        btnExit.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.exit(0);
//
//            }
//
//        });
//
//        //Ke panel New Game
//        btnNewGame.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                makeNewGame();
//            }
//
//        });
//        
//        //untuk gender button
//        btnFemale.addMouseListener(new MouseAdapter(){
//            @Override
//            public void mouseClicked(MouseEvent e){
//                genderFemale();
//            }
//        });
//        
//        btnMale.addMouseListener(new MouseAdapter(){
//            @Override
//            public void mouseClicked(MouseEvent e){
//                genderMale();
//            }
//        });
//            
//        //Ke Panel LoadGame
//        btnLoadGame.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                panelAwal.setVisible(false);
//                panelLoadGame.setSize(800, 600);
//                panelLoadGame.setLocation(300, 50);
//                add(panelLoadGame);
//
//            }
//        });
//
//        //Ke Panel Option
//        btnOption.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                panelAwal.setVisible(false);
//                panelOption.setSize(800, 600);
//                panelOption.setLocation(300, 50);
//                add(panelOption);
//            }
//
//        });
//
//    }
//
//    private void genderFemale(){
//        gendericon.setIcon(new ImageIcon(resizeImage("img/gender_female.jpg",150,150)));
//    }
//    private void genderMale(){
//        gendericon.setIcon(new ImageIcon(resizeImage("img/gender_male.jpg",150,150)));
//    }
//    private void makeNewGame() {
//
//        // pengaturan panel awal
//        panelAwal.setVisible(false);
//        panelNewGame.setSize(800, 600);
//        panelNewGame.setLayout(null);
//        panelNewGame.setLocation(300, 50);
//        panelNewGame.setBackground(color.white);
//
//        //panel untuk daftar character
//        paneldaftar.setVisible(true);
//        paneldaftar.setLayout(null);
//        paneldaftar.setSize(760, 400);
//        paneldaftar.setLocation(20, 170);
//        paneldaftar.setBackground(new Color(0, 0, 0, 180));
//
//        //label nama
//        daftarnama.setBounds(280, 20, 300, 50);
//        daftarnama.setText("ENTER YOUR NAME ! ");
//        daftarnama.setFont(new Font("Serif", Font.BOLD, 20));
//        daftarnama.setForeground(color.red);
//
//        //text isi nama
//        daftarnama_txt.setBounds(290, 80, 180, 25);
//        daftarnama_txt.setBackground(color.black);
//        daftarnama_txt.setForeground(color.white);
//
//        BevelBorder raisedBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.RAISED);
//        BevelBorder loweredBevel = (BevelBorder) BorderFactory.createBevelBorder(BevelBorder.LOWERED);
//        Border border = BorderFactory.createCompoundBorder(raisedBevel, loweredBevel);
//        paneldaftar.setBorder(border);
//
//        //untuk pilih gender
//        btnFemale.setBounds(270, 120, 100, 30);
//        btnFemale.setOpaque(false);
//        btnFemale.setForeground(color.white);
//        btnMale.setBounds(430, 120, 100, 30);
//        btnMale.setOpaque(false);
//        btnMale.setForeground(color.white);
//        btngroup.add(btnMale);
//        btngroup.add(btnFemale);
//
//        //untuk gambar gender
//        gendericon.setBounds(306, 170, 150, 150);
//        gendericon.setIcon(new ImageIcon(resizeImage("img/gender_icon.jpg",150,150)));
//        
////        lblNama.setSize(100, 30);
////        lblNama.setLocation(350, 30);
//        paneldaftar.add(gendericon);
//        paneldaftar.add(lblNama);
//        paneldaftar.add(daftarnama);
//        paneldaftar.add(daftarnama_txt);
//        paneldaftar.add(daftarnama);
//        paneldaftar.add(btnFemale);
//        paneldaftar.add(btnMale);
//        panelNewGame.add(paneldaftar);
//
//        lblNama.setBounds(250, 20, 395, 127);
//        lblNama.setIcon(new ImageIcon(resizeImage("img/daftar1.png", 300, 127)));
//        panelNewGame.add(lblNama);
//        add(panelNewGame);
//
//        addKeyListener(this);
//        repaint();
//
//    }
//
//    //Untuk Me Rize Image
//    private Image resizeImage(String url, int w, int h) {
//        Image dimg = null;
//        try {
//            BufferedImage img = ImageIO.read(new File(url));
//            dimg = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);
//        } catch (IOException ex) {
//            ex.printStackTrace(System.err);
//        }
//        return dimg;
//    }
//
//    //Untuk memasukan Musik
//    public static void playSound() {
//        try {
//            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("music/openingmusik.wav").getAbsoluteFile());
//            clip = AudioSystem.getClip();
//            clip.open(audioInputStream);
//            clip.start();
//            clip.loop(Clip.LOOP_CONTINUOUSLY);
//        } catch (Exception ex) {
//            System.out.println("Error with playing sound.");
//            ex.printStackTrace();
//        }
//    }
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//            menu_Awal();
//        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
//            menu_Awal();
//            panelNewGame.setVisible(false);
//            panelLoadGame.setVisible(false);
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//
//    }
//    static Clip clip;
//    JPanel panelAwal = new JPanel();
//    JPanel panelNewGame = new JPanel();
//    JPanel panelLoadGame = new JPanel();
//    JPanel panelOption = new JPanel();
//    JPanel paneldaftar = new JPanel();
//
//    JLabel lblLogo = new JLabel();
//    JLabel lblNama = new JLabel();
//    JLabel daftarnama = new JLabel();
//    JLabel gendericon = new JLabel();
//
//    JTextField daftarnama_txt = new JTextField(15);
//
//    JButton btnLoadGame = new JButton();
//    JButton btnNewGame = new JButton();
//    JButton btnOption = new JButton();
//    JButton btnExit = new JButton();
//
//    JRadioButton btnFemale = new JRadioButton("Female");
//    JRadioButton btnMale = new JRadioButton("Male");
//
//    ButtonGroup btngroup = new ButtonGroup();
//    private Color color;
//}
