public abstract class Defesatorre {
    private String nome;

    public Defesatorre(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularResistencia();
}
