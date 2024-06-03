package uniandes.dpoo.taller7.interfaz1;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import uniandes.dpoo.taller7.modelo.RegistroTop10;
import uniandes.dpoo.taller7.modelo.Tablero;
import uniandes.dpoo.taller7.modelo.Top10;





public class VentanaPrincipal extends JFrame

{
	private PanelJuego panelLuces;
	private PanelDificultad panelArriba;
	private PanelOpciones panelDerecha;
	private PanelResultado panelAbajo;
	
	
	public VentanaPrincipal()
	{
		setSize( 750, 600 );
        setTitle( "LightsOut" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        
        setLayout(new BorderLayout( ) );
        
        panelDerecha= new PanelOpciones(this);
        add(panelDerecha, BorderLayout.EAST);
        
        panelAbajo = new PanelResultado(this);
        add(panelAbajo, BorderLayout.SOUTH);
        
        panelArriba = new PanelDificultad(this);
        add(panelArriba, BorderLayout.NORTH);
        
        
        Tablero tablero = new Tablero( 9 );
        panelLuces = new PanelJuego( tablero.darTablero( ) );
        add(panelLuces, BorderLayout.WEST);
        
	}
	

    public void dispose()
    {
        JOptionPane.showMessageDialog( this, "se guardó la aplicación" );
        System.exit( 0 );
    }
    
    public static void main(String[] args)
    {
        VentanaPrincipal ventana = new VentanaPrincipal( );
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
    }
    
    
    
    
    
    
    
    public void mostrarTop()
    {
        try
        {
        	//Top10 jugadores = Top10.salvarRecords();
            //panelDerecha.actualizar( jugadores );
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( this, " ya se encuentra en la última obra", "titulo caulquiera", JOptionPane.ERROR_MESSAGE );
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
	
    
 











