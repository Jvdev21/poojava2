public class teste2 {
    public static void main(String[] args) {

        Torre torre = new Torre("Torre Norte", 30.5);


        torre.setAltura(30.5);


        double resistencia = torre.calcularResistencia();


        System.out.println(torre);
        System.out.println("Resistência calculada: " + resistencia);
    }
}
