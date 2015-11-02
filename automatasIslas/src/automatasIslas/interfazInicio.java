package automatasIslas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.*;

public class interfazInicio extends JPanel implements Runnable{
private Tablero tab;
private Image background1;
private Image tituloJuego; // SI tenemos el background del titulo del juego entonces lo ponemos aqui
private JButton boton inicioJuego; 

public interfazInicio(){
setBackgound(Color.WHITE);
setDoubleBuffered(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);

background1 =  new ImageIcon(this.getClass().getResource("/img/background.jpg")).getImage();
tituloJuego =  new ImageIcon(this.getClass().getResource(" path donde esta el titulo del juego")).getImage();

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
        inicioJuego.addActionListener(this);

}
public void actionPerformed(ActionEvent e){
if(e.getSource()== inicioJuego){
this.tab = new run();

}

}


}