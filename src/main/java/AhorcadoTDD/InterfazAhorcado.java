package AhorcadoTDD;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 * Clase principal de la aplicación.
 */
public class InterfazAhorcado extends JFrame
{

    /**
     * Panel que contiene las letras del alfabeto
     */
    private PanelLetras panelLetras;

    /**
     * Panel que contiene las representación graficas del juego
     */
    private PanelAhorcado panelAhorcado;

    /**
     * Representa el juego en curso
     */
    private Juego juego;

    /**
     * Panel que contiene los botones de las acciones sobre el juego
     */
    private PanelJuego panelJuego;


    /**
     * Esta es la ventana principal de la aplicación
     */
    public InterfazAhorcado( )
    {
        juego = new Juego( );
        juego.iniciarJuego("Sistemas");

        panelLetras = new PanelLetras( this );
        panelAhorcado = new PanelAhorcado( this );
        panelJuego = new PanelJuego( this );

        GridBagLayout gridbag1 = new GridBagLayout( );
        GridBagConstraints gbc1;
        setLayout( gridbag1 );

        gbc1 = new GridBagConstraints( 0, 0, 2, 1, 2, 2, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 30, 5, 5, 5 ), 0, 0 );
        add( panelLetras, gbc1 );

        gbc1 = new GridBagConstraints( 2, 0, 2, 3, 2, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 5, 50, 5, 50 ), 0, 0 );
        add( panelAhorcado, gbc1 );

        gbc1 = new GridBagConstraints( 2, 3, 1, 1, 0.5, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( -10, 10, 10, 0 ), 0, 0 );
        add( panelJuego, gbc1 );

        gbc1 = new GridBagConstraints( 4, 3, 1, 1, 0.5, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( -10, 0, 10, 0 ), 0, 0 );
        add( new JLabel( "" ), gbc1 );

        setSize( 620, 410 );
        setResizable( false );
        setTitle( "Cupi2 - Ahorcado" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        panelAhorcado.actualizar( );
    }


    /**
     * Realiza una jugada en el mundo con la letra que se recibe <br>
     */
    public void jugarLetra( char letra )
    {
        int estado = juego.darEstado( );
        if( estado == Juego.JUGANDO )
        {
            Letra jugada = new Letra( letra );
            if( !juego.jugarLetra( jugada ))
            {
                // error en la letra
                panelAhorcado.actualizarEtiquetaMensaje( "INCORRECTO" );
            }

            else
                panelAhorcado.actualizarEtiquetaMensaje( " " );

            panelAhorcado.actualizar( );
        }
    }

    /**
     * Inicia el juego
     */
    public void iniciarJuego( )
    {
        juego.iniciarJuego("Sistema");
        panelAhorcado.actualizarEtiquetaMensaje( " " );
        panelAhorcado.actualizar( );
    }

    /**
     * Retorna un vector de las letras que han sido jugadas
     */
    public ArrayList darLetras( )
    {
        return juego.darOcurrencias( );
    }

    /**
     * Retorna el estado del juego para saber si se esta jugando, si el juego se acabo, o si hubo un ganador
     */
    public int darEstado( )
    {
        return juego.darEstado( );
    }

}
