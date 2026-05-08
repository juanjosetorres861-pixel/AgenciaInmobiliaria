public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema Agencia Inmobiliaria Popayan ---");
        
        Casa casa1 = new Casa("C001", "Sector Centro", 250000000, 120, 2);
        Vendedor vend1 = new Vendedor("Juan Perez", "V-101");
        
        System.out.println("Inmueble creado en: " + casa1.direccion);
        vend1.vender(casa1);
        System.out.println("Estado de la casa: " + casa1.getEstado());
    }
}
