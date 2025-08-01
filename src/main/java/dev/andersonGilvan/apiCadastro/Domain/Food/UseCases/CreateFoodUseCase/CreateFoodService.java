package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.CreateFoodUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.CreateFoodDTO;
import dev.andersonGilvan.apiCadastro.Domain.Food.Model.FoodModel;
import dev.andersonGilvan.apiCadastro.Domain.Food.Repository.FoodRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateFoodService {

    private final FoodRepository repository;

    public CreateFoodService(FoodRepository repository) {
        this.repository = repository;
    }

    public void createFood(CreateFoodDTO dto) {

        var food = new FoodModel(dto);

        this.repository.save(food);

    }

}
