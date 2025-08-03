package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.ListAllfoodsUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.ListFoodDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class ListAllFoodsController {

    private ListAllFoodsService service;

    public ListAllFoodsController(ListAllFoodsService service) {
        this.service = service;
    }

    @GetMapping
    public List<ListFoodDTO> listAllFoods() {

        return service.getAll();

    }

}
