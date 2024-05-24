public class FeiticoCura extends Feitico {
    private int vidaRestaurada;

    public FeiticoCura(String nome, int nivelDificuldade, int vidaRestaurada) {
        super(nome, nivelDificuldade);
        this.vidaRestaurada = vidaRestaurada;
    }

    public int getVidaRestaurada() {
        return vidaRestaurada;
    }

    @Override
    public String getDetalhes() {
        return "Feitiço de Cura: " + getNome() + "\n" +
                "Nível de Dificuldade: " + getNivelDificuldade() + "\n" +
                "Vida Restaurada: " + vidaRestaurada;
    }
}
