public class Filme implements Video {
    // Atributos
    private int duracao;
    private String idiomaAudio;
    private String idiomaLegenda;
    private boolean estaPausado;
    private String nome;
    private int anoLancamento;
    
    // Método construtor
    public Filme(String nome, int duracao, int anoLancamento){
        this.nome = nome;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.estaPausado = false;
        this.idiomaAudio = "Ingles (Original)";
        this.idiomaLegenda = "Portugues (Brasil)";
    }

    // Metodos da classe. nao usar this
    @Override
    public void executar() {
        if (estaPausado){
            System.out.println("O filme está executando.");
        } else {
            System.out.println("O filme " +nome+ " começou.");
        }        
    }

    @Override
    public void pausar() {
        System.out.println("O filme " +nome+ " foi pausado.");
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
        System.out.println(nome+ "(" +anoLancamento+ "). Duração: " +duracao+ " min.");
        return null;
    }    
}
