package tvQuarto;

import televisaoClass.Televisao;

public class TelevisaoQuarto extends Televisao{

	
	
	public TelevisaoQuarto(boolean botaoLigar_Desligar, int volume) {
		super(botaoLigar_Desligar, volume);
		
	}
	
	public void assistirTv (Televisao televisao) {
		if(televisao.getBotaoLigar_Desligar() == true) {
			System.out.println("Tv ligada e reproduzindo...");
		}
		else {
			System.out.println("Tv desligada...");
		}
	}
	public void status() {
		System.out.println("A tv do quarto está " +this.getBotaoLigar_Desligar()+ ", está no volume " +this.getVolume());
	}
		
}