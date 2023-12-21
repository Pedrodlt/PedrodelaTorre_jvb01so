package mapper;

import dto.InputTwoDTO;
import dto.OutputTwoDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapperTwo {
    // TODO: Implementar el método de mapeo aquí
    public static OutputTwoDTO mapInputToOutputTwo(InputTwoDTO inputTwoDTO) {
        // TODO: Mapear las propiedades de InputTwoDTO a OutputTwoDTO, incluyendo la transformación de habilidades
        // Ejemplo ficticio:
        // List<String> formattedSkills = inputDTO.getSkills().stream().map(skill -> skill.toUpperCase()).collect(Collectors.toList());
        // return new OutputDTO(inputDTO.getName(), inputDTO.getAge(), inputDTO.getOccupation(), formattedSkills);

        //Arrays.asList(inputTwoDTO.getSkills().stream().map(String::toUpperCase));
        List<String> formattedSkills = new ArrayList<>();
        for(String skill : inputTwoDTO.getSkills()){
            formattedSkills.add(skill.toUpperCase());
        }
        OutputTwoDTO outputTwoDTO = new OutputTwoDTO(inputTwoDTO.getName(), inputTwoDTO.getAge(), inputTwoDTO.getOccupation(),formattedSkills);

        return outputTwoDTO; 
    }
}
