package automatasIslas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Tablero extends JPanel implements Runnable {
private interfazInicio inicioInter;
private Thread hilo;
private final ImageIcon background;
//para poner cada imagen de cada cosa que vaya en el juego basta con un private Image nombre_de_la_imagen_en_escena
private final ImageIcon personaje;
private final ImageIcon letra_A;
private final ImageIcon letra_E;
private final ImageIcon letra_I;
private final ImageIcon letra_O;
private final ImageIcon letra_U;
private final ImageIcon suelo_sobre_todo;
private final ImageIcon suelo_cada_letra;
private int x_personaje, y_personaje, x_letra_A, y_letra_A, x_letra_E, y_letra_E, x_letra_I, y_letra_I; 
private int x_letra_O, y_letra_O, x_letra_U, y_letra_U, x_letra_suelo_st, y_letra_suelo_st; 
private int x_letra_cl_a, y_letra_cl_a,x_letra_cl_e, y_letra_cl_e, x_letra_cl_i, y_letra_cl_i, x_letra_cl_o, y_letra_cl_o,x_letra_cl_u, y_letra_cl_u;
private final int DELAY=5;

//Este es el constructor del panel donde se pone el background, imagenes del personaje, entre otras configuraciones iniciales
public Tablero(){
	//Aqui se encuentra la imagen que se pondra de background de inicio
setBackground(Color.WHITE); 
setDoubleBuffered(true);

background = new ImageIcon(this.getClass().getResource("/automatasIslas.imagenes/fondo.jpg").getFile());
/*personaje = new ImageIcon(this.getClass().getResource("path_donde_va_personaje").getImage());
letra_A = new ImageIcon(this.getClass().getResource("/imagenes/pj").getImage());
letra_E = new ImageIcon(this.getClass().getResource("path_donde_va_letra").getImage());
letra_I = new ImageIcon(this.getClass().getResource("path_donde_va_letra").getImage());
letra_O = new ImageIcon(this.getClass().getResource("path_donde_va_letra").getImage());
letra_U = new ImageIcon(this.getClass().getResource("path_donde_va_letra").getImage());*/
suelo_sobre_todo = new ImageIcon(this.getClass().getResource("path donde va suelo_sobre_todo"));
suelo_cada_letra = new ImageIcon(this.getClass().getResource("path_donde_suelo cada letra "));
personaje = new ImageIcon(this.getClass().getResource("/imagenes/pj.png").getFile());
letra_A =  new ImageIcon(this.getClass().getResource("imagenes/letraA.png").getFile());
letra_E = new ImageIcon(this.getClass().getResource("imagenes/letraE.png").getFile());
letra_I = new ImageIcon(this.getClass().getResource("imagenes/letraI.png").getFile());
letra_O = new ImageIcon(this.getClass().getResource("imagenes/letraO.png").getFile());
letra_U = new ImageIcon(this.getClass().getResource("imagenes/letraU.png").getFile());
//run();

}

    public void addNotify(){
    super.addNotify();
    hilo = new Thread(this);
    hilo.start();

    }

//Metodo que se encarga de dibujar en el panel 
public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        //Dibujamos
        g2.drawImage(background, 0, 0, null);
        //para porner una imagen en la pantalla del tablero basta con poner en codigo g2.drawImage(nombre_de_la_imagen, x, y, null);
        //donde x y ya pueden ser modificadas para que ser utilizadas como controles o cualquier cosa de posicionamiento de cualquier cosa
       Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    //metodo que se encarga de la actualizacion de los movimientos en x y en y 
    public void ciclo(){
    	//en esta parte se modifica X y Y pueden modificar todo este metodo que en si no esta del todo bien para que sea
    	//usado por alguien para jugar

    	//se debe modificar bien cada suelo y letra para cada imagen cargada.

    	x_letra_suelo_st = 0;
    	y_letra_suelo_st = 3;

        x_letra_cl_a = x_letra_A - 3;
        y_letra_cl_a = y_letra_A - 3;

        x_letra_cl_e = x_letra_E - 3;
        y_letra_cl_e = y_letra_E -3;
        
        x_letra_cl_i = x_letra_I - 3;
        y_letra_cl_i = y_letra_I - 3;

        x_letra_cl_o = x_letra_O - 3;
        y_letra_cl_o = y_letra_O - 3;
        
        x_letra_cl_u = x_letra_U - 3;
        y_letra_cl_u = y_letra_U - 3;

    	x_personaje = 1;
    	y_personaje = 2;

    	if(x_personaje == x_letra_A && y_personaje == y_letra_A){
    		this.letra_A.equals(null);
    	}

    	if(x_personaje == x_letra_E && y_personaje == y_letra_E){
    		this.letra_E.equals(null);
    	}

    	if(x_personaje == x_letra_I && y_personaje == y_letra_I){
    		this.letra_I.equals(null);
    	}

    	if(x_personaje == x_letra_O && y_personaje == y_letra_O){
    		this.letra_O.equals(null);
    	}

    	if(x_personaje == x_letra_U && y_personaje == y_letra_U){
    		this.letra_U.equals(null);
    	}

    }

    //metodo definido por la interfaz runnable 	aqui ira el ciclo de todo el juego 
        public void run() {
            while(true){
           // ciclo();
            repaint();
                try{    
                    Thread.sleep(DELAY);
               }catch(InterruptedException err){System.out.println(err);}

            }
        }


} 

