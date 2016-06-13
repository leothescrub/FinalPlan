package com.planfelipe.Class;

import java.util.Properties;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.SqlDateModel;

public class Calendario {
	public SqlDateModel model;
	public JDatePanelImpl GetCalendario(){
		
		    model = new SqlDateModel();
			model.setDate(1990, 8, 24);
			model.setSelected(false);

			Properties p = new Properties();
			p.put("text.today", "Hoy");
			
			JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
			return datePanel;
	}
}
