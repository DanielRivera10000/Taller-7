package uniandes.dpoo.taller7.interfaz1;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import uniandes.dpoo.taller7.modelo.RegistroTop10;
import uniandes.dpoo.taller7.modelo.Tablero;
import uniandes.dpoo.taller7.modelo.Top10;


public class PanelResultado extends JPanel implements ActionListener
{
	
	private JPanel panelInfo;
	
	private JLabel lblNumeroJugadas;
    private JLabel lblNombreJugador;
    
    private JTextField txtNumeroJugadas;
    private JTextField txtNombreJugador;
	
	private VentanaPrincipal principal;
	
	public PanelResultado(VentanaPrincipal pPrincipal)
	
	{
		principal = pPrincipal;
	    setLayout( new BorderLayout( ) );
	    
	    panelInfo = new JPanel( );
        add(panelInfo, BorderLayout.CENTER);
        
        panelInfo.setLayout( new GridLayout( 1, 4 ) );
        panelInfo.setBorder( new TitledBorder( "" ) );
        
        lblNumeroJugadas= new JLabel( "Jugadas: " );
        panelInfo.add( lblNumeroJugadas );
        txtNumeroJugadas=new JTextField("0" );
        panelInfo.add( txtNumeroJugadas );
        txtNumeroJugadas.setEditable( false );
        
        lblNombreJugador= new JLabel( "Jugadas: " );
        panelInfo.add( lblNombreJugador );
        txtNombreJugador=new JTextField("0" );
        panelInfo.add( txtNombreJugador );
        txtNombreJugador.setEditable( false );
        
	}
	
	

	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	
	
	public void actualizar(RegistroTop10 jugador)
    
	{
    	
    	txtNumeroJugadas.setText(jugador.darNombre());
    	
    }


}






    

 
    
    
    
    
