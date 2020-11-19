public class Serie implements Video {
    // Atributos 
    private int temporadas;
    private String idiomaAudio;
    private String idiomaLegenda;
    private boolean estaPausado;
    private String nome;
    private int episodiosPorTemporada;

    // Construtor
    public Serie (String nome, int temporadas, int episodiosPorTemporada) {
        this.nome = nome;
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.estaPausado = false;
        this.idiomaAudio = "Ingles (Original)";
        this.idiomaLegenda = "Portugues (Brasil)";
    }

	@Override
	public void executar() {
        if (estaPausado){
            System.out.println("A série está executando.");
        } else {
            System.out.println("A série " +nome+ " começou.");
        }		
	}

	@Override
	public void pausar() {
        System.out.println("A série " +nome+ " foi pausada.");
        estaPausado = true;    
    }

	@Override
	public void mudarAudio() {
		if (idiomaAudio == "Ingles (Original)") {           
            idiomaAudio = "Portugues (Brasil)";
            System.out.println("Idioma alterado para Português (Brasil).");
        } 
        else if (idiomaAudio == "Portugues (Brasil)") {
            idiomaAudio = "Ingles (Original)";
            System.out.println("Idioma alterado para Inglês (Original).");
        }		
	}

	@Override
	public void mudarLegenda() {
		if (idiomaLegenda == "Portugues (Brasil)") {
            idiomaLegenda = "Sem legenda";
            System.out.println("Legenda removida.");
        }
        else if (idiomaLegenda == "Sem legenda") {
            idiomaLegenda = "Portugues (Brasil)";
            System.out.println("Legenda foi alterada para português (Brasil).");
        }		
	}

	@Override
	public String exibirDetalhes() {
		System.out.println(nome+ " (" +temporadas+ " temporadas). " +episodiosPorTemporada+ " por temporada.");
		return null;
	}
    
}
