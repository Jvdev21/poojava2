public abstract class Feitico {
    private String nome;
    private int nivelDificuldade;

    public Feitico(String nome, int nivelDificuldade) {
        this.nome = nome;
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getNome() {
        return nome;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    @Override
    public String toString() {
        return "Feitiço: " + nome + " (Nível de Dificuldade: " + nivelDificuldade + ")";
    }


    public abstract String getDetalhes();
}
