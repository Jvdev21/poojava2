public class FeiticoAtaque extends Feitico {
    private int dano;

    public FeiticoAtaque(String nome, int nivelDificuldade, int dano) {
        super(nome, nivelDificuldade);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public String getDetalhes() {
        return "Feitiço de Ataque: " + getNome() + "\n" +
                "Nível de Dificuldade: " + getNivelDificuldade() + "\n" +
                "Dano: " + dano;
    }
}
