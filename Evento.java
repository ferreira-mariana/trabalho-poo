import java.text.SimpleDateFormat;
import java.util.*;

public class Evento {
	private String nomeArtista;
	private String turne;
	private String informacoes;
	private List<Data> datas = new ArrayList<>();
	private List<Local> locais = new ArrayList<>();

	public Evento(String nomeArtista, String turne){
		this.nomeArtista = nomeArtista;
		this.turne = turne;
	}

	public String getInformacoes() {
		return informacoes;
	}	

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void getLocais() {
		int tamanhoLista = this.locais.size();
		for(int i = 0; i < tamanhoLista; i++){
			System.out.println((i+1) + "º Local: " + this.locais.get(i).getNome() + " Data: " +
				this.datas.get(i).getData());
		}
	}

	public void getLocal(int i){
		System.out.println("Selecionado: Local: " + this.locais.get(i).getNome() + " Data: " +  
				this.datas.get(i).getData());
	}

	public String getTurne() {
		return turne;
	}

	public void criaLocalData(int ano, int mes, int dia, String local){
		this.datas.add(new Data(dia, mes, ano));
		this.locais.add(new Local(local));
	}

}
