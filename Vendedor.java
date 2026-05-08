public class Vendedor {
    private String nombre;
    private String idVendedor;
    private double ventasAcumuladas;

    public Vendedor(String nombre, String id) {
        this.nombre = nombre;
        this.idVendedor = id;
    }

    public void vender(Inmueble inmueble) {
        inmueble.setEstado("Vendido");
        this.ventasAcumuladas += inmueble.calcularComision();
    }
}
