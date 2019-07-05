package com.gabriel.app.radiofm;
import com.gabriel.app.display.Display;

public class RadioFmDisplay extends Display<RadioFm> {

	private RadioFmFormatter cFormatter = new RadioFmFormatter();

	private RadioFm radioFm;
	
	//construtor
	public RadioFmDisplay() {
		this.radioFm = new RadioFm();
		this.radioFm.setEstacao("FM");
		this.radioFm.setNumeroEstacao(107.5);
	}
	
	public void show() {
		System.out.println(cFormatter.formatter(radioFm));
	}

}
