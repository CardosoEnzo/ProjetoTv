package tvSala;

import tvQuarto.TelevisaoQuarto;

public class TelevisaoSala extends TelevisaoQuarto {

	public TelevisaoSala(boolean botaoLigar_Desligar, int volume) {
		super(botaoLigar_Desligar, volume);
		
	}
	
	public void status () {
		System.out.println("A tv da sala está " +this.getBotaoLigar_Desligar()+ ", está no volume " +this.getVolume());
	}
}
