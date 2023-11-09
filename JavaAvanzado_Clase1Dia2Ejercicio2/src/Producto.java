public class Producto {

    private String nombre;
    private Double precio;
    private int cantidadExistente;
    private int nuevaCantidad;

    public Producto(String nombre, Double precio, int cantidadExistente, int nuevaCantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadExistente = cantidadExistente;
        this.nuevaCantidad=nuevaCantidad;
    }

    public void newProducto() throws InventarioException{

        // Comprobamos el nombre
        if (nombre == null) {
            throw new InventarioException("Por favor, ingrese un nombre de producto que sea valido.");
        }
        //Comprobamos el precio
        if (precio <= 0) {
            throw new InventarioException("El precio del producto debe ser mayor que cero.");
        }
        // Comprobamos la cantidad
        if (nuevaCantidad < 0) {
            throw new InventarioException("La cantidad introducida del producto no puede ser menor que cero.");
        }

        this.cantidadExistente+=nuevaCantidad;
        System.out.println("Producto añadido con éxito.");
        System.out.println("La cantidad de "+nombre+" introducida es: "+nuevaCantidad);

        System.out.println("El inventario actual de "+nombre+" es: "+cantidadExistente);
    }
}
