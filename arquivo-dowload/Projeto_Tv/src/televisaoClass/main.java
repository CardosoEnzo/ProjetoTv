package televisaoClass;

import tvQuarto.TelevisaoQuarto;
import tvSala.TelevisaoSala;

public class main {

	public static void main (String[] args) {
		
		Televisao televisao = new Televisao(false, 0);
		
		
		
		TelevisaoQuarto televisaoQuarto = new TelevisaoQuarto(false, 0);
		televisaoQuarto.assistirTv(televisao);
		televisaoQuarto.status();
		
		
		TelevisaoSala televisaoSala = new TelevisaoSala(false, 0);
		televisaoSala.assistirTv(televisao);
		televisaoSala.status();
	}

}
