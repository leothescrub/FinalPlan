package com.planfelipe.vistas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.xswingx.PromptSupport;

import com.planfelipe.Controlador.Control_Login;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	public JTextField txtUsuario;
	public JPasswordField txtPass;


	/**
	 * Create the frame.
	 */
	
	public Login() {
		
		setResizable(false);
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/com/planfelipe/imagenes/pequen_o-Pagina-2016.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		txtUsuario.setBounds(400, 297, 281, 65);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		PromptSupport.setPrompt("Usuario", txtUsuario);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(400, 373, 281, 65);
		contentPane.add(txtPass);
		
		JButton btnNewButton = new JButton("");
	
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/com/planfelipe/imagenes/Button.png")));
		btnNewButton.addActionListener(new Control_Login(this, "Inicio"));
		btnNewButton.setBounds(329, 476, 346, 57);
		contentPane.add(btnNewButton);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setIcon(new ImageIcon(Login.class.getResource("/com/planfelipe/imagenes/flat-ui-login.png")));
		lblLogin.setBounds(246, 184, 498, 507);
		contentPane.add(lblLogin);
		
		JLabel lblHead = new JLabel("head");
		lblHead.setIcon(new ImageIcon(Login.class.getResource("/com/planfelipe/imagenes/banner-central123.png")));
		lblHead.setBounds(0, 0, 1008, 128);
		contentPane.add(lblHead);
		
		JLabel lblWall = new JLabel("WALL");
		lblWall.setIcon(new ImageIcon(Login.class.getResource("/com/planfelipe/imagenes/Captura.JPG")));
		lblWall.setBounds(0, 0, 1008, 729);
		contentPane.add(lblWall);
	}
}
