package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.ListAllfoodsUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.ListFoodDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class ListAllFoodsController {

    private final ListAllFoodsService service;

    public ListAllFoodsController(ListAllFoodsService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<ListFoodDTO>> listAllFoods(Pageable pageable) {

        var foods = this.service.getAll(pageable);

        return ResponseEntity.ok(foods);

    }

}
