class CarroApp
{
    public static void main(String[] args) {
        Motor m1 = new Motor("3.8L V6");
        Bancos b1 = new Bancos("Recaro");
        Carro c1 = new Carro("Mustang", "Conversivel", "Ford", m1, b1);

        Motor m2 = new Motor("Zetec Rocam 1.0");
        Bancos b2 = new Bancos("Lear");
        Carro c2 = new Carro("Ka", "Popular", "Ford", m2, b2);

        Motor m3 = new Motor("2.4 Ecotec");
        Bancos b3 = new Bancos("Magna");
        Carro c3 = new Carro("Captiva", "SUV", "Chevrolet", m3, b3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
