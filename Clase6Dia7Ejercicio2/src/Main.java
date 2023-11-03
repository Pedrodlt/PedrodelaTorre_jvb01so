import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creación de ArrayList
        ArrayList<Producto> productos = new ArrayList<Producto>();

        //Añadir al ArrayList los productos
        productos.add(new Producto(1, "Teléfono", "Samsung", "Smartphone", 250, 400, 20));
        productos.add(new Producto(2, "Laptop", "HP", "Portátil", 600, 800, 10));
        productos.add(new Producto(3, "Auriculares", "Sony", "Auriculares inalámbricos", 50, 100, 30));
        productos.add(new Producto(4, "Cargador", "Apple", "Cargador USB", 10, 20, 50));
        productos.add(new Producto(5, "Tablet", "Samsung", "Tablet Android", 120, 200, 15));
        productos.add(new Producto(6, "Impresora", "Epson", "Impresora láser", 80, 150, 8));
        productos.add(new Producto(7, "Smart TV", "LG", "Televisor inteligente", 400, 600, 12));
        productos.add(new Producto(8, "Altavoces", "Bose", "Altavoces Bluetooth", 70, 120, 25));
        productos.add(new Producto(9, "Mouse", "Logitech", "Mouse inalámbrico", 15, 30, 40));
        productos.add(new Producto(10, "Teclado", "Corsair", "Teclado mecánico", 40, 70, 20));

        //En esta parte del ejercicio, crearemos un nuevo objeto, al que le damos la primera posicion del Array
        Producto productoCaro = productos.get(0);
        //Recorremos el array y comparamos el nuevo producto con el precio de venta de los productos del array, y
        //sacamos el más caro igualandolo al producto
        for(Producto producto : productos){
            if(producto.getPrecioVenta()>productoCaro.getPrecioVenta()){
                productoCaro=producto;
            }
        }
        System.out.println("El producto mas caro es: "+productoCaro.getNombre()+" y el precio es: "+productoCaro.getPrecioVenta());

        //Producto más barato, igual que el punto anterior
        Producto productoBarato = productos.get(0);
        for(Producto producto : productos){
            if(producto.getPrecioVenta()<productoBarato.getPrecioVenta()){
                productoBarato=producto;
            }
        }
        System.out.println("El producto mas barato es: "+productoBarato.getNombre()+" y el precio es: "+productoBarato.getPrecioVenta());

        //Borrar el elemento del array en la posicion 5
        if (productos.size() > 5) {
            Producto productoBorrado = productos.remove(5);//elimina una determinada posicion del array

            System.out.println("Producto de la posicion 5 borrado: " + productoBorrado.getNombre());
        }

        //Encontar el producto con más stock de la lista
        Producto productoMasStock = productos.get(0);
        for (Producto producto : productos) {
            if (producto.getCantidadStock() > productoMasStock.getCantidadStock()) {
                productoMasStock = producto;
            }
        }
        System.out.println("El producto con más stock es: " + productoMasStock.getNombre() + " con "
                + productoMasStock.getCantidadStock() + " unidades.");

        //Descontar las unidades del stock
        productoMasStock.setCantidadStock(productoMasStock.getCantidadStock() - 3);
        System.out.println("Se han descontado 3 unidades del stock, el nuevo stock de " + productoMasStock.getNombre() +
                " es: " + productoMasStock.getCantidadStock());

    }
}