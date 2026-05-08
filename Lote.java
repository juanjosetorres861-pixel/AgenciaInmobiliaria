public class Lote extends Inmueble {
    private String tipoSuelo; // Urbano, Rural, Industrial

    public Lote(String id, String dir, double precio, double area, String suelo) {
        super(id, dir, precio, area);
        this.tipoSuelo = suelo;
    }
}
