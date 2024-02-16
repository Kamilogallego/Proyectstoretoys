package mappers;

import mappers.dtos.ToyDTO;
import entities.Toys;

public class ToyMapper {

    public ToyDTO toDTO(Toys toy) {
        ToyDTO toyDTO = new ToyDTO();
        toyDTO.setName(toy.getName());
        toyDTO.setType(toy.getType());
        toyDTO.setPrice(toy.getPrice());
        toyDTO.setQuantities(toy.getQuantities());
        return toyDTO;
    }

    public Toys toEntity(ToyDTO toyDTO) {
        Toys toy = new Toys();
        toy.setName(toyDTO.getName());
        toy.setType(toyDTO.getType());
        toy.setPrice(toyDTO.getPrice());
        toy.setQuantities(toyDTO.getQuantities());
        return toy;
    }
}