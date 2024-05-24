public class teste1 {
    public static void main(String[] args) {

        FeiticoAtaque expelliarmus = new FeiticoAtaque("Expelliarmus", 3, 50);
        FeiticoAtaque avadaKedavra = new FeiticoAtaque("Avada Kedavra", 10, 1000);


        FeiticoCura Cura = new FeiticoCura("Episkey", 2, 30);
        FeiticoCura ferula = new FeiticoCura("Ferula", 4, 60);


        System.out.println(expelliarmus.getDetalhes());
        System.out.println(avadaKedavra.getDetalhes());
        System.out.println(Cura.getDetalhes());
        System.out.println(ferula.getDetalhes());
    }
}
