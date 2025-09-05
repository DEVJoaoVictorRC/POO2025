package exemplos;

public class Campeonato {
	private int id;
	private String time;
	private int pontos;
	private static int contadorTimes = 0;
	
	// construtor nao tem retorno e nao é void e tem o mesmo nome da classe
//	public Campeonato() {
//		System.out.println("Construtor Executado!");
//	}
	
	//Overload - Possui mesmo nome com argumentos diferentes
	public Campeonato(int id, String time, int pontos ) {
		this.id = id;
		this.time =time;
		this.pontos = pontos;
		contadorTimes ++;
	}

	
	
	public static int getContadorTimes() {
		return contadorTimes;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

}
