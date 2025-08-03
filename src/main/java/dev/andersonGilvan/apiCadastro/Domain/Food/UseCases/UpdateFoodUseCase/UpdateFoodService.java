package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.UpdateFoodUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.UpdateFoodDto;
import dev.andersonGilvan.apiCadastro.Domain.Food.Repository.FoodRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UpdateFoodService {

    private FoodRepository repository;

    public UpdateFoodService(FoodRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void update(UUID id, UpdateFoodDto dto) {

        var food = this.repository.getReferenceById(id);

        food.UpdateFood(dto);

    }
}
