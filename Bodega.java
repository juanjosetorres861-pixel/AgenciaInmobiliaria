public class Bodega extends Inmueble {
    private double alturaTecho;
    private boolean tieneMuelleCarga;

    public Bodega(String id, String dir, double precio, double area, double altura) {
        super(id, dir, precio, area);
        this.alturaTecho = altura;
    }
}
