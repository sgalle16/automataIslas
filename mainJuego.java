package automatasIslas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

 public class Main extend JFrame{
public Main(){
//Titulo del juego, por ahora lo llamare A.E.I.O.U.
	setTitle("A.E.E.O.U");

	//CERRAR CON CLICK 
	setDefaultCloseOperation(EXITO_ON_CLOSE);	

	//Tamaño ventana 
	setSize(700,700);

	//Localizacion de la ventana
	setLocationRelativeTo(null);

	//Si se puede redimenzionar la pantalla
	setResizable(false);

	//El objeto tablero es donde se dibujara nuestro juego, este hereda de JPanel y swing
	add(new Tablero());

   setVisible(true);

}
//Este es el main que busca java para poder ejecutar el programa
public static void main(String args[]){
new Main();			

}


 }