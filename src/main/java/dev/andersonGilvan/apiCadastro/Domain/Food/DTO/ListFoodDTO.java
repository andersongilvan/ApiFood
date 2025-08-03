package dev.andersonGilvan.apiCadastro.Domain.Food.DTO;

import dev.andersonGilvan.apiCadastro.Domain.Food.Model.FoodModel;

import java.util.Optional;
import java.util.UUID;

public record ListFoodDTO(UUID id, String name, String imgUrl, String description, double price) {

    public ListFoodDTO(FoodModel food) {
        this(food.getId(), food.getName(), food.getImgUrl(), food.getDescription(), food.getPrice());
    }
}
