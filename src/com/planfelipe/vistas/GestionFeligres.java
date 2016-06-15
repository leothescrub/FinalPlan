package com.planfelipe.vistas;


import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import org.jdatepicker.impl.JDatePickerImpl;
import com.planfelipe.Class.Calendario;
import com.planfelipe.Class.DateLabelFormatter;
import com.planfelipe.Class.JDatePickerImpl;
import com.planfelipe.Controlador.Control_GestionFeligreses;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionFeligres extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCed;
	public JDatePickerImpl textFieldFechaEntrega;
	public JDatePickerImpl textFieldFechaBautismo;
	private JTextField textFieldnombre;
	private JTextField textFieldApellido;
	private JTextField textFieldGrupoB;
	public JDatePickerImpl textFieldFechaNac;
	private JTextField textFieldLugarNac;
	private JTextField textFieldDir;
	private JTextField textFieldBarrio;
	private JTextField textFieldExp;
	private JTextField textFieldTel;
	public JDatePickerImpl textFieldFechaConver;
	private JTextField textFieldCreenciaAnt;
	private JTextField textFieldCodFelipe;
	public JDatePickerImpl textFieldFechaContacto;
	private JTextField textFieldProfesion;
	private JTextField textFieldOficio;
	private JTextField textFieldEmpresa;
	private JTextField textFieldObservaciones;
	private JTextField textFieldNomConyuge;
	private JTextField textFieldCIConyuge;
	private JTextField textFieldApellConyuge;
	private JTextField textFieldNumHijos;
	private JTextField textFieldGrupoEdit;
	private JTextField textFieldDirEdit;
	private JTextField textFieldBarrioEdit;
	private JTextField textFieldTelfEdit;
	public JMenu mnRegistrar;
	public JMenu mnBusqueda;
	public JMenuItem mntmRegresar;
	public JPanel panelPrincipal;
	public JPanel panelRegistro2;
	public JPanel panelRegistro1;
	public JPanel panelRegistro3;
	public JPanel panelModificacion;
	public JPanel panelBusqueda;
	
	
	private Calendario ca = new Calendario();

	
	/**
	 * Create the frame.
	 */
	public GestionFeligres() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestionFeligres.class.getResource("/com/planfelipe/imagenes/pequen_o-Pagina-2016.jpg")));
		setBounds(100, 100, 1010, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		panelBusqueda = new JPanel();
		panelBusqueda.setVisible(false);
		
		panelRegistro3 = new JPanel();
		panelRegistro3.setVisible(false);
		
		panelRegistro1 = new JPanel();
		panelRegistro1.setVisible(false);
		
		panelRegistro2 = new JPanel();
		panelRegistro2.setVisible(false);
		panelRegistro2.setBounds(0, 0, 1008, 729);
		contentPane.add(panelRegistro2);
		panelRegistro2.setLayout(null);
		
		
		textFieldTel = new JTextField();
		textFieldTel.setBounds(275, 168, 201, 36);
		panelRegistro2.add(textFieldTel);
		textFieldTel.setColumns(10);
		textFieldFechaConver = new JDatePickerImpl(ca.GetCalendario(), new DateLabelFormatter());
		SpringLayout springLayout = (SpringLayout) textFieldFechaConver.getLayout();
		springLayout.putConstraint(SpringLayout.SOUTH, textFieldFechaConver.getJFormattedTextField(), 0, SpringLayout.SOUTH, textFieldFechaConver);
		
		textFieldFechaConver.setBounds(275, 355, 201, 36);
		panelRegistro2.add(textFieldFechaConver);
		
			
			textFieldCreenciaAnt = new JTextField();
			textFieldCreenciaAnt.setBounds(275, 408, 201, 36);
			panelRegistro2.add(textFieldCreenciaAnt);
			textFieldCreenciaAnt.setColumns(10);
			
			textFieldFechaContacto = new JDatePickerImpl(ca.GetCalendario(),new DateLabelFormatter());
			textFieldFechaContacto.setBounds(684, 233, 201, 36);
			panelRegistro2.add(textFieldFechaContacto);
			
			
			textFieldCodFelipe = new JTextField();
			textFieldCodFelipe.setBounds(684, 168, 201, 36);
			panelRegistro2.add(textFieldCodFelipe);
			textFieldCodFelipe.setColumns(10);
			
			textFieldProfesion = new JTextField();
			textFieldProfesion.setBounds(684, 349, 201, 36);
			panelRegistro2.add(textFieldProfesion);
			textFieldProfesion.setColumns(10);
			
			textFieldOficio = new JTextField();
			textFieldOficio.setBounds(684, 408, 201, 36);
			panelRegistro2.add(textFieldOficio);
			textFieldOficio.setColumns(10);
			
			JComboBox comboBoxEstCivil = new JComboBox();
			comboBoxEstCivil.setBounds(275, 233, 201, 36);
			panelRegistro2.add(comboBoxEstCivil);
			
			JComboBox comboBoxOcup = new JComboBox();
			comboBoxOcup.setBounds(275, 291, 201, 36);
			panelRegistro2.add(comboBoxOcup);
			
			JComboBox comboBoxBautAntes = new JComboBox();
			comboBoxBautAntes.setBounds(275, 467, 201, 36);
			panelRegistro2.add(comboBoxBautAntes);
			
			JComboBox comboBoxCarta = new JComboBox();
			comboBoxCarta.setBounds(684, 467, 201, 36);
			panelRegistro2.add(comboBoxCarta);
			
			JComboBox comboBoxEdGeneral = new JComboBox();
			comboBoxEdGeneral.setBounds(684, 291, 201, 36);
			panelRegistro2.add(comboBoxEdGeneral);
			
			JLabel lblhead2 = new JLabel("New label");
			lblhead2.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/EncabezadoRegistroFeligreses.png")));
			lblhead2.setBounds(0, 0, 1008, 67);
			panelRegistro2.add(lblhead2);
			
			JLabel lblDatos = new JLabel("Datos personales, historia de f\u00E9, capacitaci\u00F3n cristiana y educaci\u00F3n general");
			lblDatos.setFont(new Font("Segoe UI", Font.PLAIN, 24));
			lblDatos.setBounds(99, 79, 801, 32);
			panelRegistro2.add(lblDatos);
			
			JLabel lblTelfono_1 = new JLabel("Tel\u00E9fono:");
			lblTelfono_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblTelfono_1.setBounds(192, 174, 63, 19);
			panelRegistro2.add(lblTelfono_1);
			
			JLabel lblEstadoCivil = new JLabel("Estado Civil:");
			lblEstadoCivil.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblEstadoCivil.setBounds(172, 239, 83, 14);
			panelRegistro2.add(lblEstadoCivil);
			
			JLabel lblOcupacin = new JLabel("Ocupaci\u00F3n:");
			lblOcupacin.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblOcupacin.setBounds(178, 295, 77, 19);
			panelRegistro2.add(lblOcupacin);
			
			JLabel lblFechaDeConversin = new JLabel("Fecha de conversi\u00F3n:");
			lblFechaDeConversin.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblFechaDeConversin.setBounds(112, 355, 144, 19);
			panelRegistro2.add(lblFechaDeConversin);
			
			JLabel lblCreenciaAnterior = new JLabel("Creencia anterior:");
			lblCreenciaAnterior.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblCreenciaAnterior.setBounds(134, 416, 122, 14);
			panelRegistro2.add(lblCreenciaAnterior);
			
			JLabel lblfueBautizadoEn = new JLabel("\u00BFFue bautizado en otra iglesia?:");
			lblfueBautizadoEn.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblfueBautizadoEn.setBounds(42, 471, 215, 22);
			panelRegistro2.add(lblfueBautizadoEn);
			
			JLabel lblcartaDeRecomendacin = new JLabel("\u00BFCarta de recomendaci\u00F3n?:");
			lblcartaDeRecomendacin.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblcartaDeRecomendacin.setBounds(486, 471, 188, 25);
			panelRegistro2.add(lblcartaDeRecomendacin);
			
			JLabel lblCdigoFelipe = new JLabel("C\u00F3digo Felipe:");
			lblCdigoFelipe.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblCdigoFelipe.setBounds(576, 171, 98, 25);
			panelRegistro2.add(lblCdigoFelipe);
			
			JLabel lblFechaDeContacto = new JLabel("Fecha de contacto:");
			lblFechaDeContacto.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblFechaDeContacto.setBounds(547, 239, 127, 14);
			panelRegistro2.add(lblFechaDeContacto);
			
			JLabel lblEducacinGeneral = new JLabel("Educaci\u00F3n general:");
			lblEducacinGeneral.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblEducacinGeneral.setBounds(545, 295, 129, 27);
			panelRegistro2.add(lblEducacinGeneral);
			
			JLabel lblProfesin = new JLabel("Profesi\u00F3n:");
			lblProfesin.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblProfesin.setBounds(605, 355, 69, 14);
			panelRegistro2.add(lblProfesin);
			
			JLabel lblOficioOCargo = new JLabel("Oficio o cargo:");
			lblOficioOCargo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblOficioOCargo.setBounds(576, 411, 100, 25);
			panelRegistro2.add(lblOficioOCargo);
			
			JButton btnRegresar2 = new JButton("New button");
			btnRegresar2.addActionListener(new Control_GestionFeligreses(this, "Regresar_2"));
			btnRegresar2.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/BotonRegresar.JPG")));
			btnRegresar2.setBounds(116, 563, 324, 61);
			panelRegistro2.add(btnRegresar2);
			
			JButton btnSiguiente2 = new JButton("New button");
			btnSiguiente2.addActionListener(new Control_GestionFeligreses(this, "Siguiente_2"));
			btnSiguiente2.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/BotonSiguiente.jpg")));
			btnSiguiente2.setBounds(571, 563, 324, 61);
			panelRegistro2.add(btnSiguiente2);
			
			JLabel lblAdvise = new JLabel("New label");
			lblAdvise.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/notification_ui_03.png")));
			lblAdvise.setBounds(255, 653, 523, 65);
			panelRegistro2.add(lblAdvise);
			
			JLabel lblWall2 = new JLabel("New label");
			lblWall2.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/Background.png")));
			lblWall2.setBounds(0, 66, 1008, 663);
			panelRegistro2.add(lblWall2);
		panelRegistro1.setBounds(0, 0, 1008, 729);
		contentPane.add(panelRegistro1);
		panelRegistro1.setLayout(null);
		
		textFieldCed = new JTextField();
		textFieldCed.setBounds(275, 168, 201, 36);
		panelRegistro1.add(textFieldCed);
		textFieldCed.setColumns(10);
		
	
		
		textFieldFechaEntrega = new JDatePickerImpl(ca.GetCalendario(),new DateLabelFormatter());
		textFieldFechaEntrega.setBounds(275, 231, 201, 36);
		panelRegistro1.add(textFieldFechaEntrega);
		
		textFieldFechaBautismo = new JDatePickerImpl(ca.GetCalendario(),new DateLabelFormatter());
		textFieldFechaBautismo.setBounds(275, 289, 201, 36);
		panelRegistro1.add(textFieldFechaBautismo);
		
		
		textFieldnombre = new JTextField();
		textFieldnombre.setBounds(275, 349, 201, 36);
		panelRegistro1.add(textFieldnombre);
		textFieldnombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(275, 408, 201, 36);
		panelRegistro1.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldGrupoB = new JTextField();
		textFieldGrupoB.setBounds(275, 467, 201, 36);
		panelRegistro1.add(textFieldGrupoB);
		textFieldGrupoB.setColumns(10);
		
		textFieldFechaNac = new JDatePickerImpl(ca.GetCalendario(),new DateLabelFormatter());
		textFieldFechaNac.setBounds(684, 168, 201, 36);
		panelRegistro1.add(textFieldFechaNac);
		
			
			textFieldLugarNac = new JTextField();
			textFieldLugarNac.setBounds(684, 231, 201, 36);
			panelRegistro1.add(textFieldLugarNac);
			textFieldLugarNac.setColumns(10);
			
			textFieldDir = new JTextField();
			textFieldDir.setBounds(684, 349, 201, 36);
			panelRegistro1.add(textFieldDir);
			textFieldDir.setColumns(10);
			
			textFieldBarrio = new JTextField();
			textFieldBarrio.setBounds(684, 408, 201, 36);
			panelRegistro1.add(textFieldBarrio);
			textFieldBarrio.setColumns(10);
			
			textFieldExp = new JTextField();
			textFieldExp.setBounds(684, 467, 201, 36);
			panelRegistro1.add(textFieldExp);
			textFieldExp.setColumns(10);
			
			JComboBox comboBoxSexo = new JComboBox();
			comboBoxSexo.setBounds(684, 289, 201, 36);
			panelRegistro1.add(comboBoxSexo);
			
			JLabel lblGrupoBiblico = new JLabel("Grupo B\u00EDblico:");
			lblGrupoBiblico.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblGrupoBiblico.setBounds(159, 473, 97, 19);
			panelRegistro1.add(lblGrupoBiblico);
			
			JLabel lblHeader2 = new JLabel("");
			lblHeader2.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/EncabezadoRegistroFeligreses.png")));
			lblHeader2.setBounds(0, 0, 1008, 67);
			panelRegistro1.add(lblHeader2);
			
			JLabel lblentrega = new JLabel("Fecha de entrega de la hoja de vida:");
			lblentrega.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblentrega.setBounds(10, 235, 253, 22);
			panelRegistro1.add(lblentrega);
			
			JLabel lblDatosIniciales = new JLabel("Datos personales");
			lblDatosIniciales.setFont(new Font("Segoe UI", Font.PLAIN, 24));
			lblDatosIniciales.setBounds(400, 78, 201, 31);
			panelRegistro1.add(lblDatosIniciales);
			
			JLabel lblBautismo = new JLabel("Fecha de bautismo:");
			lblBautismo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblBautismo.setBounds(126, 295, 139, 22);
			panelRegistro1.add(lblBautismo);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNombre.setBounds(196, 353, 67, 22);
			panelRegistro1.add(lblNombre);
			
			JLabel lblApellido = new JLabel("Apellido:");
			lblApellido.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblApellido.setBounds(196, 414, 67, 19);
			panelRegistro1.add(lblApellido);
			
			JLabel lblCedula = new JLabel("Cedula de identidad:");
			lblCedula.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblCedula.setBounds(116, 176, 146, 14);
			panelRegistro1.add(lblCedula);
			
			JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
			lblFechaDeNacimiento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblFechaDeNacimiento.setBounds(520, 171, 154, 25);
			panelRegistro1.add(lblFechaDeNacimiento);
			
			JLabel lblSexo = new JLabel("Sexo:");
			lblSexo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblSexo.setBounds(628, 298, 46, 14);
			panelRegistro1.add(lblSexo);
			
			JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
			lblDireccin.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblDireccin.setBounds(597, 353, 77, 21);
			panelRegistro1.add(lblDireccin);
			
			JLabel lblBarrio = new JLabel("Barrio:");
			lblBarrio.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblBarrio.setBounds(621, 416, 53, 14);
			panelRegistro1.add(lblBarrio);
			
			JLabel lblExpedicion = new JLabel("Lugar de expedici\u00F3n:");
			lblExpedicion.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblExpedicion.setBounds(528, 468, 146, 28);
			panelRegistro1.add(lblExpedicion);
			
			JLabel lblLugarDeNacimiento = new JLabel("Lugar de nacimiento:");
			lblLugarDeNacimiento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblLugarDeNacimiento.setBounds(520, 234, 147, 25);
			panelRegistro1.add(lblLugarDeNacimiento);
			
			JButton btnSiguiente_1 = new JButton("New button");
			btnSiguiente_1.addActionListener(new Control_GestionFeligreses(this, "Siguiente_1"));
			btnSiguiente_1.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/BotonSiguiente.jpg")));
			btnSiguiente_1.setBounds(571, 563, 324, 61);
			panelRegistro1.add(btnSiguiente_1);
			
			JButton btnRegresar_1 = new JButton("New button");
			btnRegresar_1.addActionListener(new Control_GestionFeligreses(this, "Regresar_1"));
			btnRegresar_1.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/BotonRegresar.JPG")));
			btnRegresar_1.setBounds(116, 563, 324, 61);
			panelRegistro1.add(btnRegresar_1);
			
			JLabel lblBeware = new JLabel("New label");
			lblBeware.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/notification_ui_03.png")));
			lblBeware.setBounds(255, 653, 523, 65);
			panelRegistro1.add(lblBeware);
			
			JLabel lblWall = new JLabel("");
			lblWall.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/Background.png")));
			lblWall.setBounds(0, 56, 1018, 662);
			panelRegistro1.add(lblWall);
		panelRegistro3.setBounds(0, 0, 1008, 729);
		contentPane.add(panelRegistro3);
		panelRegistro3.setLayout(null);
		
		JLabel lblhead3 = new JLabel("");
		lblhead3.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/EncabezadoRegistroFeligreses.png")));
		lblhead3.setBounds(0, 0, 1008, 67);
		panelRegistro3.add(lblhead3);
		
		JLabel lblEmpresaDondeTrabaja = new JLabel("Empresa donde trabaja:");
		lblEmpresaDondeTrabaja.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblEmpresaDondeTrabaja.setBounds(87, 174, 168, 22);
		panelRegistro3.add(lblEmpresaDondeTrabaja);
		
		JLabel lblposeeCnyuge = new JLabel("\u00BFPosee c\u00F3nyuge?:");
		lblposeeCnyuge.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblposeeCnyuge.setBounds(550, 174, 121, 21);
		panelRegistro3.add(lblposeeCnyuge);
		
		textFieldEmpresa = new JTextField();
		textFieldEmpresa.setBounds(275, 170, 201, 36);
		panelRegistro3.add(textFieldEmpresa);
		textFieldEmpresa.setColumns(10);
		
		JComboBox comboBoxConyuge = new JComboBox();
		comboBoxConyuge.setBounds(684, 168, 201, 36);
		panelRegistro3.add(comboBoxConyuge);
		
		JLabel lblNombresDelCnyuge = new JLabel("Nombres del c\u00F3nyuge:");
		lblNombresDelCnyuge.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNombresDelCnyuge.setBounds(98, 231, 157, 22);
		panelRegistro3.add(lblNombresDelCnyuge);
		
		JLabel lblApellidosDelCnyuge = new JLabel("Apellidos del c\u00F3nyuge:");
		lblApellidosDelCnyuge.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblApellidosDelCnyuge.setBounds(515, 232, 155, 21);
		panelRegistro3.add(lblApellidosDelCnyuge);
		
		JLabel lblCedulaDelCnyuge = new JLabel("Cedula del c\u00F3nyuge:");
		lblCedulaDelCnyuge.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblCedulaDelCnyuge.setBounds(116, 293, 139, 22);
		panelRegistro3.add(lblCedulaDelCnyuge);
		
		JLabel lblcnyugeCristiano = new JLabel("\u00BFC\u00F3nyuge cristiano?:");
		lblcnyugeCristiano.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblcnyugeCristiano.setBounds(529, 293, 142, 22);
		panelRegistro3.add(lblcnyugeCristiano);
		
		JLabel lblfamiliaresCristianos = new JLabel("\u00BFFamiliares cristianos?:");
		lblfamiliaresCristianos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblfamiliaresCristianos.setBounds(98, 358, 168, 22);
		panelRegistro3.add(lblfamiliaresCristianos);
		
		JLabel lblNumeroDeHijos = new JLabel("Numero de hijos:");
		lblNumeroDeHijos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNumeroDeHijos.setBounds(550, 358, 121, 22);
		panelRegistro3.add(lblNumeroDeHijos);
		
		JLabel lblObservaciones = new JLabel("Observaciones");
		lblObservaciones.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblObservaciones.setBounds(447, 473, 109, 22);
		panelRegistro3.add(lblObservaciones);
		
		textFieldObservaciones = new JTextField();
		textFieldObservaciones.setBounds(98, 506, 788, 36);
		panelRegistro3.add(textFieldObservaciones);
		textFieldObservaciones.setColumns(10);
		
		JLabel lblDatosFamiliaresY = new JLabel("Datos familiares y observaciones");
		lblDatosFamiliaresY.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblDatosFamiliaresY.setBounds(331, 80, 354, 29);
		panelRegistro3.add(lblDatosFamiliaresY);
		
		JButton btnRegresar3 = new JButton("New button");
		btnRegresar3.addActionListener(new Control_GestionFeligreses(this, "Regresar_3"));
		btnRegresar3.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/BotonRegresar.JPG")));
		btnRegresar3.setBounds(116, 563, 324, 61);
		panelRegistro3.add(btnRegresar3);
		
		JButton btnRegistrar = new JButton("New button");
		btnRegistrar.addActionListener(new Control_GestionFeligreses(this, "Registrar"));
		btnRegistrar.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/BotonRegistrar.JPG")));
		btnRegistrar.setBounds(571, 563, 324, 61);
		panelRegistro3.add(btnRegistrar);
		
		textFieldNomConyuge = new JTextField();
		textFieldNomConyuge.setBounds(275, 233, 201, 36);
		panelRegistro3.add(textFieldNomConyuge);
		textFieldNomConyuge.setColumns(10);
		
		textFieldCIConyuge = new JTextField();
		textFieldCIConyuge.setBounds(275, 291, 201, 36);
		panelRegistro3.add(textFieldCIConyuge);
		textFieldCIConyuge.setColumns(10);
		
		JComboBox comboBoxFamCris = new JComboBox();
		comboBoxFamCris.setBounds(275, 349, 201, 36);
		panelRegistro3.add(comboBoxFamCris);
		
		textFieldApellConyuge = new JTextField();
		textFieldApellConyuge.setBounds(684, 233, 201, 36);
		panelRegistro3.add(textFieldApellConyuge);
		textFieldApellConyuge.setColumns(10);
		
		JComboBox comboBoxConyugeCris = new JComboBox();
		comboBoxConyugeCris.setBounds(684, 291, 201, 36);
		panelRegistro3.add(comboBoxConyugeCris);
		
		textFieldNumHijos = new JTextField();
		textFieldNumHijos.setBounds(684, 349, 201, 36);
		panelRegistro3.add(textFieldNumHijos);
		textFieldNumHijos.setColumns(10);
		
		JLabel lblRango_1 = new JLabel("Rango:");
		lblRango_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblRango_1.setBounds(207, 415, 48, 22);
		panelRegistro3.add(lblRango_1);
		
		JComboBox comboBoxRango = new JComboBox();
		comboBoxRango.setBounds(275, 411, 201, 36);
		panelRegistro3.add(comboBoxRango);
		
		JLabel lblestatusEnLa_1 = new JLabel("\u00BFEstatus en la iglesia?:");
		lblestatusEnLa_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblestatusEnLa_1.setBounds(520, 415, 151, 21);
		panelRegistro3.add(lblestatusEnLa_1);
		
		JComboBox comboBoxStatus = new JComboBox();
		comboBoxStatus.setBounds(684, 411, 201, 36);
		panelRegistro3.add(comboBoxStatus);
		
		JLabel lblwall3 = new JLabel("New label");
		lblwall3.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/Background.png")));
		lblwall3.setBounds(0, 67, 1008, 662);
		panelRegistro3.add(lblwall3);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 1008, 729);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 68, 1008, 66);
		panelPrincipal.add(menuBar);
		
		mnRegistrar = new JMenu("Registrar");
		mnRegistrar.addMouseListener(new Control_GestionFeligreses(this, "Registrar"));
		mnRegistrar.setForeground(Color.BLACK);
		mnRegistrar.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/add-group-button.png")));
		menuBar.add(mnRegistrar);
		
		mnBusqueda = new JMenu("Buscar y Modificar");
		mnBusqueda.addMouseListener(new Control_GestionFeligreses(this, "BuscarModificar"));
		mnBusqueda.setForeground(Color.BLACK);
		mnBusqueda.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/group-editor.png")));
		menuBar.add(mnBusqueda);
		
		mntmRegresar = new JMenuItem("Regresar");
		mntmRegresar.addMouseListener(new Control_GestionFeligreses(this, "Regresar"));
		mntmRegresar.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/return.png")));
		menuBar.add(mntmRegresar);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(95, 159, 756, 533);
		panelPrincipal.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/slogan-transparente-2016.png")));
		
		JLabel lblHeader = new JLabel("header");
		lblHeader.setBounds(0, 0, 1008, 67);
		panelPrincipal.add(lblHeader);
		lblHeader.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/EncabezadoGestionFeligres.png")));
		
		JLabel lblWallpaper = new JLabel("wallpaper");
		lblWallpaper.setBounds(0, 129, 1008, 600);
		panelPrincipal.add(lblWallpaper);
		lblWallpaper.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/Background.png")));
		panelBusqueda.setBounds(0, 0, 1008, 729);
		contentPane.add(panelBusqueda);
		panelBusqueda.setLayout(null);
		
		JLabel lblHead1 = new JLabel("");
		lblHead1.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/EncabezadoBusqueda.png")));
		lblHead1.setBounds(0, 0, 1008, 67);
		panelBusqueda.add(lblHead1);
		
		JLabel lblWallp = new JLabel("");
		lblWallp.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/Background.png")));
		lblWallp.setBounds(0, 67, 1008, 676);
		panelBusqueda.add(lblWallp);
		/*
		 * la fecha de combersiones seria bueno ponerla con la clase 
		 * que tu encontraste jtiker creo que se llama bueno tu sabes
		 */
		
		panelModificacion = new JPanel();
		panelModificacion.setVisible(false);
		panelModificacion.setBounds(0, 0, 1008, 729);
		contentPane.add(panelModificacion);
		panelModificacion.setLayout(null);
		
		JLabel lblHead = new JLabel("New label");
		lblHead.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/EncabezadoModifFeligreses.png")));
		lblHead.setBounds(0, 0, 1008, 67);
		panelModificacion.add(lblHead);
		
		JLabel lblGrupoBiblico_1 = new JLabel("Grupo B\u00EDblico:");
		lblGrupoBiblico_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblGrupoBiblico_1.setBounds(98, 175, 111, 22);
		panelModificacion.add(lblGrupoBiblico_1);
		
		JLabel lblDireccin_1 = new JLabel("Direcci\u00F3n:");
		lblDireccin_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDireccin_1.setBounds(126, 237, 75, 14);
		panelModificacion.add(lblDireccin_1);
		
		JLabel lblBarrio_1 = new JLabel("Barrio:");
		lblBarrio_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblBarrio_1.setBounds(149, 292, 45, 14);
		panelModificacion.add(lblBarrio_1);
		
		JLabel lblNumeroDeTelefono = new JLabel("Tel\u00E9fono:");
		lblNumeroDeTelefono.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNumeroDeTelefono.setBounds(633, 186, 69, 14);
		panelModificacion.add(lblNumeroDeTelefono);
		
		JLabel lblEdicinRpida = new JLabel("Edici\u00F3n r\u00E1pida");
		lblEdicinRpida.setFont(new Font("Segoe UI", Font.PLAIN, 26));
		lblEdicinRpida.setBounds(408, 102, 168, 31);
		panelModificacion.add(lblEdicinRpida);
		
		JLabel lblRango = new JLabel("Rango:");
		lblRango.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblRango.setBounds(646, 234, 56, 22);
		panelModificacion.add(lblRango);
		
		JLabel lblestatusEnLa = new JLabel("\u00BFEstatus en la iglesia?:");
		lblestatusEnLa.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblestatusEnLa.setBounds(542, 289, 160, 22);
		panelModificacion.add(lblestatusEnLa);
		
		textFieldGrupoEdit = new JTextField();
		textFieldGrupoEdit.setBounds(219, 171, 201, 36);
		panelModificacion.add(textFieldGrupoEdit);
		textFieldGrupoEdit.setColumns(10);
		
		textFieldDirEdit = new JTextField();
		textFieldDirEdit.setBounds(219, 229, 201, 36);
		panelModificacion.add(textFieldDirEdit);
		textFieldDirEdit.setColumns(10);
		
		textFieldBarrioEdit = new JTextField();
		textFieldBarrioEdit.setBounds(219, 284, 201, 36);
		panelModificacion.add(textFieldBarrioEdit);
		textFieldBarrioEdit.setColumns(10);
		
		textFieldTelfEdit = new JTextField();
		textFieldTelfEdit.setBounds(740, 178, 201, 36);
		panelModificacion.add(textFieldTelfEdit);
		textFieldTelfEdit.setColumns(10);
		
		JComboBox comboBoxStatus2 = new JComboBox();
		comboBoxStatus2.setBounds(740, 284, 201, 36);
		panelModificacion.add(comboBoxStatus2);
		
		JComboBox comboBoxRango2 = new JComboBox();
		comboBoxRango2.setBounds(740, 229, 201, 36);
		panelModificacion.add(comboBoxRango2);
		
		JButton btnEditarMas = new JButton("");
		btnEditarMas.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/BotonEditarMas.JPG")));
		btnEditarMas.setBounds(346, 453, 324, 61);
		panelModificacion.add(btnEditarMas);
		
		JButton btnRegresar4 = new JButton("");
		btnRegresar4.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/BotonRegresar.JPG")));
		btnRegresar4.setBounds(116, 563, 324, 61);
		panelModificacion.add(btnRegresar4);
		
		JButton buttonGuardar4 = new JButton("");
		buttonGuardar4.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/BotonGuardarCambios.JPG")));
		buttonGuardar4.setBounds(549, 563, 324, 61);
		panelModificacion.add(buttonGuardar4);
		
		JLabel lblWallpp = new JLabel("New label");
		lblWallpp.setIcon(new ImageIcon(GestionFeligres.class.getResource("/com/planfelipe/imagenes/Background.png")));
		lblWallpp.setBounds(0, 67, 1008, 662);
		panelModificacion.add(lblWallpp);
	}
}
