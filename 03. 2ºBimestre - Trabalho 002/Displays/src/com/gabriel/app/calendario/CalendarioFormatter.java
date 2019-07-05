package com.gabriel.app.calendario;

import com.gabriel.app.display.Formatter;

public class CalendarioFormatter implements Formatter<Calendario> {

	/**
	 * @see com.gabriel.app.display.Formatter#formatter(com.gabriel.app.display.T)
	 * 
	 *  
	 */
	public String formatter(Calendario calendario) {
		return String.format("%d/%d/%d", calendario.getDia(), calendario.getMes(), calendario.getAno());
	}

}
