public class Apartamento extends Inmueble {
    private double valorAdministracion;
    private int numeroPiso;

    public Apartamento(String id, String dir, double precio, double area, double admin) {
        super(id, dir, precio, area);
        this.valorAdministracion = admin;
    }
}
