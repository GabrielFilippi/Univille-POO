package com.gabriel.app.radiofm;

import com.gabriel.app.display.Formatter;

public class RadioFmFormatter implements Formatter<RadioFm> {

	/**
	 * @see com.gabriel.app.display.Formatter#formatter(com.gabriel.app.display.T)
	 * 
	 *  
	 */
	public String formatter(RadioFm radioFm) {
		return radioFm.getEstacao()+String.format(" %.2f", radioFm.getNumeroEstacao());
	}

}
