package AhorcadoTDD;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


/**
 * Clase para crear un nuevo panel con los elementos graficos del ahorcado
 */
public class PanelAhorcado extends JPanel
{

    /**
     * Representa la ventana principal del programa
     */
    private InterfazAhorcado principal;

    /**
     * Etiqueta que contiene el dibujo del estado del ahorcado
     */
    private JLabel dibujo;

    /**
     * Etiqueta que contiene el mensaje del estado del juego
     */
    private JLabel labMensaje;

    /**
     * Etiqueta que contiene los campos de la palabra a adivinar
     */
    private JLabel labPalabra;

    /**
     * Etiqueta que contiene la cantidad de jugadas que quedan
     */
    private JLabel disponibles;


    /**
     * Crea un nuevo panel con los elementos gráficos del ahorcado
     */
    public PanelAhorcado( InterfazAhorcado interfaz )
    {

        principal = interfaz;

        disponibles = new JLabel( );
        dibujo = new JLabel( );
        labPalabra = new JLabel( );
        labMensaje = new JLabel( );

        inicializarElementos( );

    }

    /**
     * Inicializa y dispone los elementos de la interfaz en el panel
     */
    private void inicializarElementos( )
    {
        // GridbagConstraints para el label disponibles
        GridBagConstraints gridBagConstraints0 = new GridBagConstraints( );
        gridBagConstraints0.gridx = 0;
        gridBagConstraints0.gridy = 0;
        gridBagConstraints0.weighty = 0.2D;

        // GridBagConstraints para el label de dibujo
        GridBagConstraints gridBagConstraints1 = new GridBagConstraints( );
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 1;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.VERTICAL;

        // GridbagConstraints para el label del mensaje
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints( );
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 2;
        gridBagConstraints2.fill = java.awt.GridBagConstraints.HORIZONTAL;

        // GridBagConstraints para el label de palabra
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints( );
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 3;
        gridBagConstraints3.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints3.weightx = 1.0D;
        gridBagConstraints3.weighty = 0.3D;

        setLayout( new GridBagLayout( ) );

        disponibles.setText( "" );

        dibujo.setText( "" );
        dibujo.setVerticalAlignment( javax.swing.SwingConstants.BOTTOM );
        dibujo.setHorizontalAlignment( javax.swing.SwingConstants.CENTER );

        labMensaje.setText( "" );
        labMensaje.setAlignmentX( 0.0F );
        labMensaje.setForeground( java.awt.Color.red );
        labMensaje.setFont( new java.awt.Font( "Dialog", java.awt.Font.BOLD, 18 ) );
        labMensaje.setHorizontalAlignment( javax.swing.SwingConstants.CENTER );

        labPalabra.setFont( new java.awt.Font( "Dialog", java.awt.Font.BOLD, 18 ) );
        labPalabra.setForeground( java.awt.Color.blue );

        // Agregar los labels al panel
        add( disponibles, gridBagConstraints0 );
        add( dibujo, gridBagConstraints1 );
        add( labMensaje, gridBagConstraints2 );
        add( labPalabra, gridBagConstraints3 );

        actualizar( );

    }

    /**
     * Este método se usa para actualizar la pantalla, cambiando el dibujo y la palabra que se quiere descubrir
     */
    public void actualizar( )
    {
    
        // Actualizar la palabra
        ArrayList palabra = principal.darLetras( );
        StringBuffer sb = new StringBuffer( "" );
        int i = 0;
        int tam = palabra.size( );

        while( i < tam )
        {
            Letra letra = ( Letra )palabra.get( i );
            sb.append( " " + letra.getLetra( ) + " " );
            i++;
        }

        labPalabra.setText( sb.toString( ).trim( ) );

        // Cambiar el mensaje de estado
        int estado = principal.darEstado( );
        if( estado == Juego.GANADOR )
        {
            labMensaje.setText( "Palabra adivinada!" );
        }
        else if( estado == Juego.AHORCADO )
        {
            labMensaje.setText( "AHORCADO!!!!" );
        }
        validate( );
    }

    /**
     * Este método se usa para cargar la información de la imagen Pre: La imagen existe 
     */
    private byte[] cargarImagen( String nombreImagen ) throws IOException
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream( );
        FileInputStream fin = new FileInputStream( nombreImagen );
        int data = 0;
        while( data != -1 )
        {
            data = fin.read( );
            baos.write( data );
        }

        return baos.toByteArray( );
    }

    /**
     * Cambia el valor del mensaje del estado del juego 
     */
    public void actualizarEtiquetaMensaje( String mensaje )
    {
        labMensaje.setText( mensaje );
    }
}
