public class Animal {

    private int id;
    private String nombre;
    private int edad;
    private String piel;
    private String alimentacion;

    public Animal(int id, String nombre, int edad, String piel, String alimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.piel = piel;
        this.alimentacion = alimentacion;
    }

    public void saludar (){
        System.out.println("Hola, soy un animal");
    }

    public String getNombre() {
        return nombre;
    }
}
