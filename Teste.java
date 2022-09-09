public class Teste {
    public static void main(String[] args) {
        Candidato teste = new Candidato();
        teste.setIdade(45);
        teste.setNome("Ciro");
        teste.setNumeroCandidato(12);
        teste.setPartido("PDT");
        System.out.println(teste.partido);
        System.out.printf(teste.toString());
    }
}
