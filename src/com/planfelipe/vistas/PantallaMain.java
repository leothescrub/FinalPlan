package com.planfelipe.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class PantallaMain extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaMain frame = new PantallaMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public PantallaMain() {
		setTitle("Men\u00FA Principal");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PantallaMain.class.getResource("/com/planfelipe/imagenes/pequen_o-Pagina-2016.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("header");
		lblHeader.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/Menu Principal.png")));
		lblHeader.setBounds(0, 0, 1018, 67);
		contentPane.add(lblHeader);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 68, 1008, 66);
		contentPane.add(menuBar);
		
		JMenu mnGestionarGruposBiblicos = new JMenu("Gestionar Grupos B\u00EDblicos");
		mnGestionarGruposBiblicos.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/Grupo biblico.png")));
		menuBar.add(mnGestionarGruposBiblicos);
		
		JMenuItem mntmSomething = new JMenuItem("Something");
		mnGestionarGruposBiblicos.add(mntmSomething);
		
		JMenu mnGestionarFeligrs = new JMenu("Gestionar Feligr\u00E9s");
		mnGestionarFeligrs.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/command.png")));
		menuBar.add(mnGestionarFeligrs);
		
		JMenu mnGestionarReportes = new JMenu("Gestionar Reportes");
		mnGestionarReportes.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/business-report.png")));
		menuBar.add(mnGestionarReportes);
		
		JMenu mnOpcionesDelSistema = new JMenu("Opciones del Sistema");
		mnOpcionesDelSistema.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/management.png")));
		menuBar.add(mnOpcionesDelSistema);
		
		JMenu mnNewMenu = new JMenu("Acerca...");
		mnNewMenu.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/more.png")));
		menuBar.add(mnNewMenu);
		
		JLabel lblLogo = new JLabel("logo");
		lblLogo.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/slogan-transparente-2016.png")));
		lblLogo.setBounds(95, 159, 756, 533);
		contentPane.add(lblLogo);
		
		JLabel lblWallpaper = new JLabel("wallpaper");
		lblWallpaper.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/Background.png")));
		lblWallpaper.setBounds(0, 134, 1028, 606);
		contentPane.add(lblWallpaper);
	}
}
