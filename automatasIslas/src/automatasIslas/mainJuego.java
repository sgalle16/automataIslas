package automatasIslas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class mainJuego extends javax.swing.JFrame /*JFrame*/{
      private String nombre = "";   
     public mainJuego(){
        //Titulo del juego, por ahora lo llamare A.E.I.O.U.
        setTitle("A.E.E.O.U");
	
	//CERRAR CON CLICK 
	setDefaultCloseOperation(EXIT_ON_CLOSE);	
	
	//Tamaño ventana 
	setSize(700,700);

	//Localizacion de la ventana
	setLocationRelativeTo(null);

	//Si se puede redimenzionar la pantalla
	setResizable(false);
	
	//El objeto tablero es donde se dibujara nuestro juego, este hereda de JPanel y swing
	add(new Tablero());
	
	setVisible(true);
        
        /*
        try {
            while (nombre.equals("")) {
                nombre = JOptionPane.showInputDialog("¿Nombre del Participante?");
             
            }
            //reiniciar(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ADIOS", "TRIQUISM", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }*/
   
}
     /*
     //Este es el main que busca java para poder ejecutar el programa
     public static void main(String args[]){
        new mainJuego().setVisible(true);			
     }  */
     
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new mainJuego().setVisible(true);
            }
        });
    }
}
