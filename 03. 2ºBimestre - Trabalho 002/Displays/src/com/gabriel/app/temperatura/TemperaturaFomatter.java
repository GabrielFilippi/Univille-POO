package com.gabriel.app.temperatura;

import com.gabriel.app.display.Formatter;

public class TemperaturaFomatter implements Formatter<Temperatura> {

	/**
	 * @see com.gabriel.app.display.Formatter#formatter(com.gabriel.app.display.T)
	 * 
	 *  
	 */
	public String formatter(Temperatura temperatura) {
		return String.format("%.2f�C", temperatura.getValor());
	}

}
