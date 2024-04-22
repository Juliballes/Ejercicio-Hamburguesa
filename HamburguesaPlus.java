public class HamburguesaPlus {
    private Medallon medallon1;
    private Medallon medallon2;
    private Medallon medallon3;
    private Ingrediente ingrediente1;
    private Ingrediente ingrediente2;
    private Ingrediente ingrediente3;

    public HamburguesaPlus(Medallon medallon1, Medallon medallon2, Medallon medallon3, Ingrediente ingrediente1, Ingrediente ingrediente2, Ingrediente ingrediente3) {
        this.medallon1 = medallon1;
        this.medallon2 = medallon2;
        this.medallon3 = medallon3;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
    }

    public int calcularPrecio() {
        return medallon1.getPrecio() + medallon2.getPrecio() + medallon3.getPrecio() + ingrediente1.getPrecio() + ingrediente2.getPrecio() + ingrediente3.getPrecio();
    }
}
