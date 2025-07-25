package dev.andersonGilvan.devFoods.Modules.Food.UseCases.CreateFoodUseCase;


import dev.andersonGilvan.devFoods.Modules.Food.DTO.CreateFoodDTO;
import dev.andersonGilvan.devFoods.Modules.Food.DTO.ListFoodDTO;
import dev.andersonGilvan.devFoods.Modules.Food.Model.FoodModel;
import dev.andersonGilvan.devFoods.Modules.Food.Repository.FoodRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateFoodService {

    private final FoodRepository foodRepository;

    public CreateFoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public ListFoodDTO create(CreateFoodDTO createFoodDTO) {

        var newFood = new FoodModel(createFoodDTO);
        this.foodRepository.save(newFood);


        return new ListFoodDTO(newFood);

    }

}
