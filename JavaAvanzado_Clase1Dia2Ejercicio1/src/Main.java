import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws ReservaInvalidaException {

        Aerolinea reserva1 = new Aerolinea("Pedro","Canarias", LocalDate.of(2023,11,13),2,5);
        try{
            reserva1.reservaVuelo();
        } catch (ReservaInvalidaException e) {
            System.out.println("Error en la reserva: "+e.getMessage());
        }
    }
}