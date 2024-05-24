public class Torre extends Defesatorre {
    private double altura;

    public Torre(String nome, double altura) {
        super(nome);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularResistencia() {
        // Exemplo simples de cálculo de resistência baseado na altura
        return altura * 10;
    }

    @Override
    public String toString() {
        return "Torre: " + getNome() + " (Altura: " + altura + "m, Resistência: " + calcularResistencia() + ")";
    }
}
