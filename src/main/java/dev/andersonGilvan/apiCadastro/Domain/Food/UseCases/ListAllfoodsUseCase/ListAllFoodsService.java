package dev.andersonGilvan.apiCadastro.Domain.Food.UseCases.ListAllfoodsUseCase;


import dev.andersonGilvan.apiCadastro.Domain.Food.DTO.ListFoodDTO;
import dev.andersonGilvan.apiCadastro.Domain.Food.Repository.FoodRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListAllFoodsService {

    private final FoodRepository repository;

    public ListAllFoodsService(FoodRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Page<ListFoodDTO> getAll(Pageable pageable) {
        var foods = this.repository.findAll(pageable);

       return foods.map(ListFoodDTO::new);
    }
}
