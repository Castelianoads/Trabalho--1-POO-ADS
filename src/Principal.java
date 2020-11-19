public class Principal {
    public static void main(String[] args) throws Exception {
        Filme filme1 = new Filme ("Jumanji - Próxima Fase ", 123, 2019);
        Filme filme2 = new Filme ("Coringa ", 122, 2019);
        Serie serie1 = new Serie ("A Maldição da Residência Hill", 2, 10);
        Serie serie2 = new Serie ("Mr. Robot - Sociedade Hacker", 4, 15);

        filme1.exibirDetalhes(); //objeto 1
        filme1.executar();
        filme1.mudarAudio();
        filme1.mudarAudio();
        filme1.mudarLegenda();
        filme1.mudarLegenda();
        filme1.pausar();
        filme1.executar();
        System.out.println();

        filme2.exibirDetalhes(); //objeto 2
        filme2.executar();
        filme2.mudarAudio();
        filme2.mudarAudio();
        filme2.mudarLegenda();
        filme2.mudarLegenda();
        filme2.pausar();
        filme2.executar();
        System.out.println();

        serie1.exibirDetalhes(); //objeto 1
        serie1.executar();
        serie1.mudarAudio();
        serie1.mudarAudio();
        serie1.mudarLegenda();
        serie1.mudarLegenda();
        serie1.pausar();
        serie1.executar();
        System.out.println();

        serie2.exibirDetalhes(); // objeto 2
        serie2.executar();
        serie2.mudarAudio();
        serie2.mudarAudio();
        serie2.mudarLegenda();
        serie2.mudarLegenda();
        serie2.pausar();
        serie2.executar();
        System.out.println();





    }
}
