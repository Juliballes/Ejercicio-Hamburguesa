public class Main {
    public static void main(String[] args) {

        //Crear medallones
        Medallon vegetariano = new Medallon(1500);
        Medallon pollo = new Medallon(1200);
        Medallon carne = new Medallon(2000);

        //crear ingredientes
        Ingrediente lechuga = new Ingrediente(300);
        Ingrediente tomate = new Ingrediente(350);
        Ingrediente huevo = new Ingrediente(400);


        //Crear hamburguesa 1
        HamburguesaSimple hm = new HamburguesaSimple(1000);
        hm.setMedallon(vegetariano);
        hm.setIngrediente(lechuga);

        //calcular precio total
        int precio1 = hm.calcularPrecio();
        System.out.println("El precio de la hamburguesa 1 es: "+ precio1);


        //Crear hamburguesa 2
        HamburguesaDoble hm2 = new HamburguesaDoble(2500);
        hm2.setMedallon1(carne);
        hm2.setMedallon2(carne);
        hm2.setIngrediente1(lechuga);
        hm2.setIngrediente2(tomate);

        int precio2 =hm2.calcularPrecio();
        System.out.println("El precio de la hamburguesa 2 es: "+precio2);



    }
}