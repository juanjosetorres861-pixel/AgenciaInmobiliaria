public class Casa extends Inmueble {
    private int numPisos;
    private boolean tienePatio;

    public Casa(String id, String dir, double precio, double area, int pisos) {
        super(id, dir, precio, area);
        this.numPisos = pisos;
    }
}
