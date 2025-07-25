package dev.andersonGilvan.devFoods.Modules.Food.UseCases.UpdateFoodUseCase;


import dev.andersonGilvan.devFoods.Modules.Food.DTO.ListFoodDTO;
import dev.andersonGilvan.devFoods.Modules.Food.DTO.UpdateFoodDTO;
import dev.andersonGilvan.devFoods.Modules.Food.Repository.FoodRepository;
import org.springframework.stereotype.Service;

@Service
public class UpdateFoodService {

    private final FoodRepository repository;

    public UpdateFoodService(FoodRepository repository) {
        this.repository = repository;
    }

    public ListFoodDTO update(UpdateFoodDTO dto) {

        System.out.println(dto);

        var food = this.repository.getReferenceById(dto.id());

        food.updateFood(dto);

        return new ListFoodDTO(food.getId(), food.getName(), food.getImgUrl(), food.getDescription(), food.getPrice());

    }
}
