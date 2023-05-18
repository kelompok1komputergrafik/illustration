/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.komputer.grafik;

/**
 *
 * @author Unggulks
 */
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import javax.swing.*;
import java.awt.geom.*;

public class UTSKomputerGrafik extends JApplet {

    /**
     * KELOMPOK 1 UTS KOMPUTER GRAFIK
     * 1. Angga Kurnia - 201011401198
     * 2. Erni - 201011400071
     * 3. Stevianus Imanuel Salangka - 201011401550
     * 4. Unggul Prasetyo Utomo - 201011401212
     */
    
    public static void main (String [] args){
        JFrame frame= new JFrame ();
        frame.setTitle("Pemandangan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet= new UTSKomputerGrafik ();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
    public void init () {
        JPanel panel4 = new Panel2D ();
        getContentPane().add(panel4);
    }
    
    class Panel2D extends JPanel {
        public Panel2D (){
            setPreferredSize(new Dimension(1040, 690));
            setBackground(new Color(120,120,120)); //BACKGROUND
        }
        
        public void paintComponent (Graphics g) {
            super.paintComponent (g);
            //Gambar Gunung, jalan ke gunung dan matahari
            g.setColor(Color.gray); //latar
            g.fillRect(0, 320,1060 ,400 );
            g.setColor(new Color(5,10,220)); //langit
            g.fillRect(0, 0,1050 ,320 ); //langit
            g.setColor(new Color(255,125,10));
            g.fillOval(485,75,170 ,170 ); //matahari
            //== Arah Utara==//
            g.drawLine(562, 15, 562, 73);
            //==Barat Daya ==//
            g.drawLine(490, 120, 430, 90);
            //==Timur Laut==//
            g.drawLine(710, 90, 650, 120);
            //Rumah 1
            g.setColor(Color.orange);
            g.fillRect(20, 530, 121, 80);//background rumah 1
            //Atap
            int ax[] = new int[] {24, 80, 124};
            int ay[] = new int[] {505, 480, 505};
            g.fillPolygon(ax, ay, 3);
            //garis bawah atap 1
            g.fillRect(26, 505, 98, 6);
            //garis bawah atap 3
            g.fillRect(26, 510, 90, 24);
            //garis diatas KANAN
            g.setColor(Color.blue);
            g.drawLine(145, 517, 78, 479);//garis bawah 1
            g.drawLine(146, 516, 79, 478);//garis bawah 2
            g.drawLine(147, 515, 80, 477);//garis bawah 3
            g.drawLine(148, 514, 81, 476);//garis bawah 4
            g.drawLine(147, 513, 82, 475);//garis bawah 5
            //garis diatas KIRI
            g.setColor(Color.blue);
            g.drawLine(83, 479, 15, 508);//garis bawah 1
            g.drawLine(82, 478, 14, 507);//garis bawah 2
            g.drawLine(81, 477, 13, 506);//garis bawah 3
            g.drawLine(80, 476, 12, 505);//garis bawah 4
            g.drawLine(79, 475, 11, 504);//garis bawah 5
            //bingkai
            g.setColor(Color.cyan);
            g.fillRect(30, 565, 15, 29);
            g.fillRect(25, 494, 20, 69);
            g.fillRect(47, 565, 15, 38);
            g.fillRect(64, 565, 15, 34);
            g.fillRect(85, 530, 30, 80);
            g.fillRect(26, 530, 113, 5);
            g.fillRect(46, 495, 8, 35);
            g.fillRect(56, 490, 8, 40);
            g.fillRect(94, 490, 8, 40);
            g.fillRect(66, 500, 25, 15);
            //Bingkai hitam
            g.setColor(Color.black);
            g.drawRect(48, 567, 11, 14);//bingkai pintu 1
            g.drawRect(57, 583, 1, 1);//engsel
            g.drawRect(48, 586, 11, 14);//bingkai pintu 2
            g.drawRect(25, 555, 78, 7);//palang diatas pintu
            g.drawRect(47, 540, 10, 10);//kotak 3.1
            g.drawRect(59, 540, 10, 10);//kotak 3.2
            g.drawRect(71, 540, 10, 10);//kotak 3.3
            g.drawRect(84, 535, 30, 8);//kotak banyak 1
            g.drawRect(84, 543, 30, 8);//kotak banyak 2
            g.drawRect(84, 551, 30, 8);//kotak banyak 3
            g.drawRect(84, 559, 30, 8);//kotak banyak 4
            g.drawRect(84, 567, 30, 8);//kotak banyak 5
            g.drawRect(84, 575, 30, 8);//kotak banyak 6
            g.drawRect(84, 583, 30, 8);//kotak banyak 7
            g.drawRect(84, 591, 30, 8);//kotak banyak 8
            g.drawRect(84, 599, 30, 8);//kotak banyak 9
            g.drawRect(84, 607, 30, 2);//kotak banyak 9
            g.drawRect(117, 555, 22, 6);//kotak banyak paling kanan
            g.drawRect(101, 509, 8, 20);//kotak banyak paling atas 1
            g.drawRect(109, 509, 8, 20);//kotak banyak paling atas 2
            g.drawRect(117, 509, 8, 20);//kotak banyak paling atas 3
            g.drawRect(125, 509, 8, 20);//kotak banyak paling atas 4
            g.drawRect(133, 509, 8, 20);//kotak banyak paling atas 5
            //Rumah 2
            g.setColor(Color.orange);
            g.fillRect(170, 530, 121, 80);//background rumah 1
            //Atap
            int a1x[] = new int[] {171, 227, 271};
            int a1y[] = new int[] {505, 480, 505};
            g.fillPolygon(a1x, a1y, 3);
            //garis bawah atap 1
            g.fillRect(173, 505, 98, 6);
            //garis bawah atap 3
            g.fillRect(173, 510, 90, 24);
            //garis diatas KANAN
            g.setColor(Color.blue);
            g.drawLine(293, 516, 224, 477);//garis bawah 1
            g.drawLine(294, 515, 225, 476);//garis bawah 2
            g.drawLine(295, 514, 226, 475);//garis bawah 3
            g.drawLine(296, 513, 227, 474);//garis bawah 4
            g.drawLine(297, 512, 228, 473);//garis bawah 5
            //garis diatas KIRI
            g.setColor(Color.blue);
            g.drawLine(229, 478, 161, 507);//garis bawah 1
            g.drawLine(230, 476, 162, 505);//garis bawah 2
            g.drawLine(231, 475, 163, 504);//garis bawah 3
            g.drawLine(232, 474, 164, 503);//garis bawah 4
            g.drawLine(233, 475, 165, 502);//garis bawah 5
            //bingkai
            g.setColor(Color.cyan);
            g.fillRect(181, 565, 15, 29);
            g.fillRect(176, 494, 20, 69);
            g.fillRect(198, 565, 15, 38);
            g.fillRect(215, 565, 15, 34);
            g.fillRect(236, 530, 30, 80);
            g.fillRect(177, 530, 113, 5);
            g.fillRect(197, 495, 8, 35);
            g.fillRect(207, 490, 8, 40);
            g.fillRect(245, 490, 8, 40);
            g.fillRect(217, 500, 25, 15);
            //Bingkai hitam
            g.setColor(Color.black);
            g.drawRect(199, 567, 11, 14);//bingkai pintu 1
            g.drawRect(208, 583, 1, 1);//engsel
            g.drawRect(199, 586, 11, 14);//bingkai pintu 2
            g.drawRect(176, 555, 78, 7);//palang diatas pintu
            g.drawRect(198, 540, 10, 10);//kotak 3.1
            g.drawRect(210, 540, 10, 10);//kotak 3.2
            g.drawRect(222, 540, 10, 10);//kotak 3.3
            g.drawRect(235, 535, 30, 8);//kotak banyak 1
            g.drawRect(235, 543, 30, 8);//kotak banyak 2
            g.drawRect(235, 551, 30, 8);//kotak banyak 3
            g.drawRect(235, 559, 30, 8);//kotak banyak 4
            g.drawRect(235, 567, 30, 8);//kotak banyak 5
            g.drawRect(235, 575, 30, 8);//kotak banyak 6
            g.drawRect(235, 583, 30, 8);//kotak banyak 7
            g.drawRect(235, 591, 30, 8);//kotak banyak 8
            g.drawRect(235, 599, 30, 8);//kotak banyak 9
            g.drawRect(235, 607, 30, 2);//kotak banyak 9
            g.drawRect(268, 555, 22, 6);//kotak banyak paling kanan
            g.drawRect(252, 509, 8, 20);//kotak banyak paling atas 1
            g.drawRect(260, 509, 8, 20);//kotak banyak paling atas 2
            g.drawRect(268, 509, 8, 20);//kotak banyak paling atas 3
            g.drawRect(276, 509, 8, 20);//kotak banyak paling atas 4
            g.drawRect(284, 509, 8, 20);//kotak banyak paling atas 5
            //========= GUNUNG LINGKARAN =============
            g.setColor(new Color(30,170,0)); //gunung
            g.fillArc(0, 150, 400, 400, 0, 180); //gunung
            g.fillArc(200, 150, 400, 400, 0, 180); //gunung
            g.fillArc(550, 75, 500, 550, 0, 180); //gunung
            //Membuat jalan
            g.setColor(Color.black);
            g.fillRect(0, 300, 1060, 50);
            //jalan 2
            int jx[] = new int[] {450, 490, 530};
            int jy[] = new int[] {350, 450, 350};
            g.fillPolygon(jx, jy, 3);
            g.fillRect(455, 360, 70, 650);
            // Jalan 3
            g.fillRect(0, 620, 455, 50);
            int px[] = new int[] {450, 490, 530};
            int py[] = new int[] {350, 450, 350};
            g.fillPolygon(px, py, 3);
            //parkir
            g.fillRect(0, 620, 455, 50);
            //Membuat garis jalan
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.white);
            float[] dash = {20.0f};
            BasicStroke strok = new BasicStroke(3.0f,
            BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER, 1.0f, dash, 0.0f);
            g2d.setStroke(strok);
            //Garis jalan 1
            g2d.draw(new Line2D.Double(10, 320, 1060, 320));
            //Garis jalan 2
            g2d.draw(new Line2D.Double(488, 360, 490, 690));
            //Garis jalan 1
            g2d.draw(new Line2D.Double(10, 643, 455, 643));
            //===Pohon Kiri====//
            //pohon kiri 1
            g.setColor(new Color (20,148,18));
            g.fillOval(105,210, 20,45);
            g.fillOval(105,230, 20,45);
            g.fillOval(100,220, 30,40);
            g.fillOval(90, 240, 30,30);
            g.fillOval(110, 240, 30,30);
            g.setColor(new Color(120,100,50));
            int x1[] = new int[] {109, 116, 123};
            int y1[] = new int[] {300, 250, 300};
            g.fillPolygon(x1, y1, 3);
            //pohon kiri 2
            g.setColor(new Color (20,148,18));
            g.fillOval(405,230, 20,45);
            g.fillOval(400,250, 30,40);
            g.fillOval(390, 260, 30,30);
            g.fillOval(410, 260, 30,30);
            g.setColor(new Color(120,100,50));
            int x2[] = new int[] {409, 416, 423};
            int y2[] = new int[] {300, 280, 300};
            g.fillPolygon(x2, y2, 3);
            //pohon kiri 3
            g.setColor(new Color (20,148,18));
            g.fillOval(785,230, 20,45);
            g.fillOval(780,220, 30,40);
            g.fillOval(770, 240, 30,30);
            g.fillOval(790, 240, 30,30);
            g.setColor(new Color(120,100,50));
            int x5[] = new int[] {789, 796, 803};
            int y5[] = new int[] {300, 250, 300};
            g.fillPolygon(x5, y5, 3);
            //===Pohon Kanan====//
            // pohon kanan 1
            g.setColor(new Color (20,148,18));
            g.fillOval(345,230, 20,45);
            g.fillOval(340,250, 30,40);
            g.fillOval(330, 270, 30,30);
            g.fillOval(350, 270, 30,30);
            g.fillOval(345, 270, 23,40);
            g.setColor(new Color(120,100,50));
            int x3[] = new int[] {349, 356, 362};
            int y3[] = new int[] {350, 275, 350};
            g.fillPolygon(x3, y3, 3);
            //pohon kanan 2
            g.setColor(new Color (20,148,18));
            g.fillOval(655,230, 20,45);
            g.fillOval(650,250, 30,40);
            g.fillOval(640, 270, 30,30);
            g.fillOval(660, 270, 30,30);
            g.fillOval(655, 270, 23,40);
            g.setColor(new Color(120,100,50));
            int x4[] = new int[] {659, 666, 672};
            int y4[] = new int[] {350, 275, 350};
            g.fillPolygon(x4, y4, 3);
            //pohon 3
            g.setColor(new Color (10,150,10));
            g.fillOval(985,230, 20,45);
            g.fillOval(980,250, 30,40);
            g.fillOval(970, 270, 30,30);
            g.fillOval(990, 270, 30,30);
            g.fillOval(985, 272, 23,30);
            g.setColor(new Color(120,100,50));
            int x6[] = new int[] {989, 996, 1002};
            int y6[] = new int[] {350, 275, 350};
            g.fillPolygon(x6, y6, 3);
            //pohon dekat rumah 1
            g.setColor(new Color (20,148,18));
            g.fillOval(345,500, 20,45);
            g.fillOval(340,520, 30,40);
            g.fillOval(330, 540, 30,30);
            g.fillOval(350, 540, 30,30);
            g.fillOval(345, 540, 23,40);
            g.setColor(new Color(120,100,50));
            int dx1[] = new int[] {349, 356, 362};
            int dy1[] = new int[] {620, 530, 620};
            g.fillPolygon(dx1, dy1, 3);
            //pohon dekat rumah 2
            g.setColor(new Color (20,148,18));
            g.fillOval(200,500, 20,45);
            g.fillOval(199,520, 30,40);
            g.fillOval(185, 540, 30,30);
            g.fillOval(205, 540, 30,30);
            g.fillOval(200, 540, 23,40);
            g.setColor(new Color(120,100,50));
            int dx2[] = new int[] {204, 211, 218};
            int dy2[] = new int[] {620, 530, 620};
            g.fillPolygon(dx2, dy2, 3);
            //pohon dekat rumah 3
            g.setColor(new Color (20,148,18));
            g.fillOval(55,500, 20,45);
            g.fillOval(54,520, 30,40);
            g.fillOval(40, 540, 30,30);
            g.fillOval(60, 540, 30,30);
            g.fillOval(55, 540, 23,40);
            g.setColor(new Color(120,100,50));
            int dx3[] = new int[] {59, 66, 73};
            int dy3[] = new int[] {620, 530, 620};
            g.fillPolygon(dx3, dy3, 3);
            //========== mobil 1=======
            g.setColor(Color.red);
            g.fillRect(205,305,100,30 ); //badan bawah
            g.fillOval(207,278,104,45); //badan atas
            g.setColor(new Color(100,20,250));
            g.fillRect(210,305,100,30 ); //badan bawah
            g.fillOval(210,280,100,45); //badan atas
            g.fillArc (180,298,60,70,0,180);// atas ban
            g.fillArc (285,298,60,70,0,180);// atas ban
            g.setColor(Color.yellow);
            g.fillArc (318,301,23,23,0,80);// atas ban
            g.setColor(Color.red);
            g.fillArc(180,311,20,20,110,100);// atas ban
            g.setColor(new Color(64,64,64)); //ban
            g.fillOval(198, 313, 32,32); //ban
            g.fillOval(298, 313, 32,32); //ban
            g.setColor(Color.black); //ban
            g.fillOval(204, 319, 20,20); //ban
            g.fillOval(304, 319, 20,20); //ban
            g.fillArc (230,285,70,40,0,90);// atas ban
            g.fillArc (234,286,64,36,0,90);// atas ban
            g.fillArc (220,285,70,40,90,90);// atas ban
            g.fillArc (223,286,68,36,90,90);// atas ban
            g.setColor(Color.red);
            g.fillRect(258,286,10,18 );
            //========== mobil 2=======
            g.setColor(new Color(130,14,50));
            g.fillRect(805,280,100,30 ); //badan bawah
            g.fillOval(807,254,104,45); //badan atas
            g.setColor(new Color(100,255,100));
            g.fillRect(810,280,100,30 ); //badan bawah
            g.fillOval(810,255,100,45); //badan atas
            g.fillArc (780,273,60,70,0,180);// atas ban
            g.fillArc (885,273,60,70,0,180);// atas ban
            g.setColor(Color.red);
            g.fillArc (925,284,23,23,0,80);// atas ban
            g.setColor(Color.yellow);
            g.fillArc(780,289,20,20,110,100);// atas ban
            g.setColor(new Color(64,64,64));//ban
            g.fillOval(798, 288, 32,32); //ban
            g.fillOval(898, 288, 32,32); //ban
            g.setColor(Color.black); //ban
            g.fillOval(804, 294, 20,20); //ban
            g.fillOval(904, 294, 20,20); //ban
            g.fillArc (830,260,70,40,0,90);// atas ban
            g.fillArc (834,261,64,36,0,90);// atas ban
            g.fillArc (820,260,70,40,90,90);// atas ban
            g.fillArc (823,261,68,36,90,90);// atas ban
            g.setColor(new Color(100,255,100));
            g.fillRect(858,261,10,18 );
            //=====Warna Awan====
            g.setColor(Color.white);
            //=== gambar Awan 1 ===
            g.fillOval(30,50,90,40);
            g.fillOval(70,70,90,40);
            g.fillOval(40, 60, 50,50);
            g.fillOval(90, 60, 50,50);
            //=== gambar Awan 2 ===
            g.fillOval(210,70,90,40);
            g.fillOval(250,50,90,40);
            g.fillOval(220, 50, 50,50);
            g.fillOval(270, 50, 50,50);
            g.fillOval(210,90,90,40);
            g.fillOval(250,70,90,40);
            g.fillOval(220, 70, 50,50);
            g.fillOval(270, 70, 50,50);
            //=== gambar Awan 3 ===
            g.fillOval(700,20,90,40);
            g.fillOval(750,20,90,40);
            g.fillOval(710,10, 60,60);
            g.fillOval(768,10, 50,50);
            //=== gambar Awan 4 ===
            g.fillOval(960,50,90,40);
            g.fillOval(970,50,90,40);
            g.fillOval(985,40, 50,50);
            g.fillOval(999,40, 50,50);
            Graphics2D g2 = (Graphics2D)g;
            g2.setStroke(new BasicStroke(3.0f));
            Font font = new Font("Tahoma", Font.BOLD|Font.PLAIN|Font.ITALIC, 25);
            {
                FontRenderContext frc = g2.getFontRenderContext();
                GlyphVector gv = font.createGlyphVector(frc, "KELOMPOK 1");

                //Shape glyph = gv.getOutline(50,80);
                Shape glyph = gv.getOutline(600,420);
                g2.setStroke(new BasicStroke(3.0f));
                g2.rotate(Math.toRadians(0), 100, 100);
                g2.draw(glyph);
                g2.setColor(Color.RED);
                g2.setFont(new Font("Tahoma", Font.BOLD, 18)); 
                g2.drawString("ilustrasi 2D",20,30);
                g2.drawString("Angga Kurnia - 201011401198",600,465);
                g2.drawString("Erni - 201011400071",600,490);
                g2.drawString("Stevianus Imanuel S - 201011401550",600,515);
                g2.drawString("Unggul Prasetyo U - 201011401212",600,540);
                g2.fill(glyph);
            }
        }
    }
    
}
