public class HamburguesaSimple {
    private int precioBase;
    Medallon medallon;
    Ingrediente ingrediente;

    public HamburguesaSimple(int precioBase) {
        this.precioBase = precioBase;

    }

    public void setMedallon(Medallon medallon) {
        this.medallon = medallon;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int calcularPrecio(){
        //Aca esta devolviendo el precio base de esta hamburguesa (1000)+ el precio del medallon (ej vegetariano 1500) + el precio del ingrediente que le haya puesto (ej lechuga 300 y tomate 350)
       return this.precioBase+this.medallon.getPrecio()+this.ingrediente.getPrecio();
    }
}
