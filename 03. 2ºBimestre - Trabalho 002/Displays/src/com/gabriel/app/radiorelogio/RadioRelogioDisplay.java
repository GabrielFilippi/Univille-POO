package com.gabriel.app.radiorelogio;

import java.util.Calendar;

import com.gabriel.app.display.Display;

public class RadioRelogioDisplay extends Display<RadioRelogio> {
	Calendar calendar = Calendar.getInstance();
	String horaAtual = calendar.HOUR_OF_DAY+":"+calendar.MINUTE+":"+calendar.SECOND;
	
	private RadioRelogioFormatter rRFormatter = new RadioRelogioFormatter();
	
	private RadioRelogio hora;
	
	public RadioRelogioDisplay() {
		this.hora = new RadioRelogio();
		this.hora.setHora(horaAtual);
	}

	public void show() {
		System.out.println(rRFormatter.formatter(hora));
	}

}
