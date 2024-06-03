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


public class PanelDificultad extends JPanel implements ActionListener

{
	private JLabel lblTamaño;
	private JLabel lblDificultad;
	private JLabel lblFacil;
	private JLabel lblMedio;
	private JLabel lblDificil;


	private JCheckBox cbFacil;
	private JCheckBox cbMedio;
	private JCheckBox cbDificil;
	private JLabel lblEnProceso;

	private JTextField txtTamaño;

	private VentanaPrincipal principal;

	public PanelDificultad(VentanaPrincipal pPrincipal)
	{
	    
		
		principal = pPrincipal;
	    setLayout( new BorderLayout( ) );
	    setLayout( new GridLayout( 1, 6 ) );
	    
	    
	    lblTamaño= new JLabel( "Tamaño: " );
	    add(lblTamaño);
	    
	    txtTamaño=new JTextField("5x5");
	    add( txtTamaño );
	    txtTamaño.setEditable( true );
	    
	    lblDificultad= new JLabel( "Dificultad: " );
	    add(lblDificultad);
	    
	    lblFacil= new JLabel( "Facil" );
	    add(lblFacil);
	    
	    lblMedio= new JLabel( "Medio" );
	    add(lblMedio);
	    
	    lblDificil= new JLabel( "Dificil" );
	    add(lblDificil);
	    
	 
	    cbFacil= new JCheckBox(  );
	    add( cbFacil );
	    cbFacil.setEnabled( false );
	    cbFacil.setSelected( true );
	    
	    cbMedio= new JCheckBox(  );
	    add( cbMedio );
	    cbMedio.setEnabled( false );
	    cbMedio.setSelected( true );
	    
	    cbDificil= new JCheckBox(  );
	    add( cbDificil );
	    cbDificil.setEnabled( false );
	    cbDificil.setSelected( true );
	    
	    
	   
	    
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
















