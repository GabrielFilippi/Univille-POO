package com.gabriel.app;

import com.gabriel.app.calendario.CalendarioDisplay;
import com.gabriel.app.radiofm.RadioFmDisplay;
import com.gabriel.app.radiorelogio.RadioRelogioDisplay;
import com.gabriel.app.temperatura.TemperaturaDisplay;

public class Main {
	public static void main(String[] args) {
		
		//Rádio Relógio
		System.out.println("Rádio Relógio");
		RadioRelogioDisplay rRDisplay = new RadioRelogioDisplay();
		rRDisplay.show();
		System.out.println();
		
		//Rádio
		System.out.println("Rádio");
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
