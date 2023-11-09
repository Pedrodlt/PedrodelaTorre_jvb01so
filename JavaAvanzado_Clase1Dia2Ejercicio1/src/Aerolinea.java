import java.time.LocalDate;

public class Aerolinea {

    private String nombre;
    private String destino;
    private LocalDate fechaViaje;
    private int numAsientos;
    private int asitentosDisponibles;

    public Aerolinea(String nombre, String destino, LocalDate fechaViaje, int numAsientos, int asitentosDisponibles) throws ReservaInvalidaException {

        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.numAsientos = numAsientos;
        this.asitentosDisponibles = asitentosDisponibles;
    }

    public void reservaVuelo() throws ReservaInvalidaException{

            // Validamos los datos introducidos
            if (nombre == null || destino == null || fechaViaje == null || numAsientos <= 0) {
                throw new ReservaInvalidaException("Faltan datos, introduzca todos los datos de la reserva.");
            }
            // Validamos si la fecha de reserva es posterior al dia de hoy
            if(fechaViaje.isBefore(LocalDate.now())){
            throw new ReservaInvalidaException("La fecha de reserva de vuelo no puede ser anterior al dia de hoy");
            }
            // Validamos que los asientos solicitados sean menores que los disponibles
            if (numAsientos > asitentosDisponibles) {
                throw new ReservaInvalidaException("No hay suficinetes asientos disponibles.");
            }else{
                System.out.println("¡Reserva realizada con éxito. Gracias por volar con nosotros!");
                System.out.println("Datos Rerva-> Nombre: "+nombre+" Destino: "+destino+" Fecha de viaje: "+fechaViaje+ " Número de asientos: "+numAsientos);
            }
    }
}
