package com.planfelipe.Controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import com.planfelipe.vistas.GestionFeligres;


public class ControlValidacionFeligreses implements KeyListener{
	private GestionFeligres es;
	private String cu;
	
	
	public ControlValidacionFeligreses(GestionFeligres es,String cu) {
		
		this.es = es;
		this.cu = cu;
			
	}

	
	public void keyTyped(KeyEvent arg0) {
		
			
			char key = arg0.getKeyChar();
		
			if(cu.equals("textFieldCed")){		
		
				String text = es.textFieldCedFe.getText();
				char[] cadena;
				
				if(text.equals("")){
					 cadena = " ".toCharArray();
				}else{
				cadena = text.toCharArray();
				}
				
			
				if(cadena[0] < 'E' || cadena[0] > 'V'){			
				
				if((key !='V')&&(key !='E')){
															
					arg0.consume();
					
					if(!(key < '0' || key > '9')){
						
						 JOptionPane.showMessageDialog(null, "Primero debe especificar nacionalidad, ejemplo='V-12345678'");
					}
					
				}else{
					if(text.equals("")){
					es.textFieldCedFe.setText(key+"-");;
					arg0.consume();
					}else{
						if(key=='V'){
							if(es.textFieldCedFe.getText().length()>9){
							
								String	te2 = key+text.substring(0,9);; 	
							
							
								es.textFieldCedFe.setText(te2);
								
								arg0.consume();
								
							}
							
						}
						
					}
				}
			
			}else{
				
				if(!(key < '0' || key > '9')){
													
					if(cadena[0]=='V'){
						
						if(!(text.length()<=9)){
							arg0.consume();
							
						}
					}
					else{
						if(!(text.length()<=14)){
							arg0.consume();
							
						}
						
					}
					
					
										
				}else{
					arg0.consume();
				}
			}
				
			
				
			
			
			}
		
	}
	
	
	
	
	
	
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		String text = es.textFieldCedFe.getText();
		char[] cadena;
		
		if(text.equals("")){
			 cadena = " ".toCharArray();
		}else{
		cadena = text.toCharArray();
		}
		
		if(arg0.getKeyCode()== KeyEvent.VK_BACK_SPACE){
		
			if(cadena[1]=='-'&&es.textFieldCedFe.getSelectionStart()==2){
				arg0.consume();			
			}
			if(cadena[0]=='-'&&es.textFieldCedFe.getSelectionStart()==1){
				arg0.consume();			
			}
		}
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	
	
}
