package lib;

import dto.PersonaInputDTO;
import dto.PersonaOutputDTO;
import dto.TipoContacto;

public class PersonaBusinessLogic {
    public static void main(String[] args) {
        // Crear un objeto de entrada DTO con datos de una persona
        PersonaInputDTO inputDTOCel = new PersonaInputDTO("Zamir", "+57 300333", TipoContacto.CELULAR);
        PersonaInputDTO inputDTOEmail = new PersonaInputDTO("Jose", "zam@co", TipoContacto.EMAIL);

        // TODO: Llamar al método de negocio y mostrar el resultado en el Main
        PersonaOutputDTO outputDTOCel = procesarDatosPersona(inputDTOCel);
        PersonaOutputDTO outputDTOEmail = procesarDatosPersona(inputDTOEmail);

        // Mostrar el resultado
        System.out.println("DTO de entrada: " + inputDTOCel);
        System.out.println("DTO de salida procesado: " + outputDTOCel);
        System.out.println("DTO de entrada: " + inputDTOEmail);
        System.out.println("DTO de salida procesado: " + outputDTOEmail);
    }

    // TODO: Implementar el método de negocio aquí
    private static PersonaOutputDTO procesarDatosPersona(PersonaInputDTO inputDTO) {
        // TODO: Aplicar la lógica de negocio según los requisitos
        // Por ejemplo, para el número de contacto, extraer solo los dígitos
        // y para el tipo de contacto, validar y procesar según sea necesario.

        String contactoProcesado = "";
        // Si el tipo de contacto es celular, extraemos el numero y eliminamos el + dejando solo los numeros
        if (inputDTO.getTipoContacto() == TipoContacto.CELULAR) {
            contactoProcesado = extraerNumeroCelular(inputDTO.getContacto());
        } else if (inputDTO.getTipoContacto() == TipoContacto.EMAIL) {//Si el tipo de contacto es Email, comprobamos que tenga el @, si no lanzamos mensaje de error
            if (validarCorreoElectronico(inputDTO.getContacto())) {
                contactoProcesado = inputDTO.getContacto();
            } else {
                System.out.println("Correo electrónico no válido: " + inputDTO.getContacto());
            }
        }
        // retornamos el objeto con el nombre y el contacto segun corresponda
        return new PersonaOutputDTO(inputDTO.getNombre(), contactoProcesado);
    }

    private static String extraerNumeroCelular(String contacto) {
        // Eliminamos el prefijo y con el regex y lo remplazamos por un String vacio
        return contacto.replaceAll("[^0-9]", "");
    }

    private static boolean validarCorreoElectronico(String correo) {
        // Comprobamos que el correo no tenga el @
        return correo.contains("@");
    }
}
