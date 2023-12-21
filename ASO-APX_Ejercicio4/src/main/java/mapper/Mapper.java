package mapper;

import dto.ContactDTO;
import dto.RequestDTO;
import dto.ResponseDTO;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    /**
     * Mapea una lista de entrada a una lista de salida.
     *
     * @param requestDTO La solicitud de entrada que contiene los datos a mapear.
     * @return Una lista de objetos ResponseDTO mapeados desde la entrada.
     * @throws ParseException Si ocurre un error al analizar los datos.
     */
    public static List<ResponseDTO> mapListaEntradaToSalida(RequestDTO requestDTO) throws ParseException {
        // TODO: Implementar lógica de mapeo aquí
        List<ResponseDTO> listaSalida = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDataFormat("dd-MM-yy");
        int cont = 0;
        // Ejemplo de cómo podrías comenzar a implementar el mapeo
        for (ContactDTO contactDTO : requestDTO.getContact()) {
            ResponseDTO responseDTO = new ResponseDTO();
            String[]request = requestDTO.getRequest().get(cont).split(",");

            // Aquí deberías realizar el mapeo de cada propiedad desde contactDTO a responseDTO
            // por ejemplo: responseDTO.setNombre(contactDTO.getNombre());

            listaSalida.add(responseDTO);
            cont++;
        }
        return listaSalida;
    }
}
