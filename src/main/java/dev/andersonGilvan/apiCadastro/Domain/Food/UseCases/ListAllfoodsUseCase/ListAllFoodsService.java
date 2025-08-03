package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.ListAllfoodsUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.ListFoodDTO;
import dev.andersonGilvan.apiCadastro.Domain.Food.Repository.FoodRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListAllFoodsService {

    private FoodRepository repository;

    public ListAllFoodsService(FoodRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public List<ListFoodDTO> getAll() {
        var foods = this.repository.findAll();

        List<ListFoodDTO> foodDTOS = new ArrayList<>();

        for (var food : foods) {
            var foodDto = new ListFoodDTO(food);

            foodDTOS.add(foodDto);
        }

        return foodDTOS;
    }
}
