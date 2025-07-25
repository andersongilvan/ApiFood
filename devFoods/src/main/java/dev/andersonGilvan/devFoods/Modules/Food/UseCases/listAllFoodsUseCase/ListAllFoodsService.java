package dev.andersonGilvan.devFoods.Modules.Food.UseCases.listAllFoodsUseCase;


import dev.andersonGilvan.devFoods.Modules.Food.DTO.ListFoodDTO;
import dev.andersonGilvan.devFoods.Modules.Food.Repository.FoodRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;


@Service
public class ListAllFoodsService {

    private final FoodRepository foodRepository;

    public ListAllFoodsService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Page<ListFoodDTO> lisAllFoods(Pageable pagination) {

        return this.foodRepository.findAll(pagination)
                .map(ListFoodDTO::new);

    }
}
