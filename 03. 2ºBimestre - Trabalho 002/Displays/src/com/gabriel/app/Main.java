package com.gabriel.app;

import com.gabriel.app.calendario.CalendarioDisplay;
import com.gabriel.app.radiofm.RadioFmDisplay;
import com.gabriel.app.radiorelogio.RadioRelogioDisplay;
import com.gabriel.app.temperatura.TemperaturaDisplay;

public class Main {
	public static void main(String[] args) {
		
		//R�dio Rel�gio
		System.out.println("R�dio Rel�gio");
		RadioRelogioDisplay rRDisplay = new RadioRelogioDisplay();
		rRDisplay.show();
		System.out.println();
		
		//R�dio
		System.out.println("R�dio");
		RadioFmDisplay rFmDisplay = new RadioFmDisplay();
		rFmDisplay.show();
		System.out.println();
		
		//calendario 
		System.out.println("Calendario");
		CalendarioDisplay cDisplay = new CalendarioDisplay();
		cDisplay.show();
		System.out.println();
		
		// temperatura
		TemperaturaDisplay tDisplay = new TemperaturaDisplay();
		System.out.println("Temperatura: ");
		tDisplay.show();
		
		
	}
}
