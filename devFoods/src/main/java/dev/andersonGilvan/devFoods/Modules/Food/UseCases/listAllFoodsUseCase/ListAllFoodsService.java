package dev.andersonGilvan.devFoods.Modules.Food.UseCases.listAllFoodsUseCase;


import dev.andersonGilvan.devFoods.Modules.Food.DTO.ListFoodDTO;
import dev.andersonGilvan.devFoods.Modules.Food.Repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListAllFoodsService {

    private final FoodRepository foodRepository;

    public ListAllFoodsService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<ListFoodDTO> lisAllFoods() {

        List<ListFoodDTO> foods = new ArrayList<>();

        var foodsDb = this.foodRepository.findAll();

        for (var food : foodsDb) {
            foods.add(new ListFoodDTO(food));
        }

        return foods;

    }
}
