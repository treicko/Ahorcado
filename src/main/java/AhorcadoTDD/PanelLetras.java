package AhorcadoTDD;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * Clase que permite crear un panel con las letras del alfabeto
 */
public class PanelLetras extends JPanel implements ActionListener
{

   
    /**
     * Representa la ventana pricipal de la aplicación
     */
    private InterfazAhorcado principal;

  
    /**
     * Crea un nuevo panel con las letras del alfabeto
     */
    public PanelLetras( InterfazAhorcado interfaz )
    {
        principal = interfaz;
        setLayout( new GridLayout( 4, 7 ) );
        ArrayList botones = inicializarBotones( );

        int contador = 0;
        while( contador < botones.size( ) )
        {
            JButton boton = ( JButton )botones.get( contador );
            add( boton );
            contador++;
        }

        setBorder( new CompoundBorder( new EmptyBorder( 15, 15, 60, 15 ), new TitledBorder( "" ) ) );

    }

   
    /**
     * Inicializa los botones de las letra
     */
    private ArrayList inicializarBotones( )
    {
        ArrayList botones = new ArrayList( );
        for( int i = 'A'; i <= 'Z'; i++ )
        {
            String letra = String.valueOf( ( char )i );
            JButton boton = new JButton( letra );

            boton.setActionCommand( letra );
            boton.setPreferredSize( new java.awt.Dimension( 30, 50 ) );
            boton.setMargin( new java.awt.Insets( 3, 3, 3, 3 ) );
            boton.setForeground( java.awt.Color.blue );
            boton.setMaximumSize( new java.awt.Dimension( 30, 50 ) );
            boton.setMinimumSize( new java.awt.Dimension( 30, 50 ) );
            boton.addActionListener( this );
            botones.add( boton );
        }
        return botones;
    }

    /**
     * Realiza la acción de jugar con la letra especificada <br>
     */
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );
        principal.jugarLetra( comando.charAt(0) );
    }

}
