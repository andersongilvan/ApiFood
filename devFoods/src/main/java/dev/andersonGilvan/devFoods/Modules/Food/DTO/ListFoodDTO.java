package dev.andersonGilvan.devFoods.Modules.Food.DTO;

import dev.andersonGilvan.devFoods.Modules.Food.Model.FoodModel;

public record ListFoodDTO(Long id, String name, String imgUrl, String description, double price) {

    public ListFoodDTO(FoodModel foodModel) {

        this(
                foodModel.getId(),
                foodModel.getName(),
                foodModel.getImgUrl(),
                foodModel.getDescription(),
                foodModel.getPrice()
        );

    }

}
