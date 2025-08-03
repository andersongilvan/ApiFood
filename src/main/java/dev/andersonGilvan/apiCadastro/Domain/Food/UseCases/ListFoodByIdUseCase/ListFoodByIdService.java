package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.ListFoodByIdUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.ListFoodDTO;
import dev.andersonGilvan.apiCadastro.Domain.Food.Repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ListFoodByIdService {

    private FoodRepository repository;

    public ListFoodByIdService(FoodRepository repository) {
        this.repository = repository;
    }

    public ListFoodDTO getById(UUID id) {

        var food = this.repository.getReferenceById(id);

        var listFoodDTO = new ListFoodDTO(food);
        return listFoodDTO;

    }
}
