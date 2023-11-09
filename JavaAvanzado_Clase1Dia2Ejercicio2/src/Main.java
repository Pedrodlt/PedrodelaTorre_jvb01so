public class Main {
    public static void main(String[] args) {

        try {

            Producto producto1 = new Producto("Manzana", 12.0, 100,20);
            Producto producto2 = new Producto("Sandia", 24.0, 50,-40);

            producto1.newProducto();
            producto2.newProducto();

        } catch (InventarioException e) {
            System.out.println("Error al crear el producto: " + e.getMessage());
        }

    }
}