package mapper;

import dto.InputDTO;
import dto.OutputDTO;

public class Mapper {
    // TODO: Implementar el método de mapeo aquí
    public static OutputDTO mapInputToOutput(InputDTO inputDTO) {
        // TODO: Mapear las propiedades de InputDTO a OutputDTO
        // Ejemplo ficticio:
        // return new OutputDTO(inputDTO.getName(), inputDTO.getAge(), inputDTO.getOccupation());
        //Realizamos un if para determinar si es null
        if(inputDTO == null){
            return null;
        }
        OutputDTO outputDTO = new OutputDTO();
        //Traemos el valor y comprobamos si está vacio
        /*String name = inputDTO.getName().isEmpty() ? null : inputDTO.getName();
        String age = inputDTO.getAge()=0 ? null : inputDTO.getAge();
        String occupation = inputDTO.getOccupation().isEmpty() ? null : inputDTO.getOccupation();*/
        String name = inputDTO.getName() != null ? inputDTO.getName() : null;
        Integer age = inputDTO.getAge() != 0 ? inputDTO.getAge() : null;
        String occupation = inputDTO.getOccupation() != null ? inputDTO.getOccupation() : null;
        return new OutputDTO(name, age, occupation);

        /* MANERA SENCILLA-> creamos el nuevo constructor y seteamos los datos
        new OutputDTO(name, age, occupation);
        outputDTO.setFullName(name);
        outputDTO.setYearsOld(age);
        outputDTO.setJobTitle(occupation);
        return outputDTO; // Reemplazar con la lógica adecuada*/
    }
}
