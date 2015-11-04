package automatasIslas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class interfazInicio extends JPanel /*implements Runnable*/{
private Tablero tab;
private Image background1;
private Image tituloJuego; // SI tenemos el background del titulo del juego entonces lo ponemos aqui
JButton inicioJuego; 

public interfazInicio(){
    
setBackground(Color.WHITE);
setDoubleBuffered(true);
//setDefaultCloseOperation(EXIT_ON_CLOSE);

background1 =  new ImageIcon(this.getClass().getResource("direccion de la imagen")).getImage();
tituloJuego =  new ImageIcon(this.getClass().getResource(" direccion de la imagen")).getImage();

}

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
            g2.drawImage(background1, 0,0, null);
            g2.drawImage(tituloJuego, 350, 350, null);
            Toolkit.getDefaultToolkit().sync();
            g.dispose();

            this.inicioJuego = new JButton("Iniciar");
            this.inicioJuego.setBounds(300,250,100,30);
            add(inicioJuego);
            inicioJuego.addActionListener((ActionListener) this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== inicioJuego){
            add(new Tablero());
           
            }
        }
 }
