package dev.andersonGilvan.devFoods.Modules.Food.UseCases.listAllFoodsUseCase;


import dev.andersonGilvan.devFoods.Modules.Food.DTO.ListFoodDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class ListAllFoodsController {


    private final ListAllFoodsService service;

    public ListAllFoodsController(ListAllFoodsService listAllFoodsService) {
        this.service = listAllFoodsService;
    }

    @GetMapping
    public ResponseEntity<Page<ListFoodDTO>> listAllFoods(@PageableDefault(size = 10, sort = {"name"}) Pageable pagination) {
        var allFoods = this.service.lisAllFoods(pagination);

        return ResponseEntity.ok(allFoods);

    }

}
