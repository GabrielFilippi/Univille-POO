package com.gabriel.app.temperatura;

import com.gabriel.app.display.Display;

public class TemperaturaDisplay extends Display<Temperatura> {
	
	private TemperaturaFomatter tFormatter = new TemperaturaFomatter();
	
	private Temperatura temperatura;
	
	public TemperaturaDisplay() {
		this.temperatura = new Temperatura();
		this.temperatura.setValor(31.1);
	}

	public void show() {
		System.out.println(tFormatter.formatter(temperatura));
	}

}
