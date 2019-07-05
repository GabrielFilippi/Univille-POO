package com.gabriel.app.calendario;

import com.gabriel.app.display.Display;

public class CalendarioDisplay extends Display<Calendario> {
	private CalendarioFormatter cFormatter = new CalendarioFormatter();

	private Calendario calendario;
	
	//construtor
	public CalendarioDisplay() {
		this.calendario = new Calendario();
		this.calendario.setDia(5);
		this.calendario.setMes(7);
		this.calendario.setAno(2019);
	}
	
	public void show() {
		System.out.println(cFormatter.formatter(calendario));
	}
	

}
