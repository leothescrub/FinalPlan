package com.planfelipe.Controlador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.planfelipe.vistas.GestionFeligres;
import com.planfelipe.vistas.GestionGrupoBiblico;
import com.planfelipe.vistas.PantallaMain;

public class Control_PantallaMain implements MouseListener{
	
	private PantallaMain es;
	private String cu;
	private GestionGrupoBiblico gru = new GestionGrupoBiblico();
	private GestionFeligres fe = new GestionFeligres();
	
	public Control_PantallaMain(PantallaMain es,String cu) {
		
		this.es = es;
		this.cu = cu;
			
	}

	public void mouseEntered(MouseEvent arg0) {
		
		if(cu.equals("GruposBiblicos")){
			
			es.mnGestionarGruposBiblicos.setForeground(Color.RED);
			
		}
		if(cu.equals("feligreses")){
			
			es.mnGestionarFeligrs.setForeground(Color.RED);
			
		}
		if(cu.equals("Reportes")){
			
			es.mnGestionarReportes.setForeground(Color.RED);
			
		}
		if(cu.equals("OpcionesSistema")){
			
			es.mnOpcionesDelSistema.setForeground(Color.RED);
			
		}
		
		if(cu.equals("Acerca")){
			
			es.mnNewAcerca.setForeground(Color.RED);
			
		}
	}


	public void mouseExited(MouseEvent arg0) {
		
		if(cu.equals("GruposBiblicos")){
			
			es.mnGestionarGruposBiblicos.setForeground(Color.BLACK);
			
		}
		if(cu.equals("feligreses")){
			
			es.mnGestionarFeligrs.setForeground(Color.BLACK);
			
		}
		if(cu.equals("Reportes")){
			
			es.mnGestionarReportes.setForeground(Color.BLACK);
			
		}
		if(cu.equals("OpcionesSistema")){
			
			es.mnOpcionesDelSistema.setForeground(Color.BLACK);
			
		}
		if(cu.equals("Acerca")){
			
			es.mnNewAcerca.setForeground(Color.BLACK);
			
		}
		
	}

	
	public void mousePressed(MouseEvent arg0) {
	

		if(cu.equals("GruposBiblicos")){
			Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	        //para obtener las dimensiones de la pantalla
	        Dimension dimen = gru.getSize();
	        //igual pero para la ventana
	        gru.setLocation(
	            (pantalla.width - dimen.width) / 2,
	            (pantalla.height - dimen.height) / 2);
			gru.setVisible(true);
			es.setVisible(false);
			
		}
		if(cu.equals("feligreses")){
		
			Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	        //para obtener las dimensiones de la pantalla
	        Dimension dimen = fe.getSize();
	        //igual pero para la ventana
	        fe.setLocation(
	            (pantalla.width - dimen.width) / 2,
	            (pantalla.height - dimen.height) / 2);
			fe.setVisible(true);
			es.setVisible(false);
			
		}
		if(cu.equals("Reportes")){
			
		
			
		}
		if(cu.equals("OpcionesSistema")){
			
		
			
		}
		if(cu.equals("Acerca")){
			
	
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
