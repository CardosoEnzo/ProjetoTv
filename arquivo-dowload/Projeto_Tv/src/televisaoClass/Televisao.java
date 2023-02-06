package televisaoClass;

public class Televisao implements InterfaceTv{
	
	private int volume;
	private int botaoCanal;
	private boolean botaoLigar_Desligar;
	
	
	public Televisao(boolean botaoLigar_Desligar, int volume){
		botaoLigar_Desligar = false;
		volume = 0;
	}
	
	public void status() {
		System.out.println("A tv está " +botaoLigar_Desligar+ ", está no volume " +this.getVolume());
	}
	
	public boolean ligar_Desligar(boolean botaoLigar_Desligar) {
		if(botaoLigar_Desligar = true) {
			return true;
		}
		else {
			System.out.println("TV DESLIGADA....");
		}
		return true;
	}
	
	public static boolean canais(int canais) {
		
		if (canais == 1 || canais == 3 || canais ==  5 || canais == 7 || canais == 11) {
			System.out.println("Canal Válido. ESTÁ NO CANAL  " +canais);
			return true;
		}
		else {
			System.out.println("Canal Inválido");
		}
		return true;
	}

	@Override
	public boolean ligar() {
		this.botaoLigar_Desligar = true;
		System.out.println("Ligandoo...");
		Televisao.canais(1);
		return true;
	}

	@Override
	public boolean desligar() {
		if(this.botaoLigar_Desligar = false) {
		System.out.println("Desligando...");
	}
		else {
			System.out.println("A tv já está desligada");
		}
		return false;
		
	}

	public boolean mudarCanal(int canal) {
		ligar_Desligar(botaoLigar_Desligar);
		Televisao.canais(canal);
		return true;
	}
		
	@Override
	public void aumentarVolume() {
		if(this.botaoLigar_Desligar == true) {
			if(this.volume<5) {
			this.volume++;
			System.out.println("O volume está em "+this.getVolume());
			}
			else {
				System.out.println("O volume está em 100% ou a televisão está desligada");
			}
		}
	}

	@Override
	public void diminuirVolume() {
		if(this.botaoLigar_Desligar == true) {
			if(this.volume<=5 && this.volume>0) {
			this.volume--;
			System.out.println("O volume está em "+this.getVolume());
			}
			else {
				
				System.out.println("O volume está em 0% ou a televisão está desligada");
			}
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}


	public int getBotaoCanal() {
		return botaoCanal;
	}

	public void setBotaoCanal(int botaoCanal) {
		this.botaoCanal = botaoCanal;
	}

	public boolean getBotaoLigar_Desligar() {
		return botaoLigar_Desligar;
	}

	public void setBotaoLigar_Desligar(boolean botaoLigar_Desligar) {
		this.botaoLigar_Desligar = botaoLigar_Desligar;
	}

	@Override
	public void mudarCanal() {
		// TODO Auto-generated method stub
		
	}

	

}
