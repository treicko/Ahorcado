package AhorcadoTDD;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Panel con los botones del juego
 */
public class PanelJuego extends JPanel implements ActionListener
{

    /**
     * Constante de identificacion de action comand de INICIAR
     */
    private final static String INICIAR = "INICIAR";

    /**
     * Ventana principal del programa
     */
    private InterfazAhorcado principal;

    /**
     * Bot�n para iniciar un nuevo juego
     */
    private JButton botonIniciar;

    /**
     * Bot�n para terminar la aplicaci�n
     */
    private JButton botonSalir;

    /**
     * Crea el panel con los botones de acci�n sobre el juego
     */
    public PanelJuego( InterfazAhorcado interfaz )
    {
        principal = interfaz;
        botonIniciar = new JButton( );
        botonIniciar.setText( "Iniciar" );
        botonIniciar.setActionCommand( INICIAR );
        botonIniciar.addActionListener( this );

        GridBagLayout gridbag1 = new GridBagLayout( );
        setLayout( gridbag1 );

        GridBagConstraints gbc1;
        gbc1 = new GridBagConstraints( 0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( botonIniciar, gbc1 );

        gbc1 = new GridBagConstraints( 1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------
    /**
     * Realiza las acciones respectivas correspondientes al evento asociado al bot�n producto de interacci�n 
     */
    public void actionPerformed( ActionEvent evento )
    {
        String command = evento.getActionCommand( );
        if( command.equals( INICIAR ) )
        {
            principal.iniciarJuego( );
        }
    }
}
