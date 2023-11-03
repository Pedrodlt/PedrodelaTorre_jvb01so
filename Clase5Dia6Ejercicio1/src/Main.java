public class Main {
    public static void main(String[] args) {
        //Creación de los tres objetos de cada clase hija
        Mamifero mamifero1 = new Mamifero(1,"Perro",7,"Peluda","omnívoro",4,"sexual","marrón","tierra");
        Ave ave1 = new Ave(1,"Águila",4,"Plumaje","Omnívoro",1.20,"Veloz","Grisáceo","triángulo");
        Reptil reptil1 = new Reptil(1,"Cocodrilo",40,"Escamas","Carnívoro",4.70,"Hexágono","Sin veneno","Tierra, agua");

        //Llamar a los métodos saludar de cada objeto
        mamifero1.saludar();
        ave1.saludar();
        reptil1.saludar();

        //PREGUNTA D: A continuación declaro un objeto de la clase hija Mamífero a la variable de tipo padre Animal, se puede hacer
        // y esto se conoce como upcasting.
        Animal animal1 = new Mamifero(4,"Mutante",129,"Pelaje","carnívoro",10,"Asexual","Multicolor","Planeta Tierra");
        //Pruebo a acceder al nombre del animal y no hay problema
        System.out.println("El animal 1 es: "+animal1.getNombre());

        //PREGUNTA E: Para esta pregunta he probado a cambiar los métodos public por private y no se puede acceder desde la
        //clase main, ya que si un método es private, solo se puede acceder desde su propia clase.

    }
}