package dev.andersonGilvan.devFoods.Modules.Food.UseCases.CreateFoodUseCase;


import dev.andersonGilvan.devFoods.Modules.Food.DTO.CreateFoodDTO;
import dev.andersonGilvan.devFoods.Modules.Food.Model.FoodModel;
import dev.andersonGilvan.devFoods.Modules.Food.Repository.FoodRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateFoodService {

    private final FoodRepository foodRepository;

    public CreateFoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public void create(CreateFoodDTO createFoodDTO) {

        this.foodRepository.save(new FoodModel(createFoodDTO));

    }

}
