package dev.andersonGilvan.devFoods.Modules.Food.UseCases.listAllFoodsUseCase;


import dev.andersonGilvan.devFoods.Modules.Food.DTO.ListFoodDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class ListAllFoodsController {


    private final ListAllFoodsService listAllFoodsService;

    public ListAllFoodsController(ListAllFoodsService listAllFoodsService) {
        this.listAllFoodsService = listAllFoodsService;
    }

    @GetMapping
    public List<ListFoodDTO> lisAllFoods() {

        return this.listAllFoodsService.lisAllFoods();

    }

}
